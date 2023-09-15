package Singleton;

import Factory.Operacion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static Factory.Operacion.operaciones;

public class Menu {

    private static Menu instance;

    public List<Juguete> jugetes = new ArrayList<>();
    private Menu(){

    }
    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }

    public void mostrarMenu() {
        System.out.println("Menú:");
        System.out.println("1. Crear Juguete");
        System.out.println("2. Clonar Juguete");
        System.out.println("3. Eliminar Juguete");
        System.out.println("4. Ver Juguetes Actuales");
        System.out.println("5. Salir");
    }

    public void ejecutarOpcion(int opcion) {
        Operacion operacion = operaciones.get(opcion);
        if (operacion != null) {
            operacion.ejecutar(jugetes);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private Map<Integer, Operacion> operaciones = new HashMap<>();

    public void agregarOperacion(int numeroOpcion, Operacion operacion) {
        operaciones.put(numeroOpcion, operacion);
    }


}
