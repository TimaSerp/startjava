import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int randomNum;
    private int playerNum;
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
            this.player1 = player1;
            this.player2 = player2;
    }

    public void guessNumber() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        randomNum = random.nextInt(100) + 1;
        System.out.println("В игре участвуют " + player1.getName() + " и "+ player2.getName());
        for(;;) {
            System.out.println("\nИгрок " + player1.getName() + " делает свой ход.");
            playerNum = console.nextInt();
            if(playerNum > randomNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(playerNum < randomNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\nПобедил " + player1.getName());
                break;
            }

            System.out.println("\nИгрок " + player2.getName() + " делает свой ход.");
            playerNum = console.nextInt();
            if(playerNum > randomNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(playerNum < randomNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("\nПобедил " + player1.getName());
                break;
            }
        }
    }
}