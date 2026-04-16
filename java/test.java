import java.util.*;

class test {

    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(-10);
        list.add(0);
        list.add(98);
        list.add(-23);
        list.add(11);

        for (int i : list) {
            if (i < 0) {
                System.out.println(i);
            }
        }
    }
}
