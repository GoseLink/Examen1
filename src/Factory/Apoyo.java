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

        while (true) {
            try {
                System.out.print("Ingrese " + mensaje + ": ");
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Este campo solo recibe numeros");
                scanner.nextLine();
            }
        }
    }

}
