import java.util.*;

class student {

    public static void main(String args[]) {
        Hashtable<String, String> st = new Hashtable<>();
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("\n1.Add Student\n2.show Studnt\n3.Exit\n");
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("\nEnter City name\n");
                String name = sc.next();
                System.out.print("\nEnter City code\n");
                String ph = sc.next();

                st.put(name, ph);
            } else if (n == 2) {
                for (String i : st.keySet()) {
                    System.out.print(
                        "name\n" + i + "phone no" + st.get(i) + "\n"
                    );
                }
            } else {
                System.out.print("\nINvalid input\n");
            }
        } while (n != 5);
    }
}
