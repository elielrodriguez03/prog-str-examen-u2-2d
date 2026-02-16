public class U2Service {

    public static boolean esPrecioValido(double p) {
        return p >= 0;
    }

    public static double calcularSubtotal(double subtotalActual, double precio) {
        return subtotalActual + precio;
    }

    public static double calcularDescuento(double subtotal, int metodoPago) {

        if (subtotal >= 500) {
            // efectivo
            if (metodoPago == 1) {

                return subtotal * 0.08;
            }
            // tarjeta
            if (metodoPago == 2) {
                return subtotal * 0.05;
            }
        }

        return 0.0;
    }

    public static double calcularTotal(double subtotal, double descuento) {
        return subtotal - descuento;
    }
}
