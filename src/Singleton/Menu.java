package Singleton;

import Builder.Juguete;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private static Menu instance;

    private List<Juguete> jugetes = new ArrayList<>();

    private Menu(){

    }

    public static Menu getInstance(){
        if (instance == null){
            instance = new Menu();
        }
        return instance;
    }

    public List<Juguete> getJugetes() {
        return jugetes;
    }
}
