package VersionMejorada;

public class EjecutarVersionMejoradaFacade {
    
    DatabaseFacade dbFacade = new DatabaseFacade();

    // Conectar a diferentes bases de datos
    dbFacade.connectToMySQL();
    dbFacade.connectToPostgreSQL();
    dbFacade.connectToOracle();

    // Desconectar de todas las bases de datos
    dbFacade.closeAllConnections(); 
}
