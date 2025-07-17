package com.example.comp1011spring2025thursdays5pm;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.lang.reflect.Modifier;

public class Week10 {

    public static void main(String[] args) {

       Person p = new Person();
       p.height = 150;
       p.name = "Ben";
       p.nickname = "ProfBlanc";

       //Gson gson = new Gson();
        Gson gson = new GsonBuilder()
                //.excludeFieldsWithoutExposeAnnotation()
                .excludeFieldsWithModifiers(Modifier.PRIVATE, Modifier.PROTECTED)
                .create();
       String json = gson.toJson(p);

        System.out.println(json);


        Person p2 = gson.fromJson(json, Person.class);

    }
}
