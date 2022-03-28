import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        String choice = "yes";
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(console.nextLine());
        game.setPlayer1Name(player1.getName());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(console.nextLine());
        game.setPlayer2Name(player2.getName());
        System.out.println("В игре участвуют " + player1.getName() + " и "+ player2.getName());
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.guessNumber();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            choice = console.nextLine();
        }
    }
}