import java.util.*;

public class multiSlip23 extends Thread {

    String str;

    multiSlip23(String me) {
        str = me;
    }

    public void run() {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if ("aeiouAEIOU".indexOf(c) != -1) {
                System.out.print(c);
                try {
                    Thread.sleep(5000);
                } catch (Exception e) {
                    System.out.print(e);
                }
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();

        multiSlip23 t1 = new multiSlip23(input);
        t1.start();
    }
}
