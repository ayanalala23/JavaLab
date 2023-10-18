// To demonstrate try and catch block


public class Main{
    public static void main(String args[]){
        try{
        //code that generates Exception
        
        int divideByZero=5/0;
        System.out.println("Rest of code in try block");
        }
        
        catch(ArithmeticException e){
            System.out.println("ArithmeticException= "+e.getMessage());
        }
    }
}

// To demonstrate try and catch block by taking input from user

import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        try{
       int n;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter value of n");
       n=sc.nextInt();
        int divideByZero=5/n;
        System.out.println("Rest of code in try block");
        }
        
        catch(ArithmeticException e){
            System.out.println("ArithmeticException= "+e.getMessage());
        }
    }
}

// To demonstrate multicatch

import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        try{
            int n=Integer.parseInt(scn.nextLine());
            if(99%n==0){
                System.out.println(n+" is a factor of 99");
            }
        }
            catch(ArithmeticException ex){
                System.out.println("Arithmetic"+ex);
            }
            catch(NumberFormatException ex){
                System.out.println("Number Format Exception"+ex);
            }
        
    }
}

// To demonstrate multicatch with OR operator

import java.util.Scanner;
public class Test{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        try{
            int n=Integer.parseInt(scn.nextLine());
            if(99%n==0){
                System.out.println(n+" is a factor of 99");
            }
        }
           catch(NumberFormatException | ArithmeticException ex){
               System.out.println("Exception encountered "+ex);
           }
    }
}

// To demonstrate multicatch with ArrayIndexOutOfBoundsException and NullPointerException

public class MultiCatch{
    public static void main(String args[]){
        String s=null;
        int arr[]={10,20,30};
        try{
            System.out.println(s.length());
            System.out.println(arr[2]);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(" Exception index out of bounds"+e1);
        }
        catch(NullPointerException e2){
            System.out.println("Exception null pointer"+e2);
        }
    }
}

// To demonstrate multicatch with ArrayIndexOutOfBoundsException and NullPointerException

public class MultiCatch{
    public static void main(String args[]){
        String s=null;
        int arr[]={10,20,30};
        try{
            //System.out.println(s.length());
            System.out.println(arr[3]);
        }
        catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(" Exception index out of bounds"+e1);
        }
        catch(NullPointerException e2){
            System.out.println("Exception null pointer"+e2);
        }
    }
}

