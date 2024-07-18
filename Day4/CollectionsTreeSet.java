package com.Day4;
import java.util.*;
public class CollectionsTreeSet {
    public static void main(String args[])
    {
        // Creating TreeSet and
        // adding elements
        TreeSet<String> ts= new TreeSet<String>();
        ts.add("Banana");
        ts.add("Mango");
        ts.add("Apple");
        ts.add("Lettuce");
        ts.add("Cheese");
  
        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

