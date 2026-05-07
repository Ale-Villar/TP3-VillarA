package resol.VillarA;

import java.util.Scanner;

public class Ejercicio1 {

    public static void ejercicio1() {

        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1) + ":");
            numeros[i] = scanner.nextInt();
        }

        double promedio = calcularPromedioPrimos(numeros);

        System.out.println("El promedio de los números primos es: " + promedio);
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {

        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {

            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Método para calcular promedio de primos
    public static double calcularPromedioPrimos(int[] numeros) {

        int sumaPrimos = 0;
        int contadorPrimos = 0;

        for (int numero : numeros) {

            if (esPrimo(numero)) {
                sumaPrimos += numero;
                contadorPrimos++;
            }
        }

        if (contadorPrimos > 0) {
            return (double) sumaPrimos / contadorPrimos;
        } else {
            return 0;
        }
    }
}
