package Factory;

import Builder.Carrito;
import Singleton.Juguete;

import java.util.Set;

public class CrearCarrito extends CrearJuguete implements Operacion {
    @Override
    public void ejecutar(Set<Juguete> jugetes) {

            Apoyo apoyo = new Apoyo();
            Carrito carrito = new Carrito.Builder().conColor(apoyo.leerString("Color"))
                    .conMarca(apoyo.leerString("Marca"))
                    .conNumeroPuertas(apoyo.leerInt("Numero de puertas"))
                    .build();
            jugetes.add(carrito);

    }
}
