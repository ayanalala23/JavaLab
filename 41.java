// Arithmetic Exception
public class TestThrow{
    // defining a method
    
    public static void checkNum(int num){
        if(num<1){
            throw new ArithmeticException("\n Number is negative, cannot calculate square");
        }else{
            System.out.println("Square of "+num+" is "+(num*num));
        }
    }
    
    // main method
    
    public static void main(String arga[]){
        TestThrow obj=new TestThrow();
        obj.checkNum(-3);
        System.out.println("Rest of the code...");
    }
}

// Null pointer Exception
public class TestThrow{
    // defining a method
    
    public static void checkNum(String s){
        if(s==null){
            throw new NullPointerException("\n Null String");
        }else{
            System.out.println("String is "+s);
        }
    }
    
    // main method
    
    public static void main(String arga[]){
        TestThrow obj=new TestThrow();
        obj.checkNum(null);
        System.out.println("Rest of the code...");
    }
}

//Throws
public class Main{
    static void checkAge(int age) throws ArithmeticException
    {
        if(age<18){
            throw new ArithmeticException("Access Denied-You must be at least 18 years old");
        }else{
            System.out.println("Access granted-You are old enough!");
        }
    }
    
    
    public static void main(String args[]){
        checkAge(15);
        System.out.println("Rest of the code..");
    }
}

public class TestThrowandThrows{
    static void method() throws ArithmeticException
    {
        System.out.println("Inside the method");
        throw new ArithmeticException("Throwing ArithmeticException");
    }
    public static void main(String args[]){
        try{
            method();
        }
        catch(ArithmeticException e)
        {
            System.out.println("caught in main() method");
        }
    }
}

public class testThrows{
    public static int divideNum(int m,int n) throws ArithmeticException{
        int div=m/n;
        return div;
    }
    
    public static void main(String args[]){
        testThrows obj=new testThrows();
        try{
            System.out.println(obj.divideNum(45,0));
        }
        catch(ArithmeticException e){
          System.out.println("\n Number cannot be divided by 0");  
        }
        System.out.println("Rest of the code....");
    }
}

import java.util.Scanner;
public class A{
    public static void method1(int a[])throws ArrayIndexOutOfBoundsException{
        for(int i=0;i<=a.length;i++){
            System.out.println(a[i]);
        }
    }

public static void main(String args[]){
    int a[];
    System.out.println("Enter size");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    a=new int[n];
    try{
        method1(a);
    }
    catch(ArrayIndexOutOfBoundsException e){
        System.out.println("Wrong index");
    }
    System.out.println("Rest of the code...");
}
}

