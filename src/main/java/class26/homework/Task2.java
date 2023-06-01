package class26.homework;

import org.apache.commons.collections4.map.LinkedMap;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

/*
Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary.
Output should be in the below format
John Smith=$100000
*/


        TreeMap<String, Integer> employee = new TreeMap<>();
        employee.put("Lacy Smith", 85000);
        employee.put("Kevin Onil", 95000);
        employee.put("John Smith", 100000);
        employee.put("Jeremy Wilson", 75000);

        int hSalary = 0;
        String hEmployee = "";

        for (var v : employee.entrySet()) {
            if (v.getValue() > hSalary) {
                hSalary = v.getValue();
                hEmployee = v.getKey();
            }
        }

        System.out.println(hEmployee + "=$" + hSalary);

    }
}

