package Factory;

import Builder.Carrito;
import Builder.Peluche;
import Singleton.Juguete;

import java.util.List;

public class MostrarJuguete implements Operacion{
    @Override
    public void ejecutar(List<Juguete> juguetes) {
        System.out.println("Juguetes Actuales:");
        for (Juguete juguete : juguetes) {
            if (juguete instanceof Carrito){
                Carrito carrito = (Carrito) juguete;
                String Id = "Id: " + juguete.getId() + " ";
                System.out.println(Id + carrito.toString());
            } else if (juguete instanceof Peluche) {
                Peluche peluche = (Peluche) juguete;
                String Id = "Id: " + juguete.getId() + " ";
                System.out.println(Id + peluche.toString());
            }

        }
    }
}

