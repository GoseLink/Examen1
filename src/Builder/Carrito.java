package Builder;

public class Carrito implements Juguete{
    private long id;
    private String marca;
    private String numeropuertas;
    private String color;

    public Carrito(String marca, String numeropuertas, String color){
        this.marca = marca;
        this.numeropuertas = numeropuertas;
        this.color = color;
    }

    private static Peluche.PelucheBuilder builder() {
        return new Peluche.PelucheBuilder();
    }

    public String toString(){
        return "Id: "+ id + "\nMarca: "+ marca + "\nNumero de puertas: "+ numeropuertas + "\nColor: " + color;
    }

    public static class CarritoBuilder{
        private long id;
        private String marca;
        private String numeropuertas;
        private String color;

        public CarritoBuilder id (long id){
            this.id = id;
            return this;
        }

        public CarritoBuilder marca(String marca){
            this.marca = marca;
            return this;
        }

        public CarritoBuilder numeropuertas(String numeropuertas){
            this.numeropuertas = numeropuertas;
            return this;
        }

        public CarritoBuilder color(String color){
            this.color = color;
            return this;
        }


        public Carrito build(){
            return new Carrito(marca, numeropuertas, color);
        }
    }
}
