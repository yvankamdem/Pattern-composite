package model;

import service.Tache;

import java.util.List;
import java.lang.String;

public class TacheComplexe implements Tache {

    private String nom;
    private List<Tache> fils;

    public TacheComplexe(String nom, List<Tache> fils){
        this.nom = nom;
        this.fils = fils;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Tache> getFils() {
        return fils;
    }

    public void setFils(List<Tache> fils) {
        this.fils = fils;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public int getCout() {
        int soc = 0;
        for (Tache f:
                fils) {
            soc += f.getCout();
        }
        return soc;
    }
}
