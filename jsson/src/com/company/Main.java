package com.company;


import java.io.*;
import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader("course.json"));
            JSONObject jsonObject = (JSONObject)obj ;
            String name = (String) jsonObject.get("Name");
            String course = (String)jsonObject.get("course");
            JSONArray subject = (JSONArray) jsonObject.get("Subjects");
            System.out.println("Name: " +name);
            System.out.println("Course:" +course);
            System.out.println("Subjects:");
            Iterator iterator = subject.iterator();
            while (iterator.hasNext()){
                System.out.println(iterator.next());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
