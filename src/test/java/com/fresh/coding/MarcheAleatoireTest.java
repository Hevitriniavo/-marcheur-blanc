package com.fresh.coding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MarcheAleatoireTest {

    private Carte carte;
    private Lieu HEI;
    private Lieu ESTI;

    @BeforeEach
    public void setUp() {
        HEI = new Lieu("HEI");
        Lieu pullman = new Lieu("Pullman");
        Lieu balancoire = new Lieu("Balançoire");
        ESTI = new Lieu("ESTI");
        Rue rue1 = new Rue(HEI, pullman);
        Rue rue2 = new Rue(pullman, balancoire);
        Rue rue3 = new Rue(balancoire, ESTI);
        carte = new Carte();
        carte.ajouterRue(rue1);
        carte.ajouterRue(rue2);
        carte.ajouterRue(rue3);
    }

    @Test
    public void testMarcheurAtteintESTI() {
        Marcheur marcheur = new Marcheur(HEI);
        List<Lieu> parcours = marcheur.marcherVers(ESTI, carte);
        assertEquals(ESTI, parcours.getLast());
    }

    @Test
    public void testParcoursNonVide() {
        Marcheur marcheur = new Marcheur(HEI);
        List<Lieu> parcours = marcheur.marcherVers(ESTI, carte);
        assertFalse(parcours.isEmpty());
    }

    @Test
    public void testMarcheurPartDeHEI() {
        Marcheur marcheur = new Marcheur(HEI);
        List<Lieu> parcours = marcheur.marcherVers(ESTI, carte);
        assertEquals(HEI, parcours.getFirst());
    }
}
