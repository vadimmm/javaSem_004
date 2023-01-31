package org.example;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class Group extends Department {


    public Group(String GropName){
        setDeptName(GropName);
    }

    public void addPeople(Persona persona){
        personaInDept.add(persona);
    }

}
