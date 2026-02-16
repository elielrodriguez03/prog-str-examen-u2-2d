public class U2Service {

    public static boolean esPrecioValido(double p) {
        // válido si p > 0
        if(p < 0){
            return false;
        }
        return true; // TODO

    }

    public static double calcularSubtotal(double subtotalActual, double precio) {
        return subtotalActual + precio; // TODO
    }

    public static double calcularDescuento(double subtotal, int metodoPago) {


        if(subtotal > 499){
            if(metodoPago==1){
                return subtotal * 0.08;
            }
            if(metodoPago == 2){
                return subtotal * 0.05;
            }

        }
        else if(subtotal < 500){
            return 0;
        }
        return 0.0; // TODO
    }

    public static double calcularTotal(double subtotal, double descuento) {

        return subtotal - (subtotal*descuento); // TODO
    }
}