package com.fresh.coding;

import java.util.ArrayList;
import java.util.List;

public class Marcheur {
    private String nom;

    public Trajet marche(Rue rue) {
        return this.marcherPossible(rue).getFirst();
    }

    public  List<Trajet> marcherPossible(Rue chemin){
        var depart = chemin.getLieuDepart();
        var arrivee = chemin.getLieuArrivee();
        var currentLieu = depart;
        List<Rue> rues = chemin.getCarte().getRues();
        List<Trajet> lieuPossibles = new ArrayList<>();
        while (!currentLieu.equals(arrivee)){
            for (Rue rue: rues){
                System.out.println(rue);
            }
        }
        return lieuPossibles;
    }

}
