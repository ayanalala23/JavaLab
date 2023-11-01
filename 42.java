//Implementation of thread using thread class/inheriting thread class

public class Main extends Thread{
    public static void main(String args[]){
        Main thread=new Main();
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    
    public void run(){
        System.out.println("This code is running in a thread");
    }
}

//Implementation of thread using runnable interface

public class Main implements Runnable{
    public static void main(String args[]){
        Thread t=new Thread();
        t.start();
        System.out.println("This code is outside of the thread");
    }
    
    public void run(){
        System.out.println("This code is running in a thread");
    }
}

//Implementation of multiple threads using thread class

public class Main extends Thread{
    public static void main(String args[]){
        Main thread1=new Main();
        thread1.start();
        Main thread2=new Main();
        thread2.start();
        System.out.println("This code is outside of the thread");
    }
    
    public void run(){
        System.out.println("This code is running in a thread");
    }
}

//Implementation of multiple threads using runnable interface

public class Main implements Runnable{
    public static void main(String args[]){
        Main thread1=new Main();
        Thread t1=new Thread(thread1);
        t1.start();
        Thread t2=new Thread();
        t2.start();
        System.out.println("This code is outside of the thread");
    }
    
    public void run(){
        System.out.println("This code is running in a thread");
    }
}

import java.util.Scanner;
class Table extends Thread{
    public static void main(String args[]){
        Table t1=new Table();
        t1.start();
        Table t2=new Table();
        t2.start();
    }
    
    public void run(){
        System.out.println("Enter the number whose table you want to print");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int p=n*i;
            System.out.println(n+" "+"*"+" "+i+" "+"="+" "+p);
        }
    }
}

// Starting the thread using constructor and using thread.sleep 

class ThreadCount extends Thread{
    ThreadCount(String s){
        super(s);
        System.out.println("New thread created"+this);
        start();
    }
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println("New thread created"+this);
                Thread.sleep(1500);
            }
        }
        catch(Exception e){
            System.out.println("Currently executing thread is interrupted");
        }
        System.out.println("Currently executing thread run is terminated");
    }
    
    public static void main(String args[]){
        ThreadCount t1=new ThreadCount("t1");
        ThreadCount t2=new ThreadCount("t2");
    }
}


