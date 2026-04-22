import java.util.*;

public class ques2 {
    public static void main(String[] args){
        Vector<String> v=new Vector<>();
        v.add("A"); v.add("B");

        Enumeration<String> e=v.elements();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}
