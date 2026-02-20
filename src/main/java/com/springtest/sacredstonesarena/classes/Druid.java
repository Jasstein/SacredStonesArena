package com.springtest.sacredstonesarena.classes;

public class Druid extends UnitClass {
    private final static String className = "Druid";
    private final static String weapon1 = "Anima";
    private final static String weapon2 = "Dark";
    private final static String weapon3 = "Staff";
    private final static String weakness = "Infantry";
    private final static String physicalOrMagical = "Magical";
    private final static String skill = "";

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
