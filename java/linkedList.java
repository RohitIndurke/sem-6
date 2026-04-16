import java.util.*;

public class LinkedListMaster {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        int choice;
        do {
            System.out.println(
                "\n1. Add End  2. Delete First  3. Display Reverse  4. Display Normal  5. Exit"
            );
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter value: ");
                list.addLast(sc.nextLine());
                System.out.println("✓ Added");
            } else if (choice == 2) {
                if (!list.isEmpty()) System.out.println(
                    "✓ Deleted: " + list.removeFirst()
                );
                else System.out.println("✗ Empty");
            } else if (choice == 3) {
                System.out.println("\n=== Reverse ===");
                for (int i = list.size() - 1; i >= 0; i--) System.out.println(
                    list.get(i)
                );
            } else if (choice == 4) {
                System.out.println("\n=== Forward ===");
                for (String s : list) System.out.println(s);
            }
        } while (choice != 5);
    }
}
