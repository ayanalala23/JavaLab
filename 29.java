public class CommandParam{
  static int s=0;
  public static void main(String args[]){
    System.out.println(args.length);
    for(int i=0;i<args.length;i++){
      s=s+Integer.parseInt(args[i]);
    }
    System.out.println("the sum is"+s);
  }



public class CommandParam{
  static Double s=0D;
  public static void main(String args[]){
    System.out.println(args.length);
    for(int i=0;i<args.length;i++){
      s=s+Double.parseDouble(args[i]);
    }
    System.out.println("the sum is"+s);
  }

  
public class CommandParam{
  static Float s=0F;
  public static void main(String args[]){
    System.out.println(args.length);
    for(int i=0;i<args.length;i++){
      s=s+Float.parseFloat(args[i]);
    }
    System.out.println("the sum is"+s);
  }



