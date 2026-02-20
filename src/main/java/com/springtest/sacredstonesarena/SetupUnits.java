package com.springtest.sacredstonesarena;

import com.springtest.sacredstonesarena.units.*;
import com.springtest.sacredstonesarena.weapons.Weapon;
import com.springtest.sacredstonesarena.weapons.swords.*;
import com.springtest.sacredstonesarena.weapons.lances.*;
import com.springtest.sacredstonesarena.weapons.axes.*;
import com.springtest.sacredstonesarena.weapons.bows.*;
import com.springtest.sacredstonesarena.weapons.magic.*;
import com.springtest.sacredstonesarena.weapons.monster.*;

public class SetupUnits {

    public static Unit decideUnit(String name){
        switch(name){
            case "Eirika" -> {return new Eirika();}
            case "Ephraim" -> {return new Ephraim();}
            case "Seth" -> {return new Seth();}
            case "Franz" -> {return new Franz();}
            case "Gilliam" -> {return new Gilliam();}
            case "Vanessa" -> {return new Vanessa();}
            case "Moulder" -> {return new Moulder();}
            case "Ross" -> {return new Ross();}
            case "Garcia" -> {return new Garcia();}
            case "Neimi" -> {return new Neimi();}
            case "Colm" -> {return new Colm();}
            case "Artur" -> {return new Artur();}
            case "Lute" -> {return new Lute();}
            case "Natasha" -> {return new Natasha();}
            case "Joshua" -> {return new Joshua();}
            case "Forde" -> {return new Forde();}
            case "Kyle" -> {return new Kyle();}
            case "Tana" -> {return new Tana();}
            case "Amelia" -> {return new Amelia();}
            case "Innes" -> {return new Innes();}
            case "Gerik" -> {return new Gerik();}
            case "Tethys" -> {return new Tethys();}
            case "Marisa" -> {return new Marisa();}
            case "LArachel" -> {return new LArachel();}
            case "Dozla" -> {return new Dozla();}
            case "Saleh" -> {return new Saleh();}
            case "Ewan" -> {return new Ewan();}
            case "Cormag" -> {return new Cormag();}
            case "Rennac" -> {return new Rennac();}
            case "Duessel" -> {return new Duessel();}
            case "Knoll" -> {return new Knoll();}
            case "Myrrh" -> {return new Myrrh();}
            case "Syrene" -> {return new Syrene();}
            case "Caellach" -> {return new Caellach();}
            case "Orson" -> {return new Orson();}
            case "Riev" -> {return new Riev();}
            case "Ismaire" -> {return new Ismaire();}
            case "Selena" -> {return new Selena();}
            case "Glen" -> {return new Glen();}
            case "Hayden" -> {return new Hayden();}
            case "Valter" -> {return new Valter();}
            case "Fado" -> {return new Fado();}
            case "Lyon" -> {return new Lyon();}
            default -> {return null;}
        }
    }
}
