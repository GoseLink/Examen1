package Factory;

import Builder.Peluche;
import Singleton.Juguete;

import java.util.Set;

public class CrearPeluche implements Operacion{

    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        Apoyo apoyo = new Apoyo();
        Peluche peluche = new Peluche.Builder()
                .conMaterialExterior(apoyo.leerString("Material Exterior"))
                .conRelleno(apoyo.leerString("Relleno"))
                .conColor(apoyo.leerString("Color"))
                .build();
        jugetes.add(peluche);
    }
}
