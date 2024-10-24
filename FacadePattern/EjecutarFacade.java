public class EjecutarFacade {
    public static void main(String[] args) {
        
        Conexion objConexionMySQL; 
        objConexionMySQL = new MySQL("athena", "12345", "http://localhost", "3306");

        Conexion objConexionOracle;
        objConexionOracle = new Oracle("scoot", "tiger", "apex", "8080");

        Proyecto objProyecto1 = new Proyecto("Flask", 1, objConexionMySQL);

        Proyecto objPoryecto2 = new Proyecto("Aplicación Web", 10, objConexionOracle);
        
    }
    
}
