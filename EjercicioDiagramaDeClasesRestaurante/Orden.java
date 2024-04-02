public class Orden {

    private Cliente cliente;
    private int hora;
    private String mesero;
    private Pago pago;

    public Orden(Cliente cliente, int hora, String mesero, Pago pago) {
        this.cliente = cliente;
        this.hora = hora;
        this.mesero = mesero;
        this.pago = pago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public int getHora() {
        return hora;
    }

    public String getMesero() {
        return mesero;
    }

    public Pago getPago() {
        return pago;
    }

    public String pedido(Bebida bebida, Platillo platillo) {
        return cliente + " pidió " + bebida + " y " + platillo;
    }

    public String toString() {
        return cliente + " a las " + hora + " con mesero " + mesero + " pagó con " + pago;
    }



}
