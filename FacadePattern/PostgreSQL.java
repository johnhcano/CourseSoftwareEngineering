public class PostgreSQL extends Conexion{

    private String puerto;

    public PostgreSQL(String user, String pass, String cadenaConexion, String puerto){
        super(user, pass, cadenaConexion);
        this.puerto = puerto;
    }
    
}
