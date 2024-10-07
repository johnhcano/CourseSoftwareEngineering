public class EjecutarTrabajador {
    
    public static void main(String[] args) {
        
    //Creación de los objetos

    Trabajador objT1 = new Consultor(0.25, 3000000.0);
    Trabajador objT2 = new Operario(192);
    Trabajador objT3 = new Gerente(1200000.0);
    Trabajador objT4 = new Analista(500000.0, 200);

    //Creación del arreglo para guardar en cada posición los trabajadores creados anteriormente 
    Trabajador[] t = new Trabajador[4];

    t[0] = objT1;
    t[1] = objT2;
    t[2] = objT3;
    t[4] = objT4;

    Nomina objNomina1 = new Nomina(t);

    objNomina1.generarPagos();

    }
}
