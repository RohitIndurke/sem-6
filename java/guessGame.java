import java.util.*;

public class guessGame {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int count = 0;
        int n = rand.nextInt(100) + 1;
        int guess;
        do {
            System.out.print("\nEnter your guess\n");
            guess = sc.nextInt();
            count++;

            if (n < guess) {
                System.out.print("\nLower");
            } else if (n > guess) {
                System.out.print("\nHigher");
            }
        } while (guess != n);
        System.out.println(
            "\nCongratulations you guess it right in " + count + " attempt\n"
        );
    }
}
