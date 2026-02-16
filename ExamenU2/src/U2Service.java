public class U2Service {

    public static boolean esPrecioValido(double p) {
        // válido si p > 0
        if(p == 0 || p <= 0){
            return false;
        }
        return true; // TODO

    }

    public static double calcularSubtotal(double subtotalActual, double precio) {
        return subtotalActual + precio; // TODO
    }

    public static double calcularDescuento(double subtotal, int metodoPago) {
        // >=500 y efectivo (1): 8%
        // >=500 y tarjeta (2): 5%
        // <500: 0

        if(subtotal >= 500){
            if(metodoPago==1){
                return subtotal * 0.08;
            }
            else if(metodoPago == 2){
                return subtotal * 0.05;
            }
        
        }
        else if(subtotal < 500){
            return 0.0;
        }
        return 0.0; // TODO
    }

    public static double calcularTotal(double subtotal, double descuento) {

        return subtotal - descuento; // TODO
    }
}
