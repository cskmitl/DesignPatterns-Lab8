import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FootballScore footballScore = new FootballScore();

        // Register observers
        Observer observer1 = new LiveScoreDisplay();
        Observer observer2 = new LiveScoreDisplay();
        footballScore.registerObserver(observer1);
        footballScore.registerObserver(observer2);

        // Continuously prompt for score input until Enter is pressed
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score (or press Enter to exit): ");
            String scoreInput = scanner.nextLine();
            if (scoreInput.isEmpty()) {
                break;
            }
            footballScore.setScore(scoreInput);
        }
        scanner.close();
    }
}
