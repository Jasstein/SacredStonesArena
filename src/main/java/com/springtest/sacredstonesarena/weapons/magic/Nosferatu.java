package com.springtest.sacredstonesarena.weapons.magic;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class Nosferatu extends Weapon {
    private final static String weaponName = "Nosferatu";
    private final static String weaponType = "Dark";
    private final static int weight = 14;
    private final static int might = 10;
    private final static int hit = 70;
    private final static int crit = 0;
    private final static String effective = "";
    private final static String bonus = "Drain";

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
