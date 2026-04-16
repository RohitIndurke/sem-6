import java.util.*;

class city {

    public static void main(String args[]) {
        Map<String, String> CityCode = new TreeMap<>();

        int n;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print(
                "\n1.Add city\n2.Remove city\n3.Search City\n4.Show all\n5.exit\n"
            );
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("\nEnter City name\n");
                String name = sc.next();
                System.out.print("\nEnter City code\n");
                String code = sc.next();

                CityCode.put(name, code);
            } else if (n == 2) {
                System.out.print("\nEnter City name to remove\n");
                String name = sc.next();
                if (CityCode.remove(name) != null) {
                    System.out.print("\nCity Removed Done\n");
                } else {
                    System.out.print("\nCity not found \n");
                }
            } else if (n == 3) {
                System.out.print("\nEnter City name to Search\n");
                String name = sc.next();
                String re = CityCode.get(name);
                if (re != null) {
                    System.out.print("\n" + name + " Found with code" + re);
                } else {
                    System.out.print("\nnot found\n");
                }
            } else if (n == 4) {
                for (String i : CityCode.keySet()) {
                    System.out.print(i + " -> " + CityCode.get(i) + "\n");
                }
            }
        } while (n != 5);
    }
}
