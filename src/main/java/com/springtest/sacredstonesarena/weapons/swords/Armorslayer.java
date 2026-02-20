package com.springtest.sacredstonesarena.weapons.swords;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class Armorslayer extends Weapon {
    private final static String weaponName = "Armorslayer";
    private final static String weaponType = "Sword";
    private final static int weight = 11;
    private final static int might = 8;
    private final static int hit = 80;
    private final static int crit = 0;
    private final static String effective = "Armor";
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
