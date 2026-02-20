package com.springtest.sacredstonesarena;

import com.springtest.sacredstonesarena.units.*;
import com.springtest.sacredstonesarena.weapons.Weapon;
import com.springtest.sacredstonesarena.weapons.swords.*;
import com.springtest.sacredstonesarena.weapons.lances.*;
import com.springtest.sacredstonesarena.weapons.axes.*;
import com.springtest.sacredstonesarena.weapons.bows.*;
import com.springtest.sacredstonesarena.weapons.magic.*;
import com.springtest.sacredstonesarena.weapons.monster.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ArenaController {

    @Value("${spring.application.name}")
    private String appName;

    private int step = 0;
    private Unit unit1;
    private Unit unit2;
    private Weapon unit1Weapon;
    private Weapon unit2Weapon;
    private Weapon tempWeapon1;
    private Weapon tempWeapon2;
    private Weapon tempWeapon3;

    @RequestMapping("/")
    public String index(Model model){
        System.out.println(appName);
        model.addAttribute("message", "Select First Unit.");
        return "index";
    }

    @PostMapping("/")
    public String index(Model model, @RequestParam String action){
        System.out.println(action);
        if(step==0) {
            unit1 = SetupUnits.decideUnit(action);
            tempWeapon1 = unit1.getInventory()[0];
            tempWeapon2 = unit1.getInventory()[1];
            tempWeapon3 = unit1.getInventory()[2];
            String src1 = "../portraits/" + unit1.getName() + ".png";
            model.addAttribute("weapon1", tempWeapon1.getWeaponName());
            model.addAttribute("weapon2", tempWeapon2.getWeaponName());
            model.addAttribute("weapon3", tempWeapon3.getWeaponName());
            model.addAttribute("message", "Select " + unit1.getName() + "'s weapon");
            model.addAttribute("unit1src", src1);
            model.addAttribute("unit1", unit1.getName());
            step++;
            return "weaponSelection";
        }
        else if(step==1) {
            if(action.equals("1")){
                unit1Weapon = tempWeapon1;
            }
            else if(action.equals("2"))
                unit1Weapon = tempWeapon2;
            else if(action.equals("3"))
                unit1Weapon = tempWeapon3;
            System.out.println(unit1Weapon.getWeaponName());
            model.addAttribute("message", "Select Second Unit.");
            step++;
            return "index";
        }
        else if(step==2){
            unit2 = SetupUnits.decideUnit(action);
            tempWeapon1 = unit2.getInventory()[0];
            tempWeapon2 = unit2.getInventory()[1];
            tempWeapon3 = unit2.getInventory()[2];
            String src2 = "../portraits/" + unit2.getName() + ".png";
            model.addAttribute("weapon1", tempWeapon1.getWeaponName());
            model.addAttribute("weapon2", tempWeapon2.getWeaponName());
            model.addAttribute("weapon3", tempWeapon3.getWeaponName());
            model.addAttribute("message", "Select " + unit2.getName() + "'s weapon");
            model.addAttribute("unit1src", src2);
            model.addAttribute("unit1", unit2.getName());
            step++;
            return "weaponSelection";
        }
        else{
            if(action.equals("1")){
                unit2Weapon = tempWeapon1;
            }
            else if(action.equals("2"))
                unit2Weapon = tempWeapon2;
            else if(action.equals("3"))
                unit2Weapon = tempWeapon3;
            System.out.println(unit2Weapon.getWeaponName());

            //damage1, damage2, hit1, hit2, crit1, crit2, double1, double2
            int[] previewStats = MainCombat.battlePreview(unit1, unit2, unit1Weapon, unit2Weapon);

            String src1 = "../portraits/" + unit1.getName() + ".png";
            String src2 = "../portraits/" + unit2.getName() + ".png";
            model.addAttribute("unit1src", src1);
            model.addAttribute("unit2src", src2);

            model.addAttribute("unit1", unit1.getName());
            model.addAttribute("unit2", unit2.getName());

            String unit1Hp = unit1.getCurrentHp() + " HP";
            String unit2Hp = unit2.getCurrentHp() + " HP";
            model.addAttribute("unit1Hp", unit1Hp);
            model.addAttribute("unit2Hp", unit2Hp);

            model.addAttribute("unit1Weapon", unit1Weapon.getWeaponName());
            model.addAttribute("unit2Weapon", unit2Weapon.getWeaponName());

            String unit1Double = MainCombat.doubleDisplay(previewStats[6]);
            String unit2Double = MainCombat.doubleDisplay(previewStats[7]);
            String unit1Damage = previewStats[0] + unit1Double + " damage";
            String unit2Damage = previewStats[1] + unit2Double + " damage";
            model.addAttribute("unit1Damage", unit1Damage);
            model.addAttribute("unit2Damage", unit2Damage);

            String unit1Hit = previewStats[2] + "% hit";
            String unit2Hit = previewStats[3] + "% hit";
            model.addAttribute("unit1Hit", unit1Hit);
            model.addAttribute("unit2Hit", unit2Hit);

            String unit1Crit = previewStats[4] + "% crit";
            String unit2Crit = previewStats[5] + "% crit";
            model.addAttribute("unit1Crit", unit1Crit);
            model.addAttribute("unit2Crit", unit2Crit);

            model.addAttribute("message", unit1.getName() + " vs " +  unit2.getName());
            return "battleScreen";
        }
    }
}
