package com.example.comp1011spring2025thursdays5pm;

import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Week3 {

    public static void main(String[] args) {
            example1();
            example2();
            example3();
            example4();
    }
    static void example1(){
        int sum = 0;

        for(int i= 1; i <= 10; i++){
            sum += i;
        }
        System.out.println(sum);
    }
    static void example2(){
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum);
    }
    static void example3(){

        Stream.of("Ben", "John", "Honey", "Jane",
                "Mary", "Jennifer", "Michael")
                .filter(  v -> v.length() > 3 && v.contains("o") )
                .forEach(System.out::println);

        // v -> v.length() > 3 && v.contains("o")


    }

    static void example4(){

        /*
            Ask user to enter superhero names separated by a comma
            output all names that have "man"


         */

        Console console = System.console();
        System.out.println("Enter super hero names separated by a comma");

//        Arrays.asList(console.readLine()
//                .split(","))
//                .stream()
//                .map(String::toLowerCase)
//                .filter(v -> v.contains("man"))
//                .map(String::trim)
//                .forEach(s-> System.out.println(s));

       List<String> favHeros =  Arrays.asList(console.readLine()
                        .split(","))
                .stream()
                .map(String::toLowerCase)
                .filter(v -> v.contains("man"))
                .map(String::trim)
                .toList();

       ArrayList<String> something = new ArrayList<>(favHeros);
    }
}


/*
    Task 1

    Create a TextField in your GUI with a submit button
    Add an event to this newly created submit buttom
        Search each CameraModal Object and determine
            if any of the String instance variables partially matches (contains)
            the value of the user-inputted textfield value
            if yes: output ALL cameraModel toStrings that match
            if not: output: no matches


    Steps
        1) Get the search string text (lowercase, maybe?)
        2) cbCameraList holds a List of items
            turn this into a stream
        3) filter to determiner if
            color contains search string value contains
         lens contains search string value contains
         color contains search string value contains
         model contains search string value contains

        4)using foreach: output to output Node
 */