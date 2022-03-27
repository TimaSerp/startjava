import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner console = new Scanner(System.in);
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("Введите первое число");
            calc.setA(console.nextInt());
            System.out.println("Введите знак математической операции");
            calc.setSign(console.next().charAt(0));
            System.out.println("Введите второе число");
            calc.setB(console.nextInt());
            calc.calculate();
            do {
                System.out.println("Хотите продолжить вычисления? [yes/no]");
                choice = console.nextLine();
                if (choice.equals("no")) {
                    break;
                } 
            } while (!choice.equals("yes"));
        }
        
    }
}