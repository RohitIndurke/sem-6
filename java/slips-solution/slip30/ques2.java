import java.util.*;

public class ques2 {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        pq.add(10); pq.add(50); pq.add(30);

        while(!pq.isEmpty())
            System.out.println(pq.poll());
    }
}
