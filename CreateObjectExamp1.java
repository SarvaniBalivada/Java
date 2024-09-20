class Car{
    String model;
    String color;
    Car(String model,String color){
        this.model=model;
        this.color=color;
    }
    void display(){
        System.out.println("Model " + model + " Color: " +color);
    }
}

public class CreateObjectExamp1 {
    public static void main(String args[]){
        Car c1=new Car("Lamborghini","Purple");
        Car c2=new Car("Telsa","Red"); 
        c1.display();
        c2.display();
    }
}
