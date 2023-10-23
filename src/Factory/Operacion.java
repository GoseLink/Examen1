package Factory;

import Singleton.Juguete;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface Operacion {

    void ejecutar(Set<Juguete> jugetes);

    public Map<Integer, Operacion> operaciones = new HashMap<>();

    public default void agregarOperacion(int numeroOpcion, Operacion operacion) {
        operaciones.put(numeroOpcion, operacion);
    }
}
