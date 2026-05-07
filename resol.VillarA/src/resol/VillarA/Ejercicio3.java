package resol.VillarA;
import java.util.Scanner;
public class Ejercicio3 {
public static void ejercicio3() {
    Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.nextLine().charAt(0);

        buscarCaracter(texto, caracter);
    }

    public static void buscarCaracter(String texto, char caracter) {

        texto = texto.toLowerCase();
        caracter = Character.toLowerCase(caracter);

        int contador = 0;

        System.out.println("Posiciones encontradas:");

        for (int i = 0; i < texto.length(); i++) {

            if (texto.charAt(i) == caracter) {

                System.out.println("Índice: " + i);
                contador++;
            }
        }

        double porcentaje = ((double) contador / texto.length()) * 100;

        System.out.printf(
                "La letra '%c' representa el %.2f%% del texto.%n",
                caracter,
                porcentaje
        );
        
    }
}
