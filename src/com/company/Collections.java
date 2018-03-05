package com.company;

import java.util.*;

public class Collections {

    public static void main(String[] args) {
        Map<String, Integer> testResults = new HashMap<>();
        testResults.put("Anna", 4);
        testResults.put("Alex", 5);
        testResults.put("Kate", 3);
        testResults.put("John", 4);
        testResults.put("Liza", 2);
        System.out.println(getStudentsByNote(testResults, 4));
    }

    private static List<String> getStudentsByNote(Map<String, Integer> map, Integer note) {
        List<String> students = new ArrayList<>();
        map.forEach((student, note1) -> {
            if (Objects.equals(note, note1)) {
                students.add(student);
            }
        });
        return students;
    }


}
