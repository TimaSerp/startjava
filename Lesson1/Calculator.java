public class Calculator {
    public static void main(String[] args) {
        //Вводим числа
        int a = 1;
        int b = 2;
        int result = a;
        //Вводим команду
        char sign = '+';
        if(a > 0 & b > 0) {
            if(sign == '+') {
                result = a + b;
            } else if(sign == '-') {
                result = a - b;
            } else if(sign == '*') {
                result = a * b;
            } else if(sign == '/') {
                result = a / b;
            } else if(sign == '^') {
                for(int i = 1; i <= b; i++) {
                    result *= a;
                }
            } else if(sign == '%') {
                result = a % b;
            }
            System.out.println(a + " " + sign + " " + b + " = " + result);
        } else {
            System.out.println("Введите целые положительные числа.");
        }
    }
}