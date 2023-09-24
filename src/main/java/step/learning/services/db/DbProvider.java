package step.learning.services.db;

import java.sql.Connection;

public interface DbProvider {
    Connection getConnection() ;
}
