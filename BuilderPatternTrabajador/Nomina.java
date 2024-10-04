public class Nomina {

    private int id;
    private String nombre;
    private Trabajador trabajador;

    public Nomina(int id, String nombre, Trabajador trabajador){
        this.id = id;
        this.nombre = nombre;
        this.trabajador = trabajador;
    }
    
    public void generarPagos(Trabajador[] t){
        for(int i = 0; i < t.length; i++){
            System.out.println("id:" + id + " Nombre: " + nombre + " Pago generado: " + trabajador.pagar());
        }
    }
}
