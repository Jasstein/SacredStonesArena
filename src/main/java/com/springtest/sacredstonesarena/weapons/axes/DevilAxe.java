package com.springtest.sacredstonesarena.weapons.axes;

import com.springtest.sacredstonesarena.weapons.Weapon;

public class DevilAxe extends Weapon {
    private final static String weaponName = "Devil Axe";
    private final static String weaponType = "Axe";
    private final static int weight = 18;
    private final static int might = 18;
    private final static int hit = 55;
    private final static int crit = 0;
    private final static String effective = "";
    private final static String bonus = "Devil";

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
