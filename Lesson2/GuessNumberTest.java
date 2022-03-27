import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        //Вводим имена игроков
        System.out.println("Введите имя первого игрока");
        Player player1 = new Player(console.nextLine());
        System.out.println("Введите имя второго игрока");
        Player player2 = new Player(console.nextLine());
        System.out.println("В игре участвуют " + player1.getName() + " и "+ player2.getName());

        //Запускаем игру
        Random random = new Random();
        GuessNumber game = new GuessNumber();
        String choice = "yes";
        while (choice.equals("yes")) {
            game.setRandomNum(random.nextInt(100));
            // Закомменченная строка ниже для более быстрого тестирования
            // System.out.println(game.getRandomNum());
            game.setChecking(true);
            for(int i = 1; game.getChecking(); i++) {
                if (i % 2 == 1) {
                    System.out.println("\nИгрок " + player1.getName() + " делает свой ход.");
                } else {
                    System.out.println("\nИгрок " + player2.getName() + " делает свой ход.");
                }
                game.setPlayerNum(console.nextInt());
                game.guessNumber();
            }
            do {
                System.out.println("\nХотите продолжить игру? [yes/no]");
                console.nextLine();
                choice = console.nextLine();
                if (choice.equals("no")) {
                    break;
                } 
            } while (!choice.equals("yes"));
        }
    }
}