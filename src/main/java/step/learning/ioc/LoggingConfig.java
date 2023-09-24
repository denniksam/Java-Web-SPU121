package step.learning.ioc;

import com.google.inject.AbstractModule;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.LogManager;

/**
 * Конфігурація логера
 */
public class LoggingConfig extends AbstractModule {
    @Override
    protected void configure() {
        // Guice конфігурує логер сам, тому для наших налаштувань
        // - скидаємо наявні налаштування
        // - підставляємо свої
        try( InputStream resourceStream = this.getClass().getClassLoader()
                .getResourceAsStream("logging.properties") ) {
            LogManager logManager = LogManager.getLogManager() ;  // менеджер логування
            logManager.reset() ;  // - скидаємо наявні налаштування
            logManager.readConfiguration( resourceStream ) ;  // - підставляємо свої
        }
        catch( IOException ex ) {
            System.err.println( "Logger config error: " + ex.getMessage() ) ;
        }
    }
}
