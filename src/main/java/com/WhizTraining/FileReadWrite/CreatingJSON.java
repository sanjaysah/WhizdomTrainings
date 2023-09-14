package com.WhizTraining.FileReadWrite;

import org.json.JSONArray;
import org.json.simple.JSONObject;

public class CreatingJSON {
    public static void main(String[] args) {
        JSONObject emp1 = new JSONObject();
        emp1.put("name","emp1");
        emp1.put("place","INDIA");

        JSONObject emp2 = new JSONObject();
        emp2.put("name","emp2");
        emp2.put("place","UK");

        JSONArray eArray = new JSONArray();
        eArray.put(emp1);
        eArray.put(emp2);

        JSONObject studentDetails = new JSONObject();
        studentDetails.put("StudentDetails",eArray);

        System.out.println(studentDetails.toJSONString());
    }
}
