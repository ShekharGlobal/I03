package com.example.ppt;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExMain {
    public static void main(String args[]) {
        MapEx ex1 = new MapEx();
        Map<String, String> studentMap = ex1.getStudentDetails();
        ///System.out.println(studentMap);
        
        Set<String> keys = studentMap.keySet();
        Iterator<String> iterator = keys.iterator();
        
        System.out.println("Student Details");
        while (iterator.hasNext()) {
            String rollNo = iterator.next();
            String name = studentMap.get(rollNo);
            
            System.out.println("Roll No: " + rollNo + " Name: " + name);
        }
    }
}
