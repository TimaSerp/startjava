import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int randomNum;
    private int playerNum;

    public void guessNumber() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        String choice = "yes";
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(console.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(console.nextLine());
        System.out.println("В игре участвуют " + player1.getName() + " и "+ player2.getName());
        while (true) {
            if (choice.equals("no")) {
                break;
            } else if (choice.equals("yes")) {
                randomNum = random.nextInt(100);
                for(int i = 1; true; i++) {
                    if (i % 2 == 1) {
                        System.out.println("\nИгрок " + player1.getName() + " делает свой ход.");
                    } else {
                        System.out.println("\nИгрок " + player2.getName() + " делает свой ход.");
                    }
                    playerNum = console.nextInt();
                    if(playerNum > randomNum) {
                        System.out.println("Данное число больше того, что загадал компьютер");
                    } else if(playerNum < randomNum) {
                        System.out.println("Данное число меньше того, что загадал компьютер");
                    } else {
                        System.out.println("\nВы выиграли!");
                        if (i % 2 == 1) {
                            System.out.println("Победил " + player1.getName());
                        } else {
                            System.out.println("Победил " + player2.getName());
                        }
                        break;
                    }
                }
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            console.nextLine();
            choice = console.nextLine();
        }
    }
}