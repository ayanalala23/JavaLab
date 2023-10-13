//Interfaces
 interface solution{
     public void Hello();
     public void Welcome();
 }
 public class A implements solution{
     public void Hello(){
         System.out.println("Hello World");
     }
     public void Welcome(){
         System.out.println("Welcome to Eureka");
     }
     public static void main(String args[]){
         A a=new  A();
         a.Hello();
         a.Welcome();
        }
 }

//create an interface called calculator

 interface calculator{
     public void sum();
     public void diff();
     public void prod();
     public void quotient();
 }
 public class User1 implements calculator{
     public void sum(){
         System.out.println(4+5);
     }
     public void diff(){
         System.out.println(16.9-14.5);
     }
     public void prod(){
         System.out.println(19*5);
     }
     public void quotient(){
         System.out.println(30/6);
     }
     public static void main(String args[]){
         User1 u=new User1();
         u.sum();
         u.diff();
         u.prod();
         u.quotient();
        }
 }

//create an interface called machine

 interface Machine{
     public void start();
     public void stop();
 }
 
 class Waterpump implements Machine{
     public void start(){
         System.out.println("Water pump is starting");
     }
     public void stop(){
         System.out.println("Water pump is stopping");
        }
 }
 
 public class Testing{
     public static void main(String args[]){
         Machine machine=new Waterpump();
         machine.start();
         machine.stop();
         
         paint(new Waterpump());
     }
     
     public static void paint(Machine m){
         m.stop();
         System.out.println("Painting...");
         m.start();
     }
 }
