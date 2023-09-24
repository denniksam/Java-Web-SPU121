package step.learning.ioc;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class ListenConfig extends GuiceServletContextListener {
    @Override
    protected Injector getInjector() {
        return Guice.createInjector(
                new ServletConfig(),  // модуль конфігурації фільтрів та сервлетів
                new ServiceConfig(),  // модуль налаштування служб
                new LoggingConfig()   // модуль налаштування логера
        ) ;
    }
}
