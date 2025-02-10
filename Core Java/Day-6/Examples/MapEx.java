package com.example.ppt;

import java.util.HashMap;
import java.util.Map;

class MapEx {
    public Map<String, String> getStudentDetails() {
        Map<String, String> studentMap = new HashMap<String, String>();
        studentMap.put("2", "Arun");
        studentMap.put("3", "Prithvi");
        studentMap.put("1", "Tom");
        studentMap.put("4", "Irfan");
        return studentMap;
    }
}