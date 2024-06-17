package com.fresh.coding;

import java.util.ArrayList;
import java.util.List;

public class Marcheur {
    public List<List<Rue>> marcherPossible(Lieu depart, Lieu arrivee, Carte carte) {
        List<List<Rue>> tousLesChemins = new ArrayList<>();
        List<Rue> cheminActuel = new ArrayList<>();
        dfs(depart, arrivee, carte, cheminActuel, tousLesChemins);
        return tousLesChemins;
    }

    private void dfs(Lieu current, Lieu arrivee, Carte carte, List<Rue> cheminActuel, List<List<Rue>> tousLesChemins) {
        if (current.equals(arrivee)) {
            tousLesChemins.add(new ArrayList<>(cheminActuel));
            return;
        }

        for (Rue rue : carte.getRues()) {
            if (rue.getLieuDepart().equals(current)) {
                cheminActuel.add(rue);
                dfs(rue.getLieuArrivee(), arrivee, carte, cheminActuel, tousLesChemins);
                cheminActuel.removeLast();
            }
        }
    }

}
