package com.startjava.lesson_2_3.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.println("Введите первое число");
                calc.setA(console.nextInt());
                System.out.println("\nВведите знак математической операции");
                calc.setSign(console.next().charAt(0));
                System.out.println("\nВведите второе число");
                calc.setB(console.nextInt());
                calc.calculate();
            } 
            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            console.nextLine();
            choice = console.nextLine();
        }
    }
}