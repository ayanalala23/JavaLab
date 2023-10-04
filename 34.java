// Declare 2D array , initialize it and display it


public class Array{
    public static void main(String args[]){
       
        int a[][]={{10,20},{30,40},{50,60}};
        System.out.println("Two dimensional array elements are: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                System.out.println(a[i][j]+" ");
            }
        }
    }
}

// Declare 2D array , initialize it and display it

import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a[][]=new int[4][3];
       System.out.println("Enter the elements of an array");
       for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
               a[i][j]=sc.nextInt();
           }
       }
       for(int i=0;i<4;i++){
           for(int j=0;j<3;j++){
               System.out.println(a[i][j]);
           }
       }System.out.println();
        
    }
}


// Array of different number of rows and columns
public class Array{
    public static void main(String args[]){
        String salutation[][]={{"Mr.","Mrs.","Ms."},{"Kumar"}};
        System.out.println(salutation[0][0]+salutation[1][0]);
        System.out.println(salutation[0][1]+salutation[1][0]);
        System.out.println(salutation[0][2]+salutation[1][0]);
    }
}

// Size of row and column

import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        int [][]board=new int[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=i+j;
            }
        }
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                System.out.println(board[i][j]);
            }
            System.out.println();
        }
        
    }
}
// using deepToString

import java.util.Scanner;
import java.util.Arrays;
public class Array{
    public static void main(String args[]){
        int [][]board=new int[3][3];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                board[i][j]=i+j;
            }
        }
        
                System.out.println(Arrays.deepToString(board));
            
            
        
        
    }
}
