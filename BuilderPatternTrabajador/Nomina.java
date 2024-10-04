public class Nomina {

    private Trabajador trabajador;

    public Nomina(Trabajador trabajador){
        this.trabajador = trabajador;
    }

    public void generarPagos(Trabajador[] t){
        for(int i = 0; i < t.length; i++){
            System.out.println(" Pago generado: " + trabajador.pagar());
        }
    }
}
