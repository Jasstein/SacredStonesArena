package com.springtest.sacredstonesarena.classes;

public class Summoner extends UnitClass {
    private final static String className = "Summoner";
    private final static String weapon1 = "Dark";
    private final static String weapon2 = "Staff";
    private final static String weapon3 = "";
    private final static String weakness = "Infantry";
    private final static String physicalOrMagical = "Magical";
    private final static String skill = "Summon";

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
