package com.fresh.coding;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@ToString
public class Carte {
    private List<Rue> rues;

    public Carte() {
        rues = new ArrayList<>();
    }

    public void ajouterRue(Rue rue) {
        rues.add(rue);
    }

}
