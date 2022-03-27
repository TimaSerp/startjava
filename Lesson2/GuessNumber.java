import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int randomNum;
    private int playerNum;
    private boolean checking = true;
    private String player1Name;
    private String player2Name;

    public void setPlayer1Name(String player1Name) {
        this.player1Name = player1Name;
    }

        public void setPlayer2Name(String player2Name) {
        this.player2Name = player2Name;
    }

    public boolean getChecking() {
        return checking;
    }

    public void setChecking(boolean checking) {
        this.checking = checking;
    }

    public void setRandomNum(int randomNum) {
        this.randomNum = randomNum;
    }

    public int getRandomNum() {
        return randomNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void guessNumber() {
        Scanner console = new Scanner(System.in);
        Random random = new Random();
        String choice = "yes";
        //Все, что ниже до while можно убрать, если в сообщении написать что-то вроде "Играем?"
        randomNum = random.nextInt(100);
        checking = true;
        for(int i = 1; checking; i++) {
            if (i % 2 == 1) {
                System.out.println("\nИгрок " + player1Name + " делает свой ход.");
            } else {
                System.out.println("\nИгрок " + player2Name + " делает свой ход.");
            }
            playerNum = console.nextInt();
            if(playerNum > randomNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
            } else if(playerNum < randomNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы выиграли!");
                checking = false;
            }
        }
        while (true) {
            System.out.println("\nХотите продолжить игру? [yes/no]");
            choice = console.nextLine();
            if (choice.equals("no")) {
                break;
            } else if (choice.equals("yes")) {
                randomNum = random.nextInt(100);
                checking = true;
                for(int i = 1; checking; i++) {
                    if (i % 2 == 1) {
                        System.out.println("\nИгрок " + player1Name + " делает свой ход.");
                    } else {
                        System.out.println("\nИгрок " + player2Name + " делает свой ход.");
                    }
                    playerNum = console.nextInt();
                    if(playerNum > randomNum) {
                        System.out.println("Данное число больше того, что загадал компьютер");
                    } else if(playerNum < randomNum) {
                        System.out.println("Данное число меньше того, что загадал компьютер");
                    } else {
                        System.out.println("Вы выиграли!");
                        checking = false;
                    }
                }
            }
        }
    }
}