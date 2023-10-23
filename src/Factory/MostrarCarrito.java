package Factory;

import Builder.Carrito;
import Singleton.Juguete;

import java.util.*;

public class MostrarCarrito implements Operacion{
    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        if (jugetes.size() != 0){
            List<Carrito> carritos = new ArrayList<>();
            for (Juguete juguete : jugetes) {if (juguete instanceof Carrito) {carritos.add((Carrito) juguete);}}
            if (carritos.size() != 0){
                Optional<Carrito> carritoMaxPuertas = carritos.stream()
                        .max((carrito1, carrito2) -> Integer.compare(carrito1.getNumeroPuertas(), carrito2.getNumeroPuertas()));

                carritoMaxPuertas.ifPresent(carrito -> {
                    System.out.println("Carrito con el máximo número de puertas:");
                    System.out.println("Id: " + carrito.getId() + carrito);
                });
            } else {
                System.out.println("No hay carritos registrados");
            }
        } else {
            System.out.println("No hay juguetes registrados");
        }
    }
}
