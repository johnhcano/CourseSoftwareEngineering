public class Cliente {
    private String nombre;
    private int mesa;
    private int numeroPersonas;

    public Cliente(String nombre, int mesa, int numeroPersonas) {
        this.nombre = nombre;
        this.mesa = mesa;
        this.numeroPersonas = numeroPersonas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMesa() {
        return mesa;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public String toString() {
        return "Cliente: " + nombre + " en mesa " + mesa + " con " + numeroPersonas + " personas";
    }
}
