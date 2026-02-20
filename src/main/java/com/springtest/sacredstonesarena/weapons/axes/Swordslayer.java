package com.springtest.sacredstonesarena.weapons.axes;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class Swordslayer extends Weapon {
    private final static String weaponName = "Swordslayer";
    private final static String weaponType = "Axe";
    private final static int weight = 13;
    private final static int might = 11;
    private final static int hit = 80;
    private final static int crit = 5;
    private final static String effective = "Sword";
    private final static String bonus = "Reaver";

    @Override
    public String getWeaponName(){
        return weaponName;
    }

    @Override
    public String getWeaponType(){
        return weaponType;
    }

    @Override
    public int getWeight(){
        return weight;
    }

    @Override
    public int getMight(){
        return might;
    }

    @Override
    public int getHit(){
        return hit;
    }

    @Override
    public int getCrit(){
        return crit;
    }

    @Override
    public String getEffective(){
        return effective;
    }

    @Override
    public String getBonus(){
        return bonus;
    }

}
