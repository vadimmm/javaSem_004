package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
    Main run = new Main();
    ArrayList<Persona> noDeptPersona = new ArrayList();
    Group depAcc = new Group("Accounting");
    Group depIT = new Group("IT");

    run.setPersona(noDeptPersona);
    run.addPersonaToDepartment(noDeptPersona.get(0), depAcc);
    }
    public void setPersona(ArrayList<Persona> noDeptPersona){

        Scanner in = new Scanner(System.in);
        String FIO;
        String Sex;
        int Age;
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("ФИО работника: ");
        FIO = in.nextLine();
        System.out.println("ПОЛ работника: ");
        Sex = in.nextLine();
        System.out.println("Возраст работника: ");
        Age = in.nextInt();
        noDeptPersona.add(new Persona(FIO, Sex, Age));
        System.out.println(noDeptPersona);
    }
    public void addPersonaToDepartment(Persona persona, Group group){
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("Олень отказался!");
        }
    }
    public void showResultAddPersonaToGroup(Group group){
        System.out.println("Работники отдела: ");
        System.out.println(group.personaInDept);
    }

}