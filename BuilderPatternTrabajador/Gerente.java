public class Gerente extends Trabajador{
    
    private double salarioIntegral;

    public Gerente(double salarioIntegral){
        this.salarioIntegral = salarioIntegral;
    }

    public double pagar(){
        return salarioIntegral;
    }
}
