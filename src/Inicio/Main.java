package Inicio;

import Factory.*;
import Singleton.Menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        int opcionSalida = 9;

        menu.agregarOperacion(1, new CrearJuguete());
        menu.agregarOperacion(2, new ClonarJuguete());
        menu.agregarOperacion(3, new EliminarJuguete());
        menu.agregarOperacion(4, new MostrarJuguetes());
        menu.agregarOperacion(5, new MostrarJuguete());
        menu.agregarOperacion(6, new MostrarCarrito());
        menu.agregarOperacion(7, new MapJuguetes());
        menu.agregarOperacion(8, new MapeColores());

        int opcion = 0;
        Scanner scanner = null;
        while (opcion != opcionSalida) {
            menu.mostrarMenu();
            try {
                scanner = new Scanner(System.in);
                System.out.print("Seleccione una opción: ");
                opcion = scanner.nextInt();
                if (opcion == 9){
                    System.out.println("Hasta luego");
                } else {
                    menu.ejecutarOpcion(opcion);
                }
            } catch (InputMismatchException e) {
                System.out.println("Opcion no disponible");
                scanner.nextLine();
            }
        }
    }
}
