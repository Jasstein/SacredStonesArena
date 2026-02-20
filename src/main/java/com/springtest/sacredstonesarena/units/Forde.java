package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;
import com.springtest.sacredstonesarena.weapons.lances.*;

public class Forde extends Unit{
    private final static String name = "Forde";
    private final static UnitClass unitClass = new Paladin();
    private final static int maxHp = 54;
    private int currentHp;
    private final static int strength = 21;
    private final static int magic = 0;
    private final static int skill = 25;
    private final static int speed = 23;
    private final static int luck = 18;
    private final static int defense = 16;
    private final static int resistance = 11;
    private final static int con = 11;
    private final static Weapon[] inventory = {new SilverSword(), new SilverLance(), new Zanbato()};

    public Forde(){
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
