import java.util.Scanner;
import resol.VillarA.*;
public class Principal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que ejercicio desea ejecutar? (1-6)");
        int ejercicio = scanner.nextInt();
        
        switch (ejercicio) {
            case 1:
                Ejercicio1.ejercicio1();
                break;
            case 2:
                Ejercicio2.ejercicio2();
                break;
            case 3:
                Ejercicio3.ejercicio3();
                break;
            case 4:
                Ejercicio4.ejercicio4();
                break;
            case 5:
                Ejercicio5.ejercicio5();
                break;
            case 6:
                Ejercicio6.ejercicio6();
                break;
          default:
                System.out.println("Ejercicio no válido. Por favor, ingrese un número entre 1 y 6.");
        }
        scanner.close();
    }
}   
