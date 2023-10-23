package Factory;

import Singleton.Juguete;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EliminarJuguete implements Operacion{

    @Override
    public void ejecutar(Set<Juguete> jugetes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del juguete a eliminar: ");
        int id = scanner.nextInt();

        Juguete jugueteAEliminar = null;

        for (Juguete juguete : jugetes) {
            if (juguete.getId() == id) {
                jugueteAEliminar = juguete;
                break;
            }
        }

        if (jugueteAEliminar != null) {
            Juguete.decrementarContadorIDs();
            jugetes.remove(jugueteAEliminar);
            for (int i = 0; i < jugetes.size(); i++){
                new ArrayList<>(jugetes).get(i).setId(i + 1);
            }

            System.out.println("Juguete eliminado");
        } else {
            System.out.println("El juguete no existe");
        }
    }
}
