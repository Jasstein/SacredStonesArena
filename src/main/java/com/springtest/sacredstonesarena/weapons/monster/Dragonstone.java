package com.springtest.sacredstonesarena.weapons.monster;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class Dragonstone extends Weapon {
    private final static String weaponName = "Dragonstone";
    private final static String weaponType = "monster";
    private final static int weight = 0;
    private final static int might = 16;
    private final static int hit = 100;
    private final static int crit = 15;
    private final static String effective = "Monster";
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
