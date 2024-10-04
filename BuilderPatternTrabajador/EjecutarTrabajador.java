public class EjecutarTrabajador {
    
    //Creación de los objetos
    Trabajador[] t = new Trabajador[3];

    Trabajador objT1 = new Consultor(1.25, 3000000.0);
    Trabajador objT2 = new Operario(192);
    Trabajador objT3 = new Gerente(12000000.0);

    Nomina objNomina1 = new Nomina(1, "Juan", objT1);
    Nomina objNomina2 = new Nomina(2, "Pedro", objT2);
    Nomina objNomina3 = new Nomina(3, "Judas", objT3);

    

}
