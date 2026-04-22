import java.util.*;

public class ques1 {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");
        int n=sc.nextInt();
        sc.nextLine();

        for(int i=0;i<n;i++){
            set.add(sc.nextLine());
        }

        System.out.println(set);
    }
}
