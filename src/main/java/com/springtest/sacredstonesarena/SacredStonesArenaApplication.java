package com.springtest.sacredstonesarena;

import com.springtest.sacredstonesarena.classes.*;
import com.springtest.sacredstonesarena.units.*;
import com.springtest.sacredstonesarena.weapons.*;
import com.springtest.sacredstonesarena.weapons.swords.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SacredStonesArenaApplication {

    public static void main(String[] args){
        String s = "Orson";
        Unit unit1 = SetupUnits.decideUnit(s);
        System.out.println(unit1.getName());
        ApplicationContext context = SpringApplication.run(SacredStonesArenaApplication.class, args);
    }
}
