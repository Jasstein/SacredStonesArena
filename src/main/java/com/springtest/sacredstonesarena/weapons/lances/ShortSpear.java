package com.springtest.sacredstonesarena.weapons.lances;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class ShortSpear extends Weapon {
    private final static String weaponName = "Short Spear";
    private final static String weaponType = "Lance";
    private final static int weight = 12;
    private final static int might = 9;
    private final static int hit = 60;
    private final static int crit = 0;
    private final static String effective = "";
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
