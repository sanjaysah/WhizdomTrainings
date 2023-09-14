package com.WhizTraining.FileReadWrite;

import org.json.simple.JSONArray;
import org.json.JSONException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class ReadJSON {
    public static void main(String[] args) throws IOException, ParseException, JSONException {
        String path = System.getProperty("user.dir")+"/src/main/java/com/WhizTraining/FileReadWrite/test.json";
        FileReader reader = new FileReader(path);
        JSONParser parser = new JSONParser();
        JSONObject json = (JSONObject) parser.parse(reader);
        //System.out.println(json.toJSONString());

        JSONArray testdata = (JSONArray) json.get("testdata");

        JSONObject TC1LoginTest = (JSONObject) testdata.get(0);
        JSONObject TC2PPTest = (JSONObject) testdata.get(1);

        String TC1Name = (String) TC1LoginTest.get("testName");
        String TC2Name = (String) TC2PPTest.get("testName");

        JSONArray TC1Data = (JSONArray) TC1LoginTest.get("data");
        JSONArray TC2Data = (JSONArray) TC2PPTest.get("data");

        JSONObject TC1Data1 = (JSONObject) TC1Data.get(0);
        JSONObject TC1Data2 = (JSONObject) TC1Data.get(1);
        JSONObject TC1Data3 = (JSONObject) TC1Data.get(2);

        JSONObject TC2Data1 = (JSONObject) TC2Data.get(0);
        JSONObject TC2Data2 = (JSONObject) TC2Data.get(1);
        JSONObject TC2Data3 = (JSONObject) TC2Data.get(2);

        /*System.out.println(TC1Data1);
        System.out.println(TC1Data2);
        System.out.println(TC1Data3);

        System.out.println(TC2Data1);
        System.out.println(TC2Data2);
        System.out.println(TC2Data3);*/

        for (int i = 0; i < testdata.size(); i++) {
            JSONObject testcase = (JSONObject) testdata.get(i);
            String tcName = (String) testcase.get("testName");
            JSONArray tcData = (JSONArray) testcase.get("data");
            //System.out.println(tcData);
            for (int j = 0; j < tcData.size(); j++) {
                JSONObject tcDataObjects = (JSONObject) tcData.get(j);
                //System.out.println(tcDataObjects.toJSONString());
                Set<String> keys = tcDataObjects.keySet();
                Iterator<String> itr = keys.iterator();
                while(itr.hasNext()){
                    String key = itr.next();
                    String value = (String) tcDataObjects.get(key);
                    System.out.println("Value of Key - "+key+" is "+value);
                }
            }
        }


    }

}
