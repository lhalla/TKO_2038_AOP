import java.util.*;
public class Test {

   public static void main(String args[]) {
      // Create a tree set
      TreeSet<String> ts = new TreeSet<>();
     
      // Add elements to the tree set
      ts.add("C");
      ts.add("A");
      ts.add("B");
      ts.add("E");
      ts.add("F");
      ts.add("D");
      System.out.println(ts.first().length());
   }
}