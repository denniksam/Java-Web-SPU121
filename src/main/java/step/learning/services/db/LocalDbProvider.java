package step.learning.services.db;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Objects;

public class LocalDbProvider implements DbProvider {
    private Connection connection ;
    @Override
    public Connection getConnection() {
        if( connection == null ) {
            try( InputStreamReader jsonReader = new InputStreamReader(
                    Objects.requireNonNull( this
                            .getClass()
                            .getClassLoader()
                            .getResourceAsStream("dblocal.json"))))
            {
                JsonObject config =
                        JsonParser
                                .parseReader( jsonReader )
                                .getAsJsonObject() ;
                Class.forName("com.mysql.cj.jdbc.Driver" ) ;
                connection = DriverManager.getConnection(
                        config.get( "url" ).getAsString(),
                        config.get( "user" ).getAsString(),
                        config.get( "password" ).getAsString()
                ) ;
            }
            catch( Exception ex ) {
                System.err.println( ex.getMessage() ) ;
            }
        }
        return connection;
    }
}
