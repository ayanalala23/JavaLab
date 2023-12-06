public class Main{
   public static void main(String args[]){
       CallingClass call=new CallingClass();
       
       call.<String>genericsMethod("429 and 727225 are nelan's lucky numbers");
       call.<Integer>genericsMethod(25);
       call.<Boolean>genericsMethod(true);
   } 
}

class CallingClass{
    public <T> void genericsMethod(T data){
        System.out.println("Generics Mehtod:");
        System.out.println("Data passed in: "+ data);
    }
}

public class Main{
   public static void main(String args[]){
       CallingClass call=new CallingClass();
       
       call.<String,Integer>genericsMethod("429 and 727225 are nelan's lucky numbers",5);
       //call.<Integer>genericsMethod(25);
       //call.<Boolean>genericsMethod(true);
   } 
}

class CallingClass{
    public <T,V> void genericsMethod(T data, V data1){
        System.out.println("Generics Mehtod:");
        System.out.println("Data passed in: "+ data+ "Generic Method: "+data1);
    }
}

public class Main{
    public static void main(String args[]){
        
        GenericsClass<Integer> intObj=new GenericsClass<>(5);
        
        System.out.println("Generic class returns: "+ intObj.returnTheData());
        
        GenericsClass<String> stringObj =new GenericsClass("Java Prgramming");
        
        System.out.println("Generics Class returns: "+ stringObj.returnTheData());
        
    }
}

class GenericsClass<T>{
    private T data;
    
    public GenericsClass(T data){
        this.data=data;
    }
    
    public T returnTheData(){
        return this.data;
    }
}


