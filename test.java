class A{
     static String acc_no="ACD737756";
     static int amount=5000;
     public static void withdraw(){
         amount=amount-4000;
         System.out.println(amount);
         
     }
     public static void deposit(){
         amount=amount+1000;
         System.out.println(amount);
    }
 }
 class B extends Thread{
     public void run(){
         A.withdraw();
     }
 }
 
 class C extends Thread{
     public void run(){
         A.deposit();
     }
 }
 public class D{
     public static void main(String args[]){
     B b=new B();
     b.start();
     C c=new C();
     c.start();
     }
 }

class A
{
    public static void func(int n1,int n2,int n3){
        if(n3==0){
        for(int i=n1;i<n2;i++)
        {
            if(i%2==0)
            System.out.println(i);
    }}
    else{
    for(int i=n1;i<n2;i++)
    {
        if(i%2!=0)
        System.out.println(i);
    }
    }
    }
}
class B extends Thread{
    
    public void run()
    {
    A.func(1,20,0);
}
}
class C extends Thread{
    public void run()
    {
       
        A.func(1,20,1);
    }
}

public class D{
	public static void main(String[] args) {
		B b =new B();
		b.start();
		C c=new C();
		c.start();
	}
}


class A{
     static int BJP=0;
     static int Congress=0;
     public static void vote(String s){
         if(s=="BJP"){
             BJP++;
             System.out.println(BJP);
         }else{
             Congress++;
             System.out.println(Congress);
         }
     }
 }
 class B implements Runnable{
     public void run(){
         A.vote("BJP");
     }
 }
 class C implements Runnable{
     public void run(){
         A.vote("Congress");
     }
 }
 public class D{
     public static void main(String args[]){
         for(int i=0;i<100;i++){
         
         Thread t1=new Thread(new B());
         t1.start();
         }
         for(int i=0;i<10;i++){
         Thread t2=new Thread(new C());
         t2.start();
        }
     }
 }
