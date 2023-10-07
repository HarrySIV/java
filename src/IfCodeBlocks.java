public class IfCodeBlocks {
    public static void main(String[] args) {
        boolean gameOVer = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score >= 0) {
            System.out.println("You scored " + score + " points!");
        } else {
            System.out.println("You didn't score any points...");
        }
    }
}
