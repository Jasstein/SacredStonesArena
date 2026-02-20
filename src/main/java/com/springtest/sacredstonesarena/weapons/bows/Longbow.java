package com.springtest.sacredstonesarena.weapons.bows;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class Longbow extends Weapon {
    private final static String weaponName = "Longbow";
    private final static String weaponType = "Bow";
    private final static int weight = 10;
    private final static int might = 5;
    private final static int hit = 65;
    private final static int crit = 0;
    private final static String effective = "Flying";
    private final static String bonus = "";

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
