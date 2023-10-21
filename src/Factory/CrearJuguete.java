package Factory;

import Builder.Carrito;
import Builder.Peluche;
import Singleton.Juguete;

import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CrearJuguete implements Operacion{

    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el juguete que se desea crear \n\n1. Peluche\n2. Carrito\n");
        int opcion = scanner.nextInt();

        if (opcion == 1){
            CrearPeluche crearPeluche = new CrearPeluche();
            crearPeluche.ejecutar(jugetes);
        } else if (opcion == 2){
            CrearCarrito crearCarrito = new CrearCarrito();
            crearCarrito.ejecutar(jugetes);
        }
    }
}
