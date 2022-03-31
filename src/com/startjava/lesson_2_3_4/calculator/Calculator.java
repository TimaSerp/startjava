package com.startjava.lesson_2_3_4.calculator;

import java.lang.Math;

public class Calculator {
    private int a;
    private char sign;
    private int b;
    private int result;
    
    public Calculator(int a, char sign, int b) {
        switch(sign) {
            case '+':
                result = Math.addExact(a, b);
                break;
            case '-':
                result = Math.subtractExact(a, b);
                break;
            case '/':
                result = Math.floorDiv(a, b);
                break;
            case '*':
                result = Math.multiplyExact(a, b);
                break;
            case '^':
                result = (int) Math.pow(a, b);
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println("Вы ввели несуществующую команду");
                return;
        }
    }

    public int resultCalculate() {
        return result;
    }
}