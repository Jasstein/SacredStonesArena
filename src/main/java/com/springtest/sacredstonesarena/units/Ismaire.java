package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;

public class Ismaire extends Unit{
    private final static String name = "Ismaire";
    private final static UnitClass unitClass = new Swordmaster();
    private final static int maxHp = 41;
    private int currentHp;
    private final static int strength = 19;
    private final static int magic = 0;
    private final static int skill = 26;
    private final static int speed = 29;
    private final static int luck = 15;
    private final static int defense = 10;
    private final static int resistance = 17;
    private final static int con = 7;
    private final static Weapon[] inventory = {new BraveSword(), new Shamshir(), new WindSword()};

    public Ismaire(){
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
