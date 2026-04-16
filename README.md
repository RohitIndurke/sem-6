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
