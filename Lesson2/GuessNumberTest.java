import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(console.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(console.nextLine());
        GuessNumber game = new GuessNumber(player1, player2);
        String choice = "yes";
        while (!choice.equals("no")) {
            if (choice.equals("yes")) {
                game.guessNumber();
            }
            System.out.println("\nХотите продолжить игру? [yes/no]");
            choice = console.nextLine();
        }
    }
}