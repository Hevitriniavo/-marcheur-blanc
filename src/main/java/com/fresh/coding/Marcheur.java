package com.fresh.coding;


import lombok.AllArgsConstructor;

import java.util.*;

@AllArgsConstructor
public class Marcheur {
    private Lieu lieuActuel;

    public List<Lieu> marcherVers(Lieu destination, Carte carte) {
        List<Lieu> parcours = new ArrayList<>();
        Set<Lieu> lieuxVisites = new HashSet<>();
        Random random = new Random();

        parcours.add(lieuActuel);
        lieuxVisites.add(lieuActuel);

        while (!lieuActuel.equals(destination)) {
            List<Rue> ruesPossibles = new ArrayList<>();
            for (Rue rue : carte.getRues()) {
                if (rue.getLieuDepart().equals(lieuActuel) && !lieuxVisites.contains(rue.getLieuArrivee())) {
                    ruesPossibles.add(rue);
                }
            }

            if (ruesPossibles.isEmpty()) {
                System.out.println("Aucune rue disponible depuis " + lieuActuel + ". Retour en arrière.");
                return parcours;
            }

            Rue rueChoisie = ruesPossibles.get(random.nextInt(ruesPossibles.size()));
            lieuActuel = rueChoisie.getLieuArrivee();
            parcours.add(lieuActuel);
            lieuxVisites.add(lieuActuel);
        }
        return parcours;
    }
}
