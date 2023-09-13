class Main{
    public static void main(String args[]){
        
        //create Strings
        
        String first="Java";
        String second="Python";
        String third="JavaScript";
        
        //print Strings
        
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }
}


//get length of a string

class Main{
    public static void main(String args[]){
        
        //create a String
        
        String greet="Hello World!";
        System.out.println("String: "+greet);
        
        
        //get the length of greet
        
        int length=greet.length();
        System.out.println("Length: "+length);
    }
}



//To check  whether the sting is empty or not

class Main{
    public static void main(String args[]){
        
        //create a String
        
        String s="hello";
        boolean b=s.isEmpty();
        System.out.println(b);
        System.out.println(s.isEmpty());
    }
}

//To print a specific character

class Main{
    public static void main(String args[]){
        
        //create a String
        
        String s="hello";
        System.out.println(s.charAt(4));
    }
}

//To change to lower case and uppercase

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        
        System.out.println("Enter a string: ");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter choice:- 0 for uppercase and 1 for lowercase");
        int i=sc.nextInt();
        switch(i){
        case 0:
            System.out.println(s.toUpperCase());
            break;
            case 1:
            System.out.println(s.toLowerCase());
            break;
            default:
            System.out.println("Wrong number entered");
        }    
    }
}


//To join two strings

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        
       // create first String
       
       String first="Java";
       System.out.println("First String:" +first );
       
       //create secong string
       
       String second="Programming";
       System.out.println("Second String: "+second);
       
       //join two strings
       
       String joinedString=first.concat(second);
       System.out.println("Joines string is "+joinedString);
    }
}


//To join two strings

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter your name in lowercase");
       String name;
       name=sc.nextLine();
       System.out.println("Enter your Enrollment no.");
       String Enroll=sc.nextLine();
       System.out.println("Enter your year: ");
       int year= sc.nextInt();
       String s=String.valueOf(year);
       String a=name.concat(s);
       String j=Enroll.substring(9,12);
       String joinedString=a.concat(j);
       System.out.println(joinedString+"@acropolis.in");
       
    }
}

// To compare two strings

class Main{
    public static void main(String args[]){
        // create 3 strings
        
        String first="Java programming";
        String second="Java programming";
        String third="Python programming";
        
        //compare first and second strings
        
        boolean result1=first.equals(second);
        System.out.println("Strings first and second are equal: "+result1);
        
        //compare first and third strings
        
        boolean result2=first.equals(third);
        System.out.println("Strings first and third are equal: "+result2);
    }
}
