package com.springtest.sacredstonesarena.weapons.magic;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class Gleipnir extends Weapon {
    private final static String weaponName = "Gleipnir";
    private final static String weaponType = "Dark";
    private final static int weight = 20;
    private final static int might = 23;
    private final static int hit = 80;
    private final static int crit = 0;
    private final static String effective = "";
    private final static String bonus = "Ski+5";

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
