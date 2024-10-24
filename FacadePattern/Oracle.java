public class Oracle extends Conexion{

    private String puerto;

    public Oracle(String user, String pass, String cadenaConexion, String puerto){
        super(user, pass, cadenaConexion);
        this.puerto = puerto;
    }
    
}