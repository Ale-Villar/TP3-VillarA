package resol.VillarA;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class Ejercicio4 {
    public static void ejercicio4() {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera fecha (AAAA-MM-DD): ");
        LocalDate fecha1 = LocalDate.parse(scanner.nextLine());

        System.out.print("Ingrese la segunda fecha (AAAA-MM-DD): ");
        LocalDate fecha2 = LocalDate.parse(scanner.nextLine());

        if (fecha1.isAfter(fecha2)) {

            System.out.println("Error: la primera fecha debe ser anterior.");
            return;
        }

        long dias = calcularDias(fecha1, fecha2);

        System.out.println("Cantidad de días entre fechas: " + dias);
    }

    public static long calcularDias(LocalDate fecha1, LocalDate fecha2) {

        return ChronoUnit.DAYS.between(fecha1, fecha2);  
    }
}
