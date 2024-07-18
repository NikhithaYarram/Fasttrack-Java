package com.Day4;

import java.util.*;
public class CollectionsHashSet {
    public static void main(String args[])
    {
        // Creating HashSet and
        // adding elements
        HashSet<String> hs = new HashSet<String>();
  
        
        hs.add("Java");
        hs.add("Program for");
        hs.add("Collections");
        hs.add("Hash set");
        hs.add("Very helpful");
     // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}

  

