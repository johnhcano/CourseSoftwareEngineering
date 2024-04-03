public class Efectivo extends Pago{

    private double cantidad;

    public Efectivo(double subTotal, double propina, double impuestos, double cantidad) {
        super(subTotal, propina, impuestos);
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public double calculoTotal() {
        return getSubTotal() + getPropina();
    }

}
