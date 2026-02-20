package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;
import com.springtest.sacredstonesarena.weapons.lances.*;

public class Cormag extends Unit{
    private final static String name = "Cormag";
    private final static UnitClass unitClass = new WyvernLord();
    private final static int maxHp = 59;
    private int currentHp;
    private final static int strength = 27;
    private final static int magic = 0;
    private final static int skill = 23;
    private final static int speed = 23;
    private final static int luck = 14;
    private final static int defense = 21;
    private final static int resistance = 6;
    private final static int con = 12;
    private final static Weapon[] inventory = {new KillerLance(), new SlimSword(), new Dragonspear()};

    public Cormag(){
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
