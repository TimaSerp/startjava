package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private int a;
    private char sign;
    private int b;
    private int result;
    private String numsAndSign;
    
    public Calculator(String numsAndSign) {
        String[] mathExpression = numsAndSign.split(" ");
        a = Integer.parseInt(mathExpression[0]);
        sign = mathExpression[1].charAt(0);
        b = Integer.parseInt(mathExpression[2]);
    }

    public int calculate() {
        switch(sign) {
            case '+':
                result = Math.addExact(a, b);
                return result;
            case '-':
                result = Math.subtractExact(a, b);
                return result;
            case '/':
                result = Math.floorDiv(a, b);
                return result;
            case '*':
                result = Math.multiplyExact(a, b);
                return result;
            case '^':
                result = (int) Math.pow(a, b);
                return result;
            case '%':
                result = a % b;
                return result;
            default:
                System.out.println("Вы ввели несуществующую команду");
                return 0;
        }
    }
}