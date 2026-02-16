public class U2Service {

    public static boolean esPrecioValido(double p) {
        return p > 0;
    }

    public static double calcularSubtotal(double subtotalActual, double precio) {
        return subtotalActual + precio;
    }

    public static double calcularDescuento(double subtotal, int metodoPago) {
        double descuento = 0.0;

        if (subtotal >= 500) {
            if (metodoPago == 1) {
                descuento = subtotal * 0.08;
            } else if (metodoPago == 2) {
                descuento = subtotal * 0.05;
            }
        }

        return descuento;
    }

    public static double calcularTotal(double subtotal, double descuento) {
        return subtotal - descuento;
    }
}