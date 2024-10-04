public class Consultor extends Trabajador {

    private double comision;
    private double venta;

    public Consultor(double comision, double venta){
        this.comision = comision;
        this.venta = venta;
    }

    public double pagar(){
        return comision * venta;
    }
}