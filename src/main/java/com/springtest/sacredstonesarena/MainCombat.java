package com.springtest.sacredstonesarena;

import com.springtest.sacredstonesarena.units.*;
import com.springtest.sacredstonesarena.weapons.Weapon;

import java.util.Random;

public class MainCombat {

    static Unit unit1;
    static Unit unit2;
    static String unit1Name;
    static String unit2Name;
    static int unit1Hp;
    static int unit2Hp;
    static int unit1Str;
    static int unit2Str;
    static int unit1Mag;
    static int unit2Mag;
    static int unit1Ski;
    static int unit2Ski;
    static int unit1Spe;
    static int unit2Spe;
    static int unit1Lck;
    static int unit2Lck;
    static int unit1Def;
    static int unit2Def;
    static int unit1Res;
    static int unit2Res;

    static int unit1AS; //attack speed
    static int unit2AS;
    static int unit1Damage; //damage dealt
    static int unit2Damage;
    static int unit1Accuraccy; //accuraccy
    static int unit2Accuraccy;
    static int unit1CritChance; //crit chance
    static int unit2CritChance;
    static int unit1Double; //0=no, 1=double or brave, 2=double and brave
    static int unit2Double;

    public static int[] battlePreview(Unit firstUnit, Unit secondUnit, Weapon weapon1, Weapon weapon2) {

        unit1 = firstUnit;
        unit2 = secondUnit;
        //Get Stats
        unit1Name = unit1.getName();
        unit2Name = unit2.getName();
        unit1Hp = unit1.getMaxHp();
        unit2Hp = unit2.getMaxHp();
        unit1Str = unit1.getStrength();
        unit2Str = unit2.getStrength();
        unit1Mag = unit1.getMagic();
        unit2Mag = unit2.getMagic();
        unit1Ski = unit1.getSkill();
        unit2Ski = unit2.getSkill();
        unit1Spe = unit1.getSpeed();
        unit2Spe = unit2.getSpeed();
        unit1Lck = unit1.getLuck();
        unit2Lck = unit2.getLuck();
        unit1Def = unit1.getDefense();
        unit2Def = unit2.getDefense();
        unit1Res = unit1.getResistance();
        unit2Res = unit2.getResistance();

        int[] wt1 = weaponTriangle(weapon1, weapon2);
        int[] wt2 = weaponTriangle(weapon2, weapon1);
        int wtAttack1 = wt1[0]; //check weapon triangle
        int wtAttack2 = wt2[0];
        int effective1 = effectiveDamage(weapon1.getEffective(), unit2.getUnitClass().getWeakness()); //check effective damage
        int effective2 = effectiveDamage(weapon2.getEffective(), unit1.getUnitClass().getWeakness());

        //check weapon1 for stat raises
        if(weapon1.getBonus().equals("Dragonstone")) {
            unit1Str = unit1Str+12;
            unit1Ski = unit1Ski+12;
            unit1Def = unit1Def+15;
            unit1Res = unit1Def+20;
        }
        else if(weapon1.getBonus().equals("Str+5"))
            unit1Str = unit1Str+5;
        else if(weapon1.getBonus().equals("Spe+5"))
            unit1Spe = unit1Spe+5;
        else if(weapon1.getBonus().equals("Ski+5"))
            unit1Ski = unit1Ski+5;
        else if(weapon1.getBonus().equals("Def+5"))
            unit1Def = unit1Def+5;
        else if(weapon1.getBonus().equals("Res+5"))
            unit1Res = unit1Res+5;
        else if(weapon1.getBonus().equals("Lck+5"))
            unit1Lck = unit1Lck+5;

        //check weapon2 for stat raises
        if(weapon2.getBonus().equals("Dragonstone")) {
            unit2Str = unit2Str+12;
            unit2Ski = unit2Ski+12;
            unit2Def = unit2Def+15;
            unit2Res = unit2Def+20;
        }
        else if(weapon2.getBonus().equals("Str+5"))
            unit2Str = unit2Str+5;
        else if(weapon2.getBonus().equals("Spe+5"))
            unit2Spe = unit2Spe+5;
        else if(weapon2.getBonus().equals("Ski+5"))
            unit2Ski = unit2Ski+5;
        else if(weapon2.getBonus().equals("Def+5"))
            unit2Def = unit2Def+5;
        else if(weapon2.getBonus().equals("Res+5"))
            unit2Res = unit2Res+5;
        else if(weapon2.getBonus().equals("Lck+5"))
            unit2Lck = unit2Lck+5;

        //Attack Speed
        unit1AS = unit1Spe - Math.max(0, weapon1.getWeight()-unit1.getCon());
        unit2AS = unit2Spe - Math.max(0, weapon2.getWeight()-unit2.getCon());

        if(unit1AS - unit2AS >= 4 && weapon1.getBonus().equals("Brave"))
            unit1Double = 3; //double and brave
        else if(weapon1.getBonus().equals("Brave"))
            unit1Double = 2; //brave
        else if(unit1AS - unit2AS >= 4)
            unit1Double = 1; //double
        else
            unit1Double = 0; //no double or brave
        if(unit2AS - unit1AS >= 4 && weapon2.getBonus().equals("Brave"))
            unit2Double = 3;
        else if(weapon2.getBonus().equals("Brave"))
            unit2Double = 2;
        else if(unit2AS - unit1AS >= 4)
            unit2Double = 1;
        else
            unit2Double = 0;

        //Damage = Attack + [(Weapon might + Weapon triangle bonus) x Effective bonus] + Support bonus
        unit1Damage = damageDisplay(unit1, unit1Str, unit1Mag, weapon1, wtAttack1, effective1, unit2Def, unit2Res);
        unit2Damage = damageDisplay(unit2, unit2Str, unit2Mag, weapon2, wtAttack2, effective2, unit1Def, unit1Res);;

        //Math.min(100, unit2Hit - unit1Avoid)
        //Accuraccy = Weapon Hit + (Skill x 2) + (Luck / 2) + Support bonus + Weapon triangle bonus + S Rank bonus
        //Avoid = (Attack Speed x 2) + Luck + Support bonus + Terrain bonus
        int wtAcc1 = wt1[1];
        int wtAcc2 = wt2[1];
        int unit1Hit = weapon1.getHit() + (2*unit1Ski) + (unit1Lck/2) + wtAcc1;
        int unit2Hit = weapon2.getHit() + (2*unit2Ski) + (unit2Lck/2) + wtAcc2;
        int unit1Avoid = (2*unit1AS) + unit1Lck;
        int unit2Avoid = (2*unit2AS) + unit2Lck;
        unit1Accuraccy = Math.min(100, unit1Hit - unit2Avoid);
        unit2Accuraccy = Math.min(100, unit2Hit - unit1Avoid);
        unit1Accuraccy = Math.max(0, unit1Accuraccy);
        unit2Accuraccy = Math.max(0, unit2Accuraccy);

        //Crit rate = Weapon Critical + (Skill / 2) + Support bonus + Critical bonus + S Rank bonus
        //Crit evade = Luck + Support bonus
        int unit1classCrit = ((unit1.getUnitClass().getSkill().equals("Crit+15")) ? 15 : 0);
        int unit1CritRate = weapon1.getCrit() + (unit1Ski/2) + unit1classCrit;
        int unit2classCrit = ((unit2.getUnitClass().getSkill().equals("Crit+15")) ? 15 : 0);
        int unit2CritRate = weapon2.getCrit() + (unit2Ski/2) + unit2classCrit;
        unit1CritChance = Math.max(0,unit1CritRate - unit2Lck);
        unit2CritChance = Math.max(0,unit2CritRate - unit1Lck);

        //damage1, damage2, hit1, hit2, crit1, crit2, double1, double2
        return new int[]{unit1Damage, unit2Damage, unit1Accuraccy, unit2Accuraccy, unit1CritChance, unit2CritChance,
                unit1Double, unit2Double};
    }

    //weapon triangle attack, accuracy
    public static int[] weaponTriangle(Weapon weapon1, Weapon weapon2){
        String weapon1Type = weapon1.getWeaponType();
        String weapon2Type = weapon2.getWeaponType();
        //check for reaver weapons, ignore if both are reaver
        if((weapon1.getBonus().equals("Reaver") || weapon2.getBonus().equals("Reaver")) &&
                !(weapon1.getBonus().equals("Reaver") && weapon2.getBonus().equals("Reaver"))){
            //reaver reverses weapon triangle, only exists for physical weapons
            if(weapon1Type.equals("Sword") && weapon2Type.equals("Lance") ||
                    weapon1Type.equals("Lance") && weapon2Type.equals("Axe") ||
                    weapon1Type.equals("Axe") && weapon2Type.equals("Sword"))
                return new int[]{2, 30};
            else if(weapon1Type.equals("Axe") && weapon2Type.equals("Lance") ||
                    weapon1Type.equals("Sword") && weapon2Type.equals("Axe") ||
                    weapon1Type.equals("Lance") && weapon2Type.equals("Sword"))
                return new int[]{-2, -30};
        }
        if(weapon1Type.equals("Sword") && weapon2Type.equals("Axe") ||
                weapon1Type.equals("Lance") && weapon2Type.equals("Sword") ||
                weapon1Type.equals("Axe") && weapon2Type.equals("Lance") ||
                weapon1Type.equals("Anima") && weapon2Type.equals("Light") ||
                weapon1Type.equals("Dark") && weapon2Type.equals("Anima") ||
                weapon1Type.equals("Light") && weapon2Type.equals("Dark"))
            return new int[]{1, 15};
        else if(weapon1Type.equals("Axe") && weapon2Type.equals("Sword") ||
                weapon1Type.equals("Sword") && weapon2Type.equals("Lance") ||
                weapon1Type.equals("Lance") && weapon2Type.equals("Axe") ||
                weapon1Type.equals("Light") && weapon2Type.equals("Anima") ||
                weapon1Type.equals("Anima") && weapon2Type.equals("Dark") ||
                weapon1Type.equals("Dark") && weapon2Type.equals("Light"))
            return new int[]{-1, -15};
        else
            return new int[]{0, 0};
    }

    public static int effectiveDamage(String effective, String weakness) {
        if((weakness.equals("Cavalry") || weakness.equals("CavalryArmor")) &&
                (effective.equals("Cavalry") || effective.equals("CavalryArmor")))
            return 3;
        else if((weakness.equals("Armor") || weakness.equals("CavalryArmor")) &&
                (effective.equals("Armor") || effective.equals("CavalryArmor")))
            return 3;
        else if((weakness.equals("Flying") || weakness.equals("FlyingDragon")) &&
                (effective.equals("Flying") || effective.equals("FlyingMonster")))
            return 3;
        else if((weakness.equals("FlyingDragon")) &&
                (effective.equals("Dragon")))
            return 3;

        return 1;
    }

    //attacking unit, attacking unit's attack, unit's magic,
    // attacking unit's weapon, weapon triangle effective damage, defending unit's def, unit's res
    public static int damageDisplay(Unit offUnit, int str, int mag, Weapon weapon, int wt, int eff, int def, int res){
        int damage = 0;
        if(offUnit.getUnitClass().getPhysicalOrMagical().equals("Physical")) {
            int unit1Attack = str + (weapon.getMight() + wt)*eff;
            damage = Math.max(0, unit1Attack - def);
        }
        else if(offUnit.getUnitClass().getPhysicalOrMagical().equals("Magical")) {
            int unit1Attack = mag + (weapon.getMight() + wt)*eff;
            damage = Math.max(0, unit1Attack - res);
        }
        return damage;
    }

    public static String doubleDisplay(int i){
        if(i == 3)
            return " x4 damage";
        else if(i == 2 || i == 1)
            return " x2 damage";
        else
            return " damage";
    }

    public static String[] damageCalculation(int defHp, int offDamage, int offDoubling,
                                             int offAccuraccy, int offCritChance, String offName, String defName, int turn) {

        String resultText = "";
        boolean hit = hitCalculation(offAccuraccy);
        //first hit
        if(hit) {
            boolean crit = critCalculation(offCritChance);
            if(crit) {
                defHp = Math.max(0, defHp - (offDamage*3));
                resultText = offName + " crits";
                resultText = resultText + "\n" + offName + " deals " + (offDamage*3) + " to " + defName;
            }
            else {
                defHp = Math.max(0, defHp - offDamage);
                resultText = offName + " deals " + offDamage + " to " + defName;
            }
        }
        else {
            resultText = offName + " misses";
        }

        //first brave hit
        if((offDoubling == 2 || offDoubling == 3) && defHp > 0 ) {
            if(hit) {
                boolean crit = critCalculation(offCritChance);
                if(crit) {
                    defHp = Math.max(0, defHp - (offDamage*3));
                    resultText = resultText + "\n" + offName + " crits";
                    resultText = resultText + "\n" + offName + " deals " + (offDamage*3) + " to " + defName;
                }
                else {
                    defHp = Math.max(0, defHp - offDamage);
                    resultText = resultText + "\n" + offName + " deals " + offDamage + " to " + defName;
                }
            }
            else {
                resultText = resultText + "\n" + offName + " misses";
            }
        }

        //double hit
        if((offDoubling == 1 || offDoubling == 3) && defHp > 0 && turn > 0) {
            if(hit) {
                boolean crit = critCalculation(offCritChance);
                if(crit) {
                    defHp = Math.max(0, defHp - (offDamage*3));
                    resultText = resultText + "\n" + offName + " crits";
                    resultText = resultText + "\n" + offName + " deals " + (offDamage*3) + " to " + defName;
                }
                else {
                    defHp = Math.max(0, defHp - offDamage);
                    resultText = resultText + "\n" + offName + " deals " + offDamage + " to " + defName;
                }
            }
            else {
                resultText = resultText + "\n" + offName + " misses";
            }
        }

        //double brave hit
        if(offDoubling == 3 && defHp > 0 && turn > 0) {
            if(hit) {
                boolean crit = critCalculation(offCritChance);
                if(crit) {
                    defHp = Math.max(0, defHp - (offDamage*3));
                    resultText = resultText + "\n" + offName + " crits";
                    resultText = resultText + "\n" + offName + " deals " + (offDamage*3) + " to " + defName;
                }
                else {
                    defHp = Math.max(0, defHp - offDamage);
                    resultText = resultText + "\n" + offName + " deals " + offDamage + " to " + defName;
                }
            }
            else {
                resultText = resultText + "\n" + offName + " misses";
            }
        }


        //remaining HP, combat text
        return new String[]{Integer.toString(defHp), resultText};
    }

    public static boolean hitCalculation(int hit) {
        Random r = new Random();
        int r1 = r.nextInt(100);
        int r2 = r.nextInt(100);
        int averaged = (r1 + r2)/2;
        return averaged < hit;
    }

    public static boolean critCalculation(int critChance) {
        Random r = new Random();
        int r1 = r.nextInt(100);
        return r1 < critChance;
    }


}
