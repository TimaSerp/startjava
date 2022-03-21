public class MyFirstGame {
    public static void main(String[] args) {
        //Необходимо ввести число (0; 100]
        int random = 45;
        //Тут ввести можно любое число, но 50 самое рациональное
        int startNumber = 50;
        System.out.println("Вы ввели число " + startNumber);
        do {
            if(startNumber > random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                startNumber--;
                System.out.println("Вы ввели число " + startNumber);
            } else if(startNumber < random) {
                System.out.println("Данное число больше того, что загадал компьютер");
                startNumber++;
                System.out.println("Вы ввели число " + startNumber);
            }
        } while(startNumber != random);
        System.out.println("Вы победили!");
    }
}