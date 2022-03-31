package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String[] mathExpression = console.nextLine().split(" ");
                System.out.print("= ");
                Calculator calc = new Calculator(Integer.parseInt(mathExpression[0]), mathExpression[1].charAt(0), Integer.parseInt(mathExpression[2]));
                System.out.print(calc.resultCalculate());
            } 
            System.out.println("\nХотите продолжить вычисления? [yes/no]");
            choice = console.nextLine();
        }
    }
}