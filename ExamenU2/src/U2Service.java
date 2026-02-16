public class U2Service {

    public static boolean esPrecioValido(double p) {
        if(p>0) {
            // válido si p > 0
            return true; // TODO
        }else{
            return false;
        }
    }

    public static double calcularSubtotal(double subtotalActual, double precio) {

        subtotalActual=subtotalActual+precio;
        return subtotalActual; // TODO
    }


    public static double calcularDescuento(double subtotal, int metodoPago) {
        if(subtotal<500){
            return 0;
        }else if(metodoPago==1){
            return subtotal*0.08;
        }else{
            return subtotal*0.05;
        }
        // >=500 y efectivo (1): 8%
        // >=500 y tarjeta (2): 5%
        // <500: 0
    }

    public static double calcularTotal(double subtotal, double descuento) {

        return subtotal-descuento; // TODO
    }

    public static double solo_dos_decimales(double total){
        //perdone el chorizote que hice aqui, no recordaba el metodo para redondear asi que
        //se me ocurrio esto jajaj

        int tot_sin_decimal = (int) total;
        double solo_decimales = total - tot_sin_decimal;
        solo_decimales = solo_decimales*100;
        int dos_digitos = (int)solo_decimales;
        double dos_decimales = (double)dos_digitos/100;
        double total_final = (double)tot_sin_decimal+dos_decimales;
        return total_final;

    }
}
