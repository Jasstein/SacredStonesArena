package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.magic.*;

public class Ewan extends Unit{
    private final static String name = "Ewan";
    private final static UnitClass unitClass = new Druid();
    private final static int maxHp = 43;
    private int currentHp;
    private final static int strength = 0;
    private final static int magic = 26;
    private final static int skill = 20;
    private final static int speed = 25;
    private final static int luck = 28;
    private final static int defense = 10;
    private final static int resistance = 25;
    private final static int con = 8;
    private final static Weapon[] inventory = {new Fenrir(), new Nosferatu(), new Elfire()};

    public Ewan(){
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
