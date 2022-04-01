package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = console.nextLine();
                Calculator calc = new Calculator(mathExpression);
                System.out.print(calc.calculate());
            } 
            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            choice = console.nextLine();
        }
    }
}