package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Department {
    String deptName;
    String deptWorker;

    ArrayList<Persona> personaInDept = new ArrayList<>();
    // dep0, dep1, dep2


    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }


}
