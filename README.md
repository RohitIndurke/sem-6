

````md
# 🚀 Java Exam All-in-One Templates

Quick reusable templates for Java practical exams.

---

## 📦 1. COLLECTIONS TEMPLATE (Map / Set)

Use this for any Map / Set question.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Map<String, String> data = new TreeMap<>();

        // Add
        data.put("A", "Apple");
        data.put("B", "Ball");

        // Remove
        data.remove("A");

        // Search
        System.out.println(data.get("B"));

        // Display
        for(String k : data.keySet()) {
            System.out.println(k + " → " + data.get(k));
        }
    }
}
````

---

## 🔗 2. LINKEDLIST TEMPLATE

Use this for LinkedList questions.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        // Add
        list.addLast("A");
        list.addLast("B");
        list.addLast("C");

        // Remove
        list.removeFirst();

        // Display
        System.out.println(list);

        // Reverse Display
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}
```

---

## 🧵 3. MULTITHREADING TEMPLATE

Use this for thread-related questions.

```java
class MyThread extends Thread {
    String text;
    int delay;

    MyThread(String text, int delay) {
        this.text = text;
        this.delay = delay;
    }

    public void run() {
        try {
            for(char c : text.toCharArray()) {
                System.out.println(c);
                Thread.sleep(delay * 1000);
            }
        } catch (InterruptedException e) {}
    }
}

public class Main {
    public static void main(String[] args) {
        new MyThread("TEXT1", 2).start();
        new MyThread("TEXT2", 2).start();
    }
}
```
