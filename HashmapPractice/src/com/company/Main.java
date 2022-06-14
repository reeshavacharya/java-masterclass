package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        HashMap<Integer, Employee> hm= new HashMap<Integer, Employee>();
        Employee e1= new Employee("reeshav",23,"manager");
        Employee e2= new Employee("anupam",30,"IT");
        Employee e3= new Employee("somnath",54,"security");

        hm.put(1,e1);
        hm.put(2,e2);
        hm.put(3,e3);

        // traversing the hashmap
        for (Map.Entry<Integer, Employee> m: hm.entrySet())
        {
            int key=m.getKey();
            Employee e=m.getValue();
            System.out.println("Employee "+ key+" information:");
            System.out.println(e.name+ " "+e.age+" "+ e.dept);
        }

    }
}
