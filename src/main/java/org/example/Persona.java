package org.example;

import java.util.Scanner;

public class Persona {
    String pFIO;
    String pGender;
    int pAge;

    public Persona(String p_FIO, String p_Gender, int p_Age){
        this.pFIO = p_FIO;
        this.pGender = p_Gender;
        this.pAge = p_Age;
    }

    public String getpFIO() {
        return pFIO;
    }
    public String getpGender() {
        return pGender;
    }
    public int getpAge() {
        return pAge;
    }

    public boolean checkAddGroup(Group group){
        System.out.print("\033[H\033[J");
        System.out.println("Добавить в группу " + group.deptName + "?");
        Scanner in = new Scanner(System.in);
        System.out.println("0 - НЕТ\n1 - ДА");
        int choice = in.nextInt();
        return choice != 0;
    }


}
