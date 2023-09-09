package Factory;

import Builder.Carrito;
import Builder.Juguete;

import java.util.Scanner;

public class CarritoFactory implements Factory{

    Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {
        System.out.println("Ingrese la marca: ");
        String marca = String.valueOf(scanner);
        System.out.println("Ingrese la marca: ");
        String numero = String.valueOf(scanner);
        System.out.println("Ingrese el color: ");
        String color = String.valueOf(scanner);
        return new Carrito(marca, numero, color);
    }
}
