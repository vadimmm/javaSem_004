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

    run.UpdateDepint();
    }
    public void setPersona(ArrayList<Persona> noDeptPersona){

        Scanner in = new Scanner(System.in);
        String FIO;
        String Gender;
        int Age;
//        System.out.println("-".repeat(25));
        System.out.println(". ".repeat(15) + ".");
        System.out.println("КАРТОЧКА НОВОГО РАБОТНИКА");
        System.out.println(". ".repeat(15) + ".");
        System.out.print("ФИО работника: ");
        FIO = in.nextLine();
        System.out.print("ПОЛ работника: ");
        Gender = in.nextLine();
        System.out.print("Возраст работника: ");
        Age = in.nextInt();
        noDeptPersona.add(new Persona(FIO, Gender, Age));
//        System.out.println(noDeptPersona);
    }
    public void addPersonaToDepartment(Persona persona, Group group){
        boolean check = persona.checkAddGroup(group);
        if (check) {
            group.addPeople(persona);
        } else {
            System.out.println("Олень отказался!");
        }
        System.out.println("Завершено");
    }
    public void showResultAddPersonaToGroup(Group group){
        System.out.println("Работники отдела: ");
        System.out.println(group.personaInDept);
    }

    public String UpdateDepint()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Хотите перейти в другой отдел?:");
        System.out.println("0 - НЕТ\n1 - ДА");
        int answer = in.nextInt();

        if (answer==0 ){
            System.out.println("Принят");}
        if(answer==1){
            System.out.println("Выберите отдел для перехода:");
            System.out.println("IT\nLogistics\nFinance");
        }
        String answer1 = in.next();
        return answer1;
    }
}