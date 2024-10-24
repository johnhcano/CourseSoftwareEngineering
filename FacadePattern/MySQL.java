public class MySQL extends Conexion{

    private String puerto;

    public MySQL(String user, String pass, String cadenaConexion, String puerto){
        super(user, pass, cadenaConexion);
        this.puerto = puerto;
    }
    
}
