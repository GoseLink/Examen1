package Singleton;

public class Juguete {
    private static int contadorIds = 1;
    public int id;

    public Juguete() {
        this.id = contadorIds++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
