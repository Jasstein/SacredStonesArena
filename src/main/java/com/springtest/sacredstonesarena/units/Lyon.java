package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.magic.*;

public class Lyon extends Unit{
    private final static String name = "Lyon";
    private final static UnitClass unitClass = new Necromancer();
    private final static int maxHp = 49;
    private int currentHp;
    private final static int strength = 0;
    private final static int magic = 25;
    private final static int skill = 16;
    private final static int speed = 14;
    private final static int luck = 5;
    private final static int defense = 19;
    private final static int resistance = 22;
    private final static int con = 7;
    private final static Weapon[] inventory = {new Naglfar(), new Nosferatu(), new Luna()};

    public Lyon(){
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
