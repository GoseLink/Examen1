package Builder;

import Singleton.Juguete;

public class Peluche extends Juguete {
    private String materialExterior;
    private String relleno;
    private String color;

    private Peluche(Builder builder) {
        this.materialExterior = builder.materialExterior;
        this.relleno = builder.relleno;
        this.color = builder.color;
    }


    // Métodos getter para los atributos

    public static class Builder {
        private String materialExterior;
        private String relleno;
        private String color;

        public Builder conMaterialExterior(String materialExterior) {
            this.materialExterior = materialExterior;
            return this;
        }

        public Builder conRelleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public Builder conColor(String color) {
            this.color = color;
            return this;
        }

        public Peluche build() {
            return new Peluche(this);
        }

    }
    public Peluche clonar() {
        return new Peluche.Builder()
                .conMaterialExterior(this.materialExterior)
                .conColor(this.color)
                .conRelleno(this.relleno)
                .build();
    }

    public String toString() {
        return  " Material Exterior: " + materialExterior + ", Relleno: " + relleno
                + ", Color: " + color ;
    }
}
