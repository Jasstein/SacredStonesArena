package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;
import com.springtest.sacredstonesarena.weapons.lances.*;
import com.springtest.sacredstonesarena.weapons.axes.*;

public class Amelia extends Unit{
    private final static String name = "Amelia";
    private final static UnitClass unitClass = new General();
    private final static int maxHp = 49;
    private int currentHp;
    private final static int strength = 23;
    private final static int magic = 0;
    private final static int skill = 25;
    private final static int speed = 25;
    private final static int luck = 29;
    private final static int defense = 21;
    private final static int resistance = 13;
    private final static int con = 11;
    private final static Weapon[] inventory = {new BraveLance(), new KillingEdge(), new SilverAxe()};

    public Amelia(){
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
