public class LinearSearchExample{
    public static int linearSearch(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    


public static void main(String args[]){
    int arr[]={10,20,30,40,50,60,70,90};
    int key=50;
    System.out.println(key+" is found at index: "+linearSearch(arr,key));

}
}

import java.util.Scanner;
public class LinearSearchExample{
    public static int linearSearch(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    

//From user
public static void main(String args[]){
    System.out.println("Enter the number of terms");
    Scanner sc=new Scanner(System.in);
   int  n=sc.nextInt();
    int a1[]=new int[n];
    for(int i=0;i<n;i++){
        a1[i]=sc.nextInt();
    }
    for(int i:a1){
        System.out.println(i);
    }
    System.out.println("ENter an element to be searched: ");
    int key=sc.nextInt();

    System.out.println(key+" is found at index: "+linearSearch(a1,key));

}


  import java.util.Scanner;
public class LinearSearchExample{
    public static int linearSearch(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    


public static void main(String args[]){
    System.out.println("Enter the number of terms");
    Scanner sc=new Scanner(System.in);
   int  n=sc.nextInt();
    int a1[]=new int[n];
    for(int i=0;i<n;i++){
        a1[i]=sc.nextInt();
    }
    for(int i:a1){
        System.out.println(i);
    }
    System.out.println("ENter an element to be searched: ");
    int key=sc.nextInt();
    int result=linearSearch(a1,key);
    if(result==-1){
        System.out.println("Element not found");
    }else{

    System.out.println(key+" is found at index: "+linearSearch(a1,key));
    }

}
}

//By removing static and creating object
import java.util.Scanner;
public class LinearSearchExample{
    public  int linearSearch(int[]arr,int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    


public static void main(String args[]){
    LinearSearchExample ls=new LinearSearchExample();
    System.out.println("Enter the number of terms");
    Scanner sc=new Scanner(System.in);
   int  n=sc.nextInt();
    int a1[]=new int[n];
    for(int i=0;i<n;i++){
        a1[i]=sc.nextInt();
    }
    for(int i:a1){
        System.out.println(i);
    }
    System.out.println("ENter an element to be searched: ");
    int key=sc.nextInt();
    int result=ls.linearSearch(a1,key);
    if(result==-1){
        System.out.println("Element not found");
    }else{

    System.out.println(key+" is found at index: "+ls.linearSearch(a1,key));
    }

}
}






