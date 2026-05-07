package resol.VillarA;
import java.util.Scanner;
public class Ejercicio5 {
    public static void ejercicio5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {

            System.out.println("El número debe ser positivo.");
            return;
        }

        String binario = convertirABinario(numero);

        System.out.println("Número en binario: " + binario);
    }

    public static String convertirABinario(int decimal) {

        if (decimal == 0) {
            return "0";
        }

        String binario = "";

        while (decimal > 0) {

            int resto = decimal % 2;

            binario = resto + binario;

            decimal = decimal / 2;
        }

        return binario;
    }
}
