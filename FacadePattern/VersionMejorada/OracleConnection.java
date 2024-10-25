package VersionMejorada;

public class OracleConnection implements DatabaseConnection {

    @Override
    public void connect() {
        System.out.println("Connecting to Oracle database...");
        // Simular lógica de conexión a Oracle
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from Oracle database...");
        // Simular lógica de desconexión de Oracle
    }
}
