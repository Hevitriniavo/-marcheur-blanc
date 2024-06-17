package com.fresh.coding;


import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Rue {
    private Lieu lieuDepart;
    private Lieu lieuArrivee;
}
