package com.fresh.coding;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CarteTest {
    private Carte carte;
    private Lieu nexta;
    private Lieu esti;

    @BeforeEach
    public void setUp() {
        Lieu marais = new Lieu("Marais");
        Lieu sekolintsika = new Lieu("Sekolintsika");
        Lieu hei = new Lieu("HEI");
        Lieu pullman = new Lieu("Pullman");
        Lieu balançoire = new Lieu("Balançoire");
        Lieu boulevardDeLEurope = new Lieu("Boulevard de l'Europe");
        nexta = new Lieu("Nexta");
        esti = new Lieu("ESTI");

        Rue rue1 = new Rue(pullman, hei);
        Rue rue2 = new Rue(pullman, balançoire);
        Rue rue3 = new Rue(balançoire, boulevardDeLEurope);
        Rue rue4 = new Rue(esti, balançoire);
        Rue rue5 = new Rue(balançoire, hei);
        Rue rue6 = new Rue(marais, sekolintsika);
        Rue rue7 = new Rue(sekolintsika, hei);
        Rue rue8 = new Rue(pullman, nexta);
        Rue rue9 = new Rue(balançoire, nexta);
        Rue rue10 = new Rue(boulevardDeLEurope, esti);

        carte = new Carte(rue1, rue2, rue3, rue4, rue5, rue6, rue7, rue8, rue9, rue10);
    }

    @Test
    public void testAjouterRue() {
        Rue newRue = new Rue(esti, nexta);
        carte.ajouterRue(newRue);
        List<Rue> rues = carte.getRues();
        assertTrue(rues.contains(newRue));
        assertEquals(11, rues.size());
    }

    @Test
    public void testCarteInitialRues() {
        List<Rue> rues = carte.getRues();
        assertEquals(10, rues.size());
    }
}
