package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private int a;
    private char sign;
    private int b;
    
    public Calculator(String mathExpression) {
        String[] mathExpressionArray = mathExpression.split(" ");
        a = Integer.parseInt(mathExpressionArray[0]);
        sign = mathExpressionArray[1].charAt(0);
        b = Integer.parseInt(mathExpressionArray[2]);
    }

    public int calculate() {
        switch(sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '^':
                return (int) Math.pow(a, b);
            case '%':
                return a % b;
            default:
                System.out.println("Вы ввели несуществующую команду");
                return 0;
        }
    }
}