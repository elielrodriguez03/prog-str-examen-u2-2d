public class U2Service {

    public static boolean esPrecioValido(double p) {
        // válido si p > 0
        if (p > 0) {
        }
        return true; // TODO
    }

    public static double calcularSubtotal(double subtotalActual, double precio) {
        subtotalActual=subtotalActual+precio;
        return subtotalActual; // TODO
    }

    public static double calcularDescuento(double subtotal, int metodoPago) {
        // >=500 y efectivo (1): 8%
        // >=500 y tarjeta (2): 5%
        // <500: 0
        if (subtotal>=500 && metodoPago==1){
            subtotal=subtotal*0.92;

        } else if (subtotal>=500 && metodoPago==2) {
            subtotal=subtotal*0.95;
        } else if (subtotal<500) {
            subtotal=subtotal*1;

        }
        return subtotal; // TODO
    }

    public static double calcularTotal(double subtotal, double descuento) {

        return descuento; // TODO
    }
}
