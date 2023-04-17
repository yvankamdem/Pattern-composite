package model;

import service.Tache;

import java.lang.String;

public class TacheElementaire implements Tache {
    private String nom;
    private int cout;

    public TacheElementaire(String nom, int cout){
        this.nom = nom;
        this.cout = cout;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    @Override
    public String getNom() {
        return this.nom;
    }

    @Override
    public int getCout() {
        return this.cout;
    }
}
