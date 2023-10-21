package Factory;

import Builder.Carrito;
import Builder.Peluche;
import Singleton.Juguete;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ClonarJuguete implements Operacion{
    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del juguete a clonar: ");
        int id = scanner.nextInt();

        Juguete original = null;

        for (Juguete juguete : jugetes) {
            if (juguete.getId() == id) {
                original = juguete;
                break;
            }
        }

        if (original != null) {
            try {
                System.out.print("Ingrese la cantidad de clones a crear: ");
                int cantidadClones = scanner.nextInt();
                if (original instanceof Carrito){
                    Carrito copia = (Carrito) original;
                    for (int i = 0; i < cantidadClones; i++) {
                        jugetes.add(copia.clonar());
                    }
                } else if (original instanceof Peluche) {
                    Peluche copia = (Peluche) original;
                    for (int i = 0; i < cantidadClones; i++) {
                        jugetes.add(copia.clonar());
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Se debe ingresar un numero");
                scanner.nextLine();
            }
        } else {
            System.out.println("El jugete no existe");
        }
    }
}



