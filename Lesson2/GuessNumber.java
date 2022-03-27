public class GuessNumber {
    private int randomNum;
    private int playerNum;
    private boolean checking = true;

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