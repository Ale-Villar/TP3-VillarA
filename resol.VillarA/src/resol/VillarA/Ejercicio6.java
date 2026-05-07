package resol.VillarA;
import java.util.Scanner;
public class Ejercicio6 {
    public static void ejercicio6() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un mensaje: ");
        String mensaje = scanner.nextLine();

        System.out.print("Ingrese el desplazamiento: ");
        int desplazamiento = scanner.nextInt();

        String cifrado = cifrarCesar(mensaje, desplazamiento);

        System.out.println("Mensaje cifrado: " + cifrado);
    }

    public static String cifrarCesar(String texto, int desplazamiento) {

        String resultado = "";

        desplazamiento = desplazamiento % 26;

        for (int i = 0; i < texto.length(); i++) {

            char caracter = texto.charAt(i);

            if (Character.isLowerCase(caracter)) {

                char nuevo = (char) (((caracter - 'a' + desplazamiento) % 26) + 'a');

                resultado += nuevo;

            } else if (Character.isUpperCase(caracter)) {

                char nuevo = (char) (((caracter - 'A' + desplazamiento) % 26) + 'A');

                resultado += nuevo;

            } else {

                resultado += caracter;
            }
        }

        return resultado;
    }
}
