public class A{
    public void printArray(String []s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public void printArray(Integer []i){
        for(int i1=0;i1<i.length;i1++){
            System.out.println(i[i1]);
        }
    }
    public static void main(String args[]){
        A e=new A();
        String []s1=new String[]{"John","Ram","Shyam"};
        e.printArray(s1);
        Integer []i={1,2,3,4};
        e.printArray(i);
    }
}

public class A{
    public<E> void printArray(E []s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    
    public static void main(String args[]){
        A e=new A();
        String []s1=new String[]{"John","Ram","Shyam"};
        e.<String>printArray(s1);
        Integer []i={1,2,3,4};
        e.<Integer>printArray(i);
    }
}

public class A{
    public<E> void Search(E []s ,E key){
        for(int i=0;i<s.length;i++){
            if(s[i]==key){
                System.out.println("Element found at index"+" "+i);
                break;
            }
            }
            
            
        }
    
    
    public static void main(String args[]){
        A e=new A();
        String []s1=new String[]{"John","Ram","Shyam"};
        e.<String>Search(s1,"Ram");
        Integer []i={1,2,3,4};
        e.<Integer>Search(i,5);
    }
}

class MyData<E>{
    E i;
    public void set(E i1){
        i=i1;
    }
    public E get(){
        return (i);
    }
}

public class Main{
    public static void main(String args[]){
        MyData<Integer> m1=new MyData<Integer>();
        Integer i1=3;
        m1.set(i1);
        System.out.println(m1.get());
        MyData<String> m2=new MyData<String>();
        String s="Hello";
        m2.set(s);
        System.out.println(m2.get());
    }
}

class GenericClass<E>{
    public<E> void Search(E []arr, E key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                System.out.println("Element found at index "+i);
                break;
            }
        }
    }
}
public class A{
    public static void main(String args[]){
        String []s=new String[]{"John","Ram","Shyam"};
        GenericClass g=new GenericClass();
        g.Search(s,"John");
        Integer []i=new Integer[]{1,2,3,4,5};
        g.Search(i,4);
    }
}

