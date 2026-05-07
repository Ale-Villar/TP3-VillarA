package resol.VillarA;
import java.util.Scanner;
import java.util.Random;
public class Ejercicio2 {
    public static void ejercicio2() {
      Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
         System.out.print("Ingrese el tamaño de la matriz NxN: ");
        int n = scanner.nextInt();
        int[][] matriz = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(100) + 1;
            }
        }

        mostrarMatriz(matriz);

        int sumaPrincipal = sumarDiagonalPrincipal(matriz);
        int sumaSecundaria = sumarDiagonalSecundaria(matriz);

        System.out.println("Suma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);

        int mayor = Math.max(sumaPrincipal, sumaSecundaria);

        System.out.println("La suma mayor es: " + mayor);
    }

    public static void mostrarMatriz(int[][] matriz) {

        System.out.println("\nMatriz:");

        for (int[] fila : matriz) {

            for (int valor : fila) {

                System.out.printf("%4d", valor);
            }

            System.out.println();
        }
    }

    public static int sumarDiagonalPrincipal(int[][] matriz) {

        int suma = 0;

        for (int i = 0; i < matriz.length; i++) {

            suma += matriz[i][i];
        }

        return suma;
    }

    public static int sumarDiagonalSecundaria(int[][] matriz) {

        int suma = 0;
        int n = matriz.length;

        for (int i = 0; i < n; i++) {

            suma += matriz[i][n - 1 - i];
        }

        return suma;
    }
}
