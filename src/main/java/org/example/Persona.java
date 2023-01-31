package org.example;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Persona {
    String pFIO;
    String pSex;
    int pAge;

    public Persona(String p_FIO, String p_Sex, int p_Age){
        this.pFIO = p_FIO;
        this.pSex = p_Sex;
        this.pAge = p_Age;
    }

    public String getpFIO() {
        return pFIO;
    }
    public String getpSex() {
        return pSex;
    }
    public int getpAge() {
        return pAge;
    }

    public boolean checkAddGroup(Group group){
        System.out.println("Добавить в группу " + group.deptName + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 - НЕТ\n1 - ДА");
        int choice = in.nextInt();
        return choice != 0;
    }


}
