public class Nomina {

    private Trabajador[] trabajador;

    public Nomina(Trabajador[] trabajador){
        this.trabajador = trabajador;
    }

    public void generarPagos(){
        for(int i = 0; i < trabajador.length; i++){
            System.out.println(" Pago generado: " + trabajador[i].pagar());
        }
    }
}
