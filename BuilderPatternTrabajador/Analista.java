public class Analista extends Trabajador {
    
    private double salarioIntegral;
    private double lineasCodigo;
    private final double VALOR_LINEA_JAVA = 1000;
    
    public Analista(double salarioIntegral, double lineasCodigo) {
        this.salarioIntegral = salarioIntegral;
        this.lineasCodigo = lineasCodigo;
    }

    public double pagar(){
        return salarioIntegral * (lineasCodigo * VALOR_LINEA_JAVA);
    }
    
}
