package com.example.demo;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONParser
{
    public static void main(String args[])
    {
        String jsonString = "{\"Name\":\"Javainterviewpoint\",\"Age\":\"100\"}";
        JSONParser parser = new JSONParser();
        try
        {
            Object object = parser
                    .parse(jsonString);
            
            //convert Object to JSONObject
            JSONObject jsonObject = (JSONObject)object;
            
            //Reading the String
            String name = (String) jsonObject.get("Name");
            String age = (String) jsonObject.get("Age");
            
            //Printing the values
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}
