package Factory;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Apoyo {
    public static String leerString(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese " + mensaje + ": ");
        return scanner.nextLine();
    }

    public static int leerInt(String mensaje) {
        Scanner scanner = new Scanner(System.in);
        int opcionSalida = 1;
        int Salida = 0;
        while (opcionSalida != 0) {
            try {
                System.out.print("Ingrese " + mensaje + ": ");
                 Salida = scanner.nextInt();
                 opcionSalida = 0;

            } catch (InputMismatchException e) {
                System.out.println("Este campo solo recibe numeros");
                scanner.nextLine();
                opcionSalida = 1;
            }
        }

        return Salida;
    }

}
