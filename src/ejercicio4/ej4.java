package ejercicio4;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        /*
        Ejercicio Nº 4
        Un habitante de un pequeño pueblo se enteró por los medios de comunicación que es el ganador de la lotería de su país. El premio total es de $23.563.899, sin embargo, a este monto se debe aplicar una serie de impuestos para poder otorgar el premio final. Entre estos descuentos por impuestos se encuentran:
            Impuesto 1 → 2,45% sobre el valor total
            Impuesto 2 → 15% sobre el valor total
            Impuesto 3 → 3% sobre el valor total
        Realizar un programa que le permita a cualquier ciudadano la posibilidad de ingresar el monto en bruto del premio y calcular a partir de él, el monto total que le corresponde como premio según los descuentos. Tener en cuenta que todos los porcentajes de descuento se calculan SOBRE EL VALOR TOTAL.
         */

        System.out.println("Ingrese el monto total de su premio para calcular el descuento por impuestos");

        Scanner teclado = new Scanner(System.in);
        double premio = teclado.nextDouble();
        double descPorImp = ((premio * 0.0245) + (premio * 0.15) + (premio * 0.03));
        double totalConDesc = premio - descPorImp;

        System.out.printf("Del monto: $ %.3f", premio);
        System.out.printf(", descontando: $ %.3f", descPorImp);
        System.out.printf(" de impuestos, le corresponden: $ %.3f", totalConDesc);

        //23563899
    }
}
