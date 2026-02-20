package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;
import com.springtest.sacredstonesarena.weapons.axes.*;

public class Gerik extends Unit{
    private final static String name = "Gerik";
    private final static UnitClass unitClass = new Hero();
    private final static int maxHp = 60;
    private int currentHp;
    private final static int strength = 25;
    private final static int magic = 0;
    private final static int skill = 26;
    private final static int speed = 23;
    private final static int luck = 16;
    private final static int defense = 22;
    private final static int resistance = 13;
    private final static int con = 15;
    private final static Weapon[] inventory = {new SilverBlade(), new SilverAxe(), new Halberd()};

    public Gerik(){
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
