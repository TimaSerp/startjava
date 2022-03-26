import java.util.Scanner;

public class Calculator {
    public void calculator() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scan.nextInt();
        System.out.println("Введите знак математической операции:");
        char sign = scan.next().charAt(0);
        System.out.println("Введите второе число:");
        int b = scan.nextInt();
        int result = a;
        boolean isRight = true;
        switch(sign) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '/':
                result = a / b;
                break;
            case '*':
                result = a * b;
                break;
            case '^':
                for(int i = 1; i < b; i++) {
                    result *= a;
                }
                break;
            case '%':
                result = a % b;
            default: 
                isRight = false;
        }
        if (isRight) {
            System.out.println(a + " " + sign + " " + b + " " + " = " + result);
        } else {
            System.out.println("Вы ввели несуществующую команду");
        }
    }
}