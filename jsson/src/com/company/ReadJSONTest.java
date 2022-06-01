package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJSONTest {
    public static void main(String[] args) {
        //JSON
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader("employees.json")) {
            Object obj = JSONParser.parse(reader);

            JSONArray employeeList = (JSONArray) obj;
            System.out.println(employeeList);

            employeeList.forEach(emp -> parseEmployeeObject((JSONObject) emp));

    }catch(FileNotFoundException e){
            e.printStackTrace();
    } catch(IOException e) {
        e.printStackTrace();
    }catch(ParseException e){
            e.printStackTrace();
    }

}
    private static void parseEmployeeObject(JSONObject employee){
        JSONObject employeeObject = (JSONObject) employee.get("employee");

        String firsName =(String) employeeObject.get("firstName");
        System.out.println(firsName);

        String lastName = (String) employeeObject.get("lastName");
        System.out.println(lastName);

        String website = (String) employeeObject.get("website");
        System.out.println(website);

    }
}
