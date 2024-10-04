public class Gerente {
    
    private int id;
    private String nombre;
    private double salarioIntegral;

    public Gerente(int id, String nombre, double salarioIntegral){
        this.id = id;
        this.nombre = nombre;
        this.salarioIntegral = salarioIntegral;
    }

    public double pagar(){
        return salarioIntegral;
    }
}
