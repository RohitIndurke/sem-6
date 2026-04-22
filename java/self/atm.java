import java.util.*;

public class atm {

    atm() {
        Scanner sc = new Scanner(System.in);
        System.out.println("*-------------------ATM-------------------*");
        int bal = 1000;
        int n,
            wid,
            pin = 0000;
        do {
            System.out.println(
                "\n 1.Deposit Money" +
                    "\n 2.View bal" +
                    "\n 3.widraw money" +
                    "\n 4.Change PIN" +
                    "\n 5.Exit"
            );
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("Enter amount to insert in bank\n");
                int mon = sc.nextInt();
                System.out.print("Enter 4 digit PIN\n");
                int upin = sc.nextInt();
                if (pin == upin) {
                    bal += mon;
                    System.out.print("Insertion of Amount " + mon);
                } else {
                    System.out.print("Invalid Pin try again");
                }
            } else if (n == 2) {
                System.out.print("TO View bal u need to enter PIN\n");
                System.out.print("Enter 4 digit PIN\n");
                int upin = sc.nextInt();
                if (pin == upin) {
                    System.out.print("Here is Your Balance " + bal);
                } else {
                    System.out.print("Invalid Pin try again");
                }
            } else if (n == 3) {
                System.out.print("Enter amount to withdraw in bank\n");
                int mon = sc.nextInt();
                System.out.print("Enter 4 digit PIN\n");
                int upin = sc.nextInt();
                if (pin == upin) {
                    if (bal >= mon) {
                        System.out.print("withdraw Done\n");
                        bal -= mon;
                        System.out.print("Ammount withdraw " + mon);
                    } else {
                        System.out.print("INsufficiant Balance\n");
                    }
                } else {
                    System.out.print("Invalid Pin try again\n");
                }
            } else if (n == 4) {
                System.out.print("Enter current PIN\n");
                int upin = sc.nextInt();

                if (pin == upin) {
                    int newpin1, newpin2;
                    System.out.print("Enter Your new PIN");
                    newpin1 = sc.nextInt();

                    System.out.print("Confirm Your new PIN");
                    newpin2 = sc.nextInt();
                    if (newpin1 == newpin2) {
                        pin = newpin2;
                        System.out.print("Pin Change\n");
                    } else if (newpin1 != newpin2) {
                        System.out.print("Enter Same pin \n");
                    }
                } else {
                    System.out.print("Invalid Pin try again\n");
                }
            }
        } while (n != 5);
    }

    public static void main(String args[]) {
        new atm();
    }
}
