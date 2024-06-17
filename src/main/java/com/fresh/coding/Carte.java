package com.fresh.coding;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@EqualsAndHashCode
@Getter
@AllArgsConstructor
@ToString
public class Carte {
    private List<Rue> rues;

    public Carte(Rue... rues) {
        this.rues = Arrays.stream(rues).collect(Collectors.toList());
    }

    public void ajouterRue(Rue rue) {
        rues.add(rue);
    }
}
