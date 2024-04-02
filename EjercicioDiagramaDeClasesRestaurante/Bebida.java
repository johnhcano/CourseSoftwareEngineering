public class Bebida {
    private int cantidad;
    private String tipo;

    public Bebida(int cantidad, String tipo) {
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public String toString() {
        return cantidad + " " + tipo;
    }
}
