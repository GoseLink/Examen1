package Factory;

import Builder.Carrito;
import Builder.Peluche;
import Singleton.Juguete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class MostrarJuguete implements Operacion{
    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        Scanner scanner = new Scanner(System.in);
        if (jugetes.size() != 0){
            System.out.println("Seleccione los juguetes que desea mostrar \n\n1. Peluche\n2. Carrito\n");
            int opcion = scanner.nextInt();
            System.out.println("Juguetes Actuales:");
            if (opcion == 1){
                List<Peluche> peluches = new ArrayList<>();
                for (Juguete juguete : jugetes){ if (juguete instanceof Peluche){peluches.add((Peluche) juguete);}}
                if (peluches.size() != 0){
                    for (int i = peluches.size(); i > 0; i--){
                        Peluche peluche = peluches.get(i - 1);
                        String Id = "Id: " + peluche.getId() + " ";
                        System.out.println(Id + peluche);
                    }
                } else {
                    System.out.println("No hay peluches ingresados");
                }
            } else if (opcion == 2) {
                List<Carrito> carritos = new ArrayList<>();
                for (Juguete juguete : jugetes) {if (juguete instanceof Carrito) {carritos.add((Carrito) juguete);}}
                if (carritos.size() != 0) {
                    for (int i = carritos.size() ; i > 0; i--){
                        Carrito carrito = carritos.get(i - 1);
                        String Id = "Id: " + carrito.getId() + " ";
                        System.out.println(Id + carrito);
                    }
                } else {
                    System.out.println("No hay carritos ingresados");
                }
            }
        } else {
            System.out.println("No hay juguetes ingresados");
        }
    }
}

