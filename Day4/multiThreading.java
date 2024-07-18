package com.Day4;

class multi extends Thread{
    public void run()
    {
        try
        {
            for(int i=0;i<5;i++){
            // Displaying the thread that is running
            System.out.println ("Thread " +
                  Thread.currentThread().getId() +
                  " is running");
            }
        }
        catch (Exception e)
        {
            // Throwing an exception
            System.out.println ("Exception is caught");
        }
    }


}
public class multiThreading {  
    
    public static void main(String[] args) { 
        
        multi object = new multi();
            object.start();
        for(int i=0;i<5;i++){
            // Displaying the thread that is running
            System.out.println ("main Thread " +
                  Thread.currentThread().getId() +
                  " is running");
            }
    }
}

