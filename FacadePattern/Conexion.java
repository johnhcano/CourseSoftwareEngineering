public class Conexion {

    private String user;
    private String pass;
    private String cadenaConexion;

    public Conexion(String user, String pass, String cadenaConexion){
        this.user = user;
        this.pass = pass;
        this.cadenaConexion = cadenaConexion;
    }

    public boolean conectar(String u, String p, String puerto){
        boolean flag = false;
        if(this.user.equals(u) && this.pass.equals(p)){
            flag = true;
        }
        return flag;
    }

    public String toString(){
        return "Conexion[ Usuario:" + user + " Pass:" + pass + " cadenaConexión:" + cadenaConexion;
    }
}