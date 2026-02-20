package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;

public class Rennac extends Unit{
    private final static String name = "Rennac";
    private final static UnitClass unitClass = new Rogue();
    private final static int maxHp = 40;
    private int currentHp;
    private final static int strength = 14;
    private final static int magic = 0;
    private final static int skill = 24;
    private final static int speed = 28;
    private final static int luck = 9;
    private final static int defense = 13;
    private final static int resistance = 16;
    private final static int con = 7;
    private final static Weapon[] inventory = {new SilverSword(), new IronBlade(), new Zanbato()};

    public Rennac(){
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
