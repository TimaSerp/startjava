public class Calculator {
    private int a;
    private char sign;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public char getSign() {
        return sign;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    
    public void calculate() {
        int result = a;
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
                System.out.println("Вы ввели несуществующую команду");
                break;
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}