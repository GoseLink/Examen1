package Builder;

import Singleton.Juguete;

public class Carrito extends Juguete {

    private String marca;
    private int numeroPuertas;

    public Carrito(Builder builder) {
        this.color = builder.color;
        this.marca = builder.marca;
        this.numeroPuertas = builder.numeroPuertas;
    }

    // Métodos getter para los atributos

    public static class Builder {
        private String color;
        private String marca;
        private int numeroPuertas;

        public Builder conColor(String color) {
            this.color = color;
            return this;
        }

        public Builder conMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder conNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
            return this;
        }

        public Carrito build() {
            return new Carrito(this);
        }
    }

    public Carrito clonar() {
        return new Carrito.Builder()
                .conColor(this.color)
                .conMarca(this.marca)
                .conNumeroPuertas(this.numeroPuertas)
                .build();
    }
    public String toString() {
        return " Color: " + color + ", Marca: " + marca + ", Número de Puertas: " + numeroPuertas ;
    }

    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
