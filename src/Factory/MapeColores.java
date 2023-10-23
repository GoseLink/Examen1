package Factory;

import Singleton.Juguete;

import java.util.*;
import java.util.stream.Collectors;

public class MapeColores implements Operacion {
    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        if (jugetes.size() != 0) {
            Set<String> colores = jugetes.stream()
                    .map(Juguete::getColor)
                    .filter(Objects::nonNull)
                    .collect(Collectors.toSet());
            System.out.println("Colores disponibles: " + colores);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Elija un color para filtrar los juguetes: ");
            String colorFiltrado = scanner.nextLine();

            List<Juguete> juguetesFiltrados = jugetes.stream()
                    .filter(juguete -> !Objects.equals(juguete.getColor(), colorFiltrado))
                    .collect(Collectors.toList());

            if (juguetesFiltrados.size() < jugetes.size()) {
                int diferencia = jugetes.size() - juguetesFiltrados.size();
                for (int i = 0; i < diferencia; i++){
                    Juguete.decrementarContadorIDs();
                }
            }
            jugetes.clear();
            jugetes.addAll(juguetesFiltrados);
            for (int i = 0; i < jugetes.size(); i++){
                new ArrayList<>(jugetes).get(i).setId(i + 1);
            }
            System.out.println("Juguetes filtrados:");
            jugetes.forEach(juguete -> System.out.println("Id: " + juguete.getId() + " " + juguete));
        } else {
            System.out.println("No hay juguetes ingresados");
        }
    }
}
