package VersionMejorada;

public class DatabaseFacade {

    private DatabaseConnection mySQLConnection;
    private DatabaseConnection postgreSQLConnection;
    private DatabaseConnection oracleConnection;

    public DatabaseFacade() {
        mySQLConnection = new MySQLConnection();
        postgreSQLConnection = new PostgreSQLConnection();
        oracleConnection = new OracleConnection();
    }

    public void connectToMySQL() {
        mySQLConnection.connect();
    }

    public void connectToPostgreSQL() {
        postgreSQLConnection.connect();
    }

    public void connectToOracle() {
        oracleConnection.connect();
    }

    public void closeAllConnections() {
        mySQLConnection.disconnect();
        postgreSQLConnection.disconnect();
        oracleConnection.disconnect();
    }
}
