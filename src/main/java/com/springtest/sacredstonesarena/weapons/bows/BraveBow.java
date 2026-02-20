package com.springtest.sacredstonesarena.weapons.bows;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class BraveBow extends Weapon {
    private final static String weaponName = "Brave Bow";
    private final static String weaponType = "Bow";
    private final static int weight = 12;
    private final static int might = 10;
    private final static int hit = 70;
    private final static int crit = 0;
    private final static String effective = "Flying";
    private final static String bonus = "Brave";

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
