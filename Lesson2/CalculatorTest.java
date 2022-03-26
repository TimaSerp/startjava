import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculatorOne = new Calculator();
        Scanner scan = new Scanner(System.in);
        calculatorOne.calculator();
        while (true) {
            System.out.println("Хотите продолжить вычисления? [yes/no]");
            String choice = scan.nextLine();
            if (choice.equals("yes")) {
                calculatorOne.calculator();
            } else if (choice.equals("no")) {
                break;
            } 
        }
    }
}