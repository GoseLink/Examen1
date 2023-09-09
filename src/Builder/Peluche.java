package Builder;

public class Peluche implements Juguete{
    private long id;
    private String materialexterior;
    private String relleno;
    private String color;

    public Peluche(String materialexterior, String relleno, String color){
        this.materialexterior = materialexterior;
        this.relleno = relleno;
        this.color = color;
    }

    private static PelucheBuilder builder() {
        return new PelucheBuilder();
    }

    public String toString(){
        return "Id: "+ id + "\nMaterial exterior: "+ materialexterior + "\nRelleno: "+ relleno +"\nColor: " + color;
    }

    public static class PelucheBuilder{
        private long id;
        private String materialexterior;
        private String relleno;
        private String color;

        public PelucheBuilder id (long id){
            this.id = id;
            return this;
        }

        public PelucheBuilder materialexterior(String materialexterior){
            this.materialexterior = materialexterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno){
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color){
            this.color = color;
            return this;
        }


        public Peluche build(){
            return new Peluche( materialexterior, relleno, color);
        }
    }
}
