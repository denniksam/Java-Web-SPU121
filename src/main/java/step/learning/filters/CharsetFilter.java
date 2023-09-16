package step.learning.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class CharsetFilter implements Filter {
    private FilterConfig filterConfig ;

    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig ;
    }

    public void doFilter(   // !! на етапі фільтру req|resp не НТТР
            ServletRequest servletRequest,
            ServletResponse servletResponse,
            FilterChain filterChain)
            throws IOException, ServletException {
        // реально об'єкти є НТТР-версіями, але через їх тип можуть бути
        // недоступні окремі методи. Рекомендується перетворити їх перед роботою
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        req.setCharacterEncoding( StandardCharsets.UTF_8.name() ) ;
        resp.setCharacterEncoding( StandardCharsets.UTF_8.name() ) ;

        // дані з фільтру можна передати далі по ланці у т.ч. до сервлетів і JSP через
        // атрибути запиту
        req.setAttribute( "charset", StandardCharsets.UTF_8.name() ) ;

        // прямий та зворотний хід розділяється інструкцією передачі ланцюга
        filterChain.doFilter( req, resp ) ;
        // після завершення роботи ланцюга - зворотний хід
    }

    public void destroy() {
        this.filterConfig = null ;
    }
}
