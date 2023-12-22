import java.io.File;
public class Main
{
	public static void main(String[] args) {
	File file =new File("newFile.txt");
	try{
	    boolean value=file.createNewFile();
	    if(value){
	        System.out.println("this new file is created");
	    }
	    else{
	         System.out.println("the file already exist");
	    }
	}
	catch(Exception e){
	    e.getStackTrace();
	}
	}
}


import java.io.FileReader;
public class Main
{
	public static void main(String[] args) {
char[] array=new char[100];
	try{
	    	FileReader input =new FileReader("newFile.txt");
	    input.read(array);
	    System.out.println("data in the file ");
	    	    System.out.println(array);
	    	    input.close();
	}
	catch(Exception e){
	    e.getStackTrace();
	}
	}
}


import java.io.FileWriter;
public class Main
{
	public static void main(String[] args) {
String data="This is the data in the output file ";
	try{
	    	FileWriter  output =new FileWriter("a.txt");
	    output.write(data);
	    System.out.println("data  is written into the file ");
	    	    System.out.println();
	    	    output.close();
	}
	catch(Exception e){
	    e.getStackTrace();
	}
	}
}


import java.io.File;
public class Main
{
	public static void main(String[] args) {
	try{
	    	File file =new File("a.txt");
	  boolean value=file.delete();
	  if(value){
	      System.out.println("the file is deleted");
	  }
	  else{
	       System.out.println("the file is not deleted");
	  }
	}
	catch(Exception e){
	    e.getStackTrace();
	}
	}
}


import java.io.*;
public class Main
{
	public static void main(String[] args) {
	try{
	    	File file =new File("a.txt");
	    	FileWriter fr=new FileWriter(file,true);
	  fr.write("  java file handling\n");
	  fr.close();
	}
	catch(Exception e){
	    e.getStackTrace();
	}
	}
