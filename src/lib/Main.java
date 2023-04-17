package lib;

import model.TacheComplexe;
import service.Tache;
import model.TacheElementaire;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] argv){
        Tache element = new TacheElementaire("Njanteng", 500);
        Tache tache = new TacheElementaire("Nounjio", 150);
        Tache t = new TacheComplexe("Allo", Arrays.asList(element, tache));
        Tache t2 = new TacheComplexe("Hello", Arrays.asList(element, t));


        System.out.println("Design pattern Composite ! " + t.getNom() + " " + t.getCout() + "\n");

        System.out.println("Design pattern Composite ! " + t2.getNom() + " " + t2.getCout());
    }
}