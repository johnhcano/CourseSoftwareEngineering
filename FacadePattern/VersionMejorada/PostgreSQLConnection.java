package VersionMejorada;

public class PostgreSQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
        // Simular lógica de conexión a PostgreSQL
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
        // Simular lógica de desconexión de PostgreSQL
    }
}