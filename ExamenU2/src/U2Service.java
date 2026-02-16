public class U2Service {

    public static boolean esPrecioValido(double p) {
        // válido si p > 0
        return p>0; // TODO
    }

    public static double calcularSubtotal(double subtotalActual, double precio) {
        return subtotalActual+precio; // TODO
    }

    public static double calcularDescuento(double subtotal, int metodoPago) {
        double resultado = 0;
        // >=500 y efectivo (1): 8%
        // >=500 y tarjeta (2): 5%
        // <500: 0
        if (subtotal>=500){
            if (metodoPago == 1){
                resultado = subtotal * .08;
            }else if (metodoPago == 2){
                resultado = subtotal * .05;
            }
        }
        return resultado; // TODO
    }

    public static double calcularTotal(double subtotal, double descuento) {
        return subtotal-descuento; // TODO
    }
    public static boolean validarMetodoPago(int metodo){
        return (metodo==1 || metodo==2);
    }
}
