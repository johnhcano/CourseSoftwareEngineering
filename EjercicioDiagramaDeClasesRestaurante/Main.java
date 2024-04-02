public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Juan", 1, 4);
        Platillo platillo = new Platillo(2, "Tacos");
        Bebida bebida = new Bebida(2, "Cervezas");

        //Ejemplo 1: el cliente va a pagar con crédito

        Pago pago1 = new Credito(100, 10, 16, "123456789", "Visa", "Banamex");

        //Ejemplo 2: el cliente va a pagar con efectivo

        Pago pago2 = new Efectivo(100, 10, 16, 200);

        // El cliente paga con Crédito.
        Orden orden1 = new Orden(cliente, 13, "Pedro", pago1);
        System.out.println(orden1.pedido(bebida, platillo));
        System.out.println(orden1);
        System.out.println("Total a pagar: " + pago1.calculoTotal());

        // El cliente paga con Efectivo.
        Orden orden2 = new Orden(cliente, 13, "Pedro", pago2);
        System.out.println(orden2.pedido(bebida, platillo));
        System.out.println(orden2);
        System.out.println("Total a pagar: " + pago2.calculoTotal());

    }
}