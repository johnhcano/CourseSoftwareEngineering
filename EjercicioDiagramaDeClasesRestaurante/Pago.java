public class Pago {

    private double subTotal;
    private double propina;
    private double impuestos;

    public Pago(double subTotal, double propina, double impuestos) {
        this.subTotal = subTotal;
        this.propina = propina;
        this.impuestos = impuestos;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public double getPropina() {
        return propina;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public double calculoTotal() {
        return 0.0;
    }
}
