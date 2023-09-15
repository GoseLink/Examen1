package Factory;

import Singleton.Juguete;

import java.util.List;
import java.util.Scanner;

public class EliminarJuguete implements Operacion{

    @Override
    public void ejecutar(List<Juguete> juguetes) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el ID del juguete a eliminar: ");
        int id = scanner.nextInt();

        Juguete jugueteAEliminar = null;

        for (Juguete juguete : juguetes) {
            if (juguete.getId() == id) {
                jugueteAEliminar = juguete;
                break;
            }
        }

        if (jugueteAEliminar != null) {
            juguetes.remove(jugueteAEliminar);
            for (int i = 0; i < juguetes.size(); i++){
                juguetes.get(i).setId(i + 1);
            }
            System.out.println("Juguete eliminado");
        } else {
            System.out.println("El juguete no existe");
        }
    }
}
