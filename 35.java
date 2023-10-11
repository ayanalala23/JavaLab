// to demonstrate overloading and overriding

class Parent{
    void display(){
        System.out.println("This is parent class");
    }
    void show(int num){
        System.out.println("The number in the parent class is: "+num);
    }
}

class Child extends Parent{
    void display(){
        System.out.println("This is the child class");
    }
    void show(double num){
        System.out.println("The number in the child class is: "+num);
    }
}
public class Main{
    public static void main(String[] args){
        Parent parentObj= new Parent();
        Child childObj=new Child();
        
        parentObj.show(5);
        childObj.show(75);
        
        parentObj.display();
        childObj.display();
    }
}


// to demonstrate overloading and overriding and super keyword

class Animal{
    public void eat(){
        System.out.println("I can eat");
    }
}
class Dog extends Animal{
    public void eat(){
        super.eat();
        System.out.println("I eat dog food");
    }


    public void bark(){
    System.out.println("I can bark");
  }
}

public class Main{
    public static void main(String args[]){
        Dog labrador=new Dog();
        labrador.eat();
        labrador.bark(); 
    }
}

// to demonstrate overloading and overriding and final keyword

public class Main{
    public static void main(String args[]){
        final int age=32;
        age=45;
        System.out.println("Age: "+age);
    }
}
class A extends Main{
    Main m=new Main();
    m.age=43;
    public static void main(String args[]){
        age=89;
        System.out.println("Age: "+age);
    }
}

// to demonstrate overloading and overriding and final method

class FinalDemo{
    public final  void display(){
        System.out.println("This is a final method");
    }
}
public class Main extends FinalDemo{
    public  final void display(){
        System.out.println("The final method is overridden");
    }
    public static void main(String args[]){
        Main obj= new Main();
        obj.display();
    }
}

// to demonstrate overloading and overriding and final lass

final class FinalClass{
    public  void display(){
        System.out.println("This is a final method");
    }
}
public class Main extends FinalClass{
    public void display(){
        System.out.println("The final method is overridden");
    }
    public static void main(String args[]){
        Main obj= new Main();
        obj.display();
    }
}

