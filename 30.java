class Marriage{
  String name;
  String surname;
  public Marriage(String r, String i){
    name=r;
    surname=i;
  }
  static Marriage add(Marriage ob1, Marriage ob2){
    retun new Marriage(ob1.name , ob1.surnmae+" "+ob2.surname);
  }
  public static void main(String args[]){
    Marriage ob1=new Marriage("Aishwarya","Rai");
    Marriage ob2=new Marriage("Abhishek","Bachchan");
    Marriage ob3=Marriage.add(ob1,ob2);
    System.out.println(ob3.name+" "+ob3.surname);
  }
}
    
