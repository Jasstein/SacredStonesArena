package com.springtest.sacredstonesarena.units;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.weapons.Weapon;

public abstract class Unit {
    public abstract String getName();
    public abstract UnitClass getUnitClass();
    public abstract int getMaxHp();
    public abstract int getCurrentHp();
    public abstract void setCurrentHp(int currentHp);
    public abstract int getStrength();
    public abstract int getMagic();
    public abstract int getSkill();
    public abstract int getSpeed();
    public abstract int getLuck();
    public abstract int getDefense();
    public abstract int getResistance();
    public abstract int getCon();
    public abstract Weapon[] getInventory();
}
