public class EjecutarFacade {
    public static void main(String[] args) {
        
        Conexion objConexionMySQL; 
        objConexionMySQL = new MySQL("athena", "12345", "http://localhost", "3306");

        Conexion objConexionOracle;
        objConexionOracle = new Oracle("scoot", "tiger", "apex", "8080");
    }
    
}
