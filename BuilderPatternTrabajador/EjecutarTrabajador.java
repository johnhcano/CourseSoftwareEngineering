public class EjecutarTrabajador {
    
    public static void main(String[] args) {
        
    //Creación de los objetos

    Trabajador objT1 = new Consultor(0.25, 3000000.0);
    Trabajador objT2 = new Operario(192);
    Trabajador objT3 = new Gerente(12000000.0);


    Trabajador[] t = new Trabajador[3];

    t[0] = objT1;
    t[1] = objT2;
    t[2] = objT3;

    Nomina objNomina1 = new Nomina(t);

    objNomina1.generarPagos();

    }
}
