class Dog{
    String name;
    int age;

    Dog(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
         System.out.println("Name: " + name + " Age: "+ age);
    }
}

public class CreateObjectExamp {
    public static void main(String args[]){
        Dog d=new Dog("Scooby",16);
        d.display();
    }    
}
