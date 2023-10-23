package Factory;

import Singleton.Juguete;

import java.util.Set;

public class MostrarJuguetes implements Operacion{
    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        if (jugetes.size() != 0){
            for (Juguete juguete : jugetes){
                String Id = "Id: " + juguete.getId() + " ";
                System.out.println(Id + juguete);
            }
        } else {
            System.out.println("No hay juguetes ingresados");
        }
    }
}
