package com.fresh.coding;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class MarcheurTest {

    private Lieu HEI;
    private Lieu ESTI;
    private Rue rue1;
    private Rue rue2;
    private Rue rue3;
    private Carte carte;

    @BeforeEach
    public void setUp() {
        HEI = new Lieu("HEI");
        Lieu pullman = new Lieu("Pullman");
        Lieu balancoire = new Lieu("Balançoire");
        ESTI = new Lieu("ESTI");

        rue1 = new Rue(HEI, pullman);
        rue2 = new Rue(pullman, balancoire);
        rue3 = new Rue(balancoire, ESTI);

        carte = new Carte(rue2, rue1, rue3);
    }

    @Test
    public void testMarcherPossible() {
        Marcheur marcheur = new Marcheur();
        List<List<Rue>> chemins = marcheur.marcherPossible(HEI, ESTI, carte);
        assertEquals(1, chemins.size());
        assertEquals(3, chemins.getFirst().size());
        assertTrue(chemins.getFirst().contains(rue1));
        assertTrue(chemins.getFirst().contains(rue2));
        assertTrue(chemins.getFirst().contains(rue3));
    }

    @Test
    public void testAucunCheminPossible() {
        Lieu inconnu = new Lieu("Inconnu");
        Marcheur marcheur = new Marcheur();
        List<List<Rue>> chemins = marcheur.marcherPossible(inconnu, ESTI, carte);
        assertTrue(chemins.isEmpty());
    }

    @Test
    public void testCheminDirectPossible() {
        Rue rueDirecte = new Rue(HEI, ESTI);
        carte.ajouterRue(rueDirecte);
        Marcheur marcheur = new Marcheur();
        List<List<Rue>> chemins = marcheur.marcherPossible(HEI, ESTI, carte);
        assertEquals(2, chemins.size());
    }
}
