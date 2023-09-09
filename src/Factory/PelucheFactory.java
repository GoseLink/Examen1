package Factory;

import Builder.Juguete;
import Builder.Peluche;

import java.util.Scanner;

public class PelucheFactory implements Factory{

    Scanner scanner = new Scanner(System.in);

    @Override
    public Juguete crear() {
        System.out.println("Ingrese el material exterior: ");
        String material = String.valueOf(scanner);
        System.out.println("Ingrese el relleno: ");
        String relleno = String.valueOf(scanner);
        System.out.println("Ingrese el color: ");
        String color = String.valueOf(scanner);
        return new Peluche(material, relleno, color);
    }


}
