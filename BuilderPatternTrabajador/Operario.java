public class Operario extends Trabajador {
    
    private double horas;
    private final double VALOR_HORA = 5500.0; //Constante

    public Operario(double horas){
        this.horas = horas;
    }

    public double pagar(){
        return horas * VALOR_HORA;
    }
}
