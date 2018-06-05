package com.company;

import javax.sound.sampled.BooleanControl;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here
        boolean hasADog = true;
        char favoriteLetter = 'c';
        String weather = "It is 77 outside";
        int numberOfStudentInClassroom = 1231;
        Double averageGpa = 1232.002;
        //int age = 15;
        int bootleg = 1343;
        boolean passedDumbClass = false;
        String realPerson = "Me";
        char favoriteConsole = '4';
        Double percentAnswersWrong = 87.9;
        boolean noLie = true;

        int dayOfWeek;
        //int addition = age + 12;
        //System.out.println((double)age / numberOfStudentInClassroom + (5.0 * 3));

        //System.out.println(addition);
        String s1 = new String("Who let the dogs out?");
        String s2 = "Who who who who!";
        String s3 = s1 + s2;

        System.out.println(s1 + s2);

        int add = 5 + 4;
        int subtract = 5 - 4;
        int multiply = 5 * 4;
        int divide = 5 / 4;

//        System.out.println("The time of day is " + (5 - 2));

//        System.out.println(divide);

//        System.out.println("this is the modulo" + (4 % 5));
        String hello = "Hello";
        String name = " Crystal";

        System.out.println(hello + " " + name);

        Scanner input = new Scanner(System.in);

//        System.out.println("Whats your name?");
//
//        name = input.nextLine();
//
//        System.out.println(hello + " " + name);
//
//        System.out.println("What greeting would you like?");
//        hello = input.nextLine();
//
//        System.out.println(hello + " " + name);

        System.out.println("What is your age");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("What would you like for me to call you?");

        name = input.nextLine();


        System.out.println(hello + " " + name + "! " + "You are " + age + "!");


    }
}
