package com.company;

import java.util.Scanner;

public class Lesson1 {  public static void main(String[] args) {
//        System.out.println("Hello, world!");
    int a = 0;
    int b = 5;
    int sum = a + b;
    System.out.println("Сумма " + sum);
    int multiply = a * b;
    System.out.println("Произведение " + multiply);
    int difference = a - b;
    System.out.println("Разность " + difference);
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.next();
    String userInput = new Scanner(System.in).next();
    System.out.println(userInput);
    }
}
