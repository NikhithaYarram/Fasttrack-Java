package com.Day4;
import java.util.*;
public class CollectionsLinkedHashSet {
    public static void main(String args[])
    {
        // Creating LinkedHashSet and
        // adding elements
        LinkedHashSet<String> lhs= new LinkedHashSet<String>();
  
        lhs.add("Zebra");
        lhs.add("Aam");
        lhs.add("Hi");
        lhs.add("Is");
        lhs.add("Animal");
     // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

