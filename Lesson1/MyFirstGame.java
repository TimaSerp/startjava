public class MyFirstGame {
    public static void main(String[] args) {
        //Необходимо ввести число (0; 100]
        int random = 45;
        //Тут можно ввести любое число, но 50 самое рациональное
        int playerNumber = 50;
        System.out.println("Вы ввели число " + playerNumber);
        do {
            if(playerNumber > random) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNumber--;
            } else if(playerNumber < random) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNumber++;
            }
        System.out.println("Вы ввели число " + playerNumber);
        } while(playerNumber != random);
        System.out.println("Вы победили!");
    }
}