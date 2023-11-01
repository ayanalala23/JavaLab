public class A implements Runnable{
    public void run(){
         try{
            for(int i=0;i<10;i++){
                System.out.println("Threads");
                Thread.sleep(2000);
            }
        }
        catch(Exception e){
            System.out.println("Currently executing thread is interrupted");
        }
        System.out.println("Currently executing thread run is terminated");
    }
    
    public static void main(String args[]){
        for(int i=0;i<10;i++){
            Thread t1=new Thread(new A());
            t1.start();
        }
    }
    
}
