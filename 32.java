// Declaring an Array

public class Array{
    public static void main(String args[]){
        int arr[]=new int[3];
        int arr[3];
        int arr[]=new int[3]{1,2,3,4};
    }
}


// WAP to initialize the integer array and display it

import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        int a[]=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("Enter numbers: ");
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    }
}

// WAP to demonstrate for each loop for array

import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        int a[]={1,2,3,4,5};
        for(int i:a)
        System.out.println(i);
        
    }
}


// WAP to demonstrate for each loop for string array

import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        String a[]={"dog","cat","man"};
        for(String i:a)
        System.out.println(i);
        
    }
}


// WAP to calculate the sum and average of all the values stored in the integer array

import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        int sum=0;
        int a[]={1,2,3,4,5};
        for(int i:a)
        sum=sum+i;
        int avg=sum/a.length;
        System.out.println("Sum is: "+sum+" "+"Average is: "+avg);
        
    }
}

// WAP to sort the given integer and string array

import java.util.Arrays;
public class Array{
    public static void main(String args[]){
        int a[]={10,30,2,5,6,7};
        String s[]={"dog","rat","cat","man"};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(s));
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
    }
}

// WAP to find the number of odd and even numbers in the array
import java.util.Arrays;
public class Array{
    public static void main(String args[]){
    
        int a[]={10,30,2,5,6,7};
        int count=0,odd=0;
        for(int i:a){
            

        if(i%2==0){
            count++;
        }
        else{
            odd++;
        }
}
      
    
    System.out.println("Even: "+count);
    System.out.println("Odd: "+odd);
    }
}

//WAP find minimum and maximum element of an array

import java.util.Arrays;
public class Main{
  public static void main(String args[]){
    int a={10,20,4,3,6,7,8}, max=0,nim=0;
    System.out.println(Array.toString(a));
    Arrays.sort(a);
    System.out.println("Min"+a[0];
    System.out.println("Max"+a.length-1);
  }
}

// WAP to create a string array an take input from user to search a particular string
import java.util.Arrays;
import java.util.Scanner;
public class Array{
    public static void main (String args[]){
        String s[]={"dog","cat","man"};
        System.out.println("Enter a string to be searched");
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        for(int i=0;i<s.length;i++){
            if(s[i].equals(a)){
                System.out.println("String found");
                break;
            }
        }
        
    }
}



