public class Operario extends Trabajador {
    
    private double horas;
    private final double VALOR_HORA = 5500.0;

    public Operario(int id, String nombre, double horas){
        this.id = id;
        this.nombre = nombre;
        this.horas = horas;
    }

    public double pagar(){
        return horas * VALOR_HORA;
    }
}
