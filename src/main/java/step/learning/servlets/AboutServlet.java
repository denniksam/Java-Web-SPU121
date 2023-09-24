package step.learning.servlets;

import com.google.inject.Singleton;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// @WebServlet("/about")  // route - шлях (запит) до якого прив'язується сервлет
@Singleton
public class AboutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ~ return View() -- підключаємо _layout та передаємо йому відомості про @body

        // вказуємо яке тіло потрібне для шаблону (для даного запиту /about)
        req.setAttribute( "pageBody", "about.jsp" ) ;

        // передаємо "управління" до файлу WEB-INF/_layout.jsp
        req.getRequestDispatcher( "WEB-INF/_layout.jsp" )
                .forward( req, resp ) ;
    }
}
