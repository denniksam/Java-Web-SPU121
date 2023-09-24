package step.learning.ioc;

import com.google.inject.servlet.ServletModule;
import step.learning.filters.*;
import step.learning.servlets.*;

public class ServletConfig extends ServletModule {
    @Override
    protected void configureServlets() {
        // Модуль - конфігурація IoC, тут реєструємо фільтри
        filter( "/*" ).through( CharsetFilter.class ) ;
        filter( "/*" ).through( DbFilter.class ) ;

        // ... та сервлети
        serve( "/"       ).with( IndexServlet.class  ) ;
        serve( "/about"  ).with( AboutServlet.class  ) ;
        serve( "/filter" ).with( FilterServlet.class ) ;
        serve( "/ioc"    ).with( IocServlet.class    ) ;
    }
}
