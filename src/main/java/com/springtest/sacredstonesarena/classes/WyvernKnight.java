package com.springtest.sacredstonesarena.classes;

public class WyvernKnight extends UnitClass {
    private final static String className = "Wyvern Knight";
    private final static String weapon1 = "Lance";
    private final static String weapon2 = "";
    private final static String weapon3 = "";
    private final static String weakness = "FlyingDragon";
    private final static String physicalOrMagical = "Physical";
    private final static String skill = "Pierce";

    @Override
    public String getClassName(){
        return className;
    }
    @Override
    public String getWeapon1(){
        return weapon1;
    }
    @Override
    public String getWeapon2(){
        return weapon2;
    }
    @Override
    public String getWeapon3(){
        return weapon3;
    }
    @Override
    public String getWeakness(){
        return weakness;
    }
    @Override
    public String getPhysicalOrMagical() {
        return physicalOrMagical;
    }
    @Override
    public String getSkill(){
        return skill;
    }
}
