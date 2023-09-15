package Factory;

import Builder.Carrito;
import Builder.Peluche;
import Singleton.Juguete;

import java.util.List;
import java.util.Scanner;

public class CrearJuguete implements Operacion{

    @Override
    public void ejecutar(List<Juguete> juguetes) {
        Scanner scanner = new Scanner(System.in);
        Apoyo apoyo = new Apoyo();
        System.out.println("Seleccione el juguete que se desea crear \n\n1. Peluche\n2. Carrito\n");
        int opcion = scanner.nextInt();

        if (opcion == 1){
            Peluche peluche = new Peluche.Builder()
                    .conMaterialExterior(apoyo.leerString("Material Exterior"))
                    .conRelleno(apoyo.leerString("Relleno"))
                    .conColor(apoyo.leerString("Color"))
                    .build();
            juguetes.add(peluche);
        } else if (opcion == 2){
            Carrito carrito = new Carrito.Builder().conColor(apoyo.leerString("Color"))
                    .conMarca(apoyo.leerString("Marca"))
                    .conNumeroPuertas(apoyo.leerInt("Numero de puertas"))
                    .build();
            juguetes.add(carrito);
        }
    }
}
