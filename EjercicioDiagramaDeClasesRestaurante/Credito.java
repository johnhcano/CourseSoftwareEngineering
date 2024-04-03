public class Credito extends Pago {

    private String numeroTarjeta;
    private String tipoTarjeta;
    private String banco;

    public Credito(double subTotal, double propina, double impuestos, String numeroTarjeta, String tipoTarjeta, String banco) {
        super(subTotal, propina, impuestos);
        this.numeroTarjeta = numeroTarjeta;
        this.tipoTarjeta = tipoTarjeta;
        this.banco = banco;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public double calculoTotal() {
        return getSubTotal() + getPropina() + getImpuestos();
    }

}
