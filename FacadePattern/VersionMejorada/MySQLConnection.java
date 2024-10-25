package VersionMejorada;

public class MySQLConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
        // Simular lógica de conexión a MySQL
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
        // Simular lógica de desconexión de MySQL
    }
}