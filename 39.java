// To demonstrate use of access specifiers

class Data{
    private String name;
    
    public void set(String n){
        this.name=n;
    }
    public void get(){
        System.out.println(name);
    }
}

public class Main{
    public static void main(String args[]){
        Data d=new Data();
        d.set("Ayana");
        d.get();
    }
}

// Protected access modifiers

class Animal{
    protected void display(){
        System.out.println("I am an animal");
    }
}

class Dog extends Animal{
    public static void main(String args[]){
        Dog dog= new Dog(){
            dog.display();
        }
    }
}

// Public access modifiers

class Animal{
    public int legCount;
    public void display(){
        System.out.println("I am an animal");
        System.out.println("I have "+legCount+" legs.");
    }
}

public class Main{
    public static void main(String args[]){
        Animal a=new Animal();
        a.legCount=4;
        a.display();
    }
}
