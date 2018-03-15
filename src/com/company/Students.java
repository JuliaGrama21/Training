package com.company;

import java.util.ArrayList;
import java.util.List;

public class Students {

    public static void main(String[] args) {
        List<String> students = new ArrayList<>();

        students.add("Grama");
        students.add("Karol");
        students.add("Solovey");
        students.add("Chernivchan");
        students.add("Komarov");

       List<String> twosomes = new ArrayList<>();
       twosomes.add("Solovey");
       twosomes.add("Karol");

       twosomes.forEach(s -> {
            if (students.contains(s)){
                students.remove(s);
            }
       });
        System.out.println(students);
    }


}
