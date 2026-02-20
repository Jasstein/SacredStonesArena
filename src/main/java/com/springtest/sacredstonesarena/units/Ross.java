package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.axes.*;

public class Ross extends Unit{
    private final static String name = "Ross";
    private final static UnitClass unitClass = new Berserker();
    private final static int maxHp = 53;
    private int currentHp;
    private final static int strength = 30;
    private final static int magic = 0;
    private final static int skill = 19;
    private final static int speed = 19;
    private final static int luck = 26;
    private final static int defense = 17;
    private final static int resistance = 11;
    private final static int con = 13;
    private final static Weapon[] inventory = {new KillerAxe(), new Hatchet(), new Swordslayer()};

    public Ross(){
        currentHp = maxHp;
    }
    @Override
    public String getName(){
        return name;
    };
    @Override
    public UnitClass getUnitClass(){
        return unitClass;
    };
    @Override
    public int getMaxHp(){
        return maxHp;
    };
    @Override
    public int getCurrentHp(){
        return currentHp;
    };
    @Override
    public void setCurrentHp(int currentHp){
        this.currentHp = currentHp;
    };
    @Override
    public int getStrength(){
        return strength;
    };
    @Override
    public int getMagic(){
        return magic;
    };
    @Override
    public int getSkill(){
        return skill;
    };
    @Override
    public int getSpeed(){
        return speed;
    };
    @Override
    public int getLuck(){
        return luck;
    };
    @Override
    public int getDefense(){
        return defense;
    };
    @Override
    public int getResistance(){
        return resistance;
    };
    @Override
    public int getCon(){
        return con;
    };
    @Override
    public Weapon[] getInventory(){
        return inventory;
    };
}
