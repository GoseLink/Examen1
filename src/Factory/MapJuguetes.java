package Factory;

import Singleton.Juguete;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapJuguetes implements Operacion{
    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        if (jugetes.size() != 0){
            Map<Integer, Juguete> jugueteMap = jugetes.stream()
                    .collect(Collectors.toMap(Juguete::getId, juguete -> juguete));

            jugueteMap.forEach((Id, juguete) -> {
                System.out.printf("Id->%s Juguete->%s%n", Id, juguete);
            });
        } else {
            System.out.println("No hay juguetes ingresados");
        }
    }
}
