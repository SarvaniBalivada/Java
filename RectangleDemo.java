public class RectangleDemo {
    int length,width;    
    RectangleDemo(){
        length=10;
        width=10;
    }
    RectangleDemo(int l,int w){
        length=l;
        width=w;
    }
    public int getArea(){
      return length * width;
    } 
    public int getPerimeter(){
      return 2 * (length + width);
    }
    void display(){
        System.out.println("Length: " + length + " " +" Width: " + width);
        
    }
}
class Rectangle{
    public static void main(String[] args){
    RectangleDemo r1=new RectangleDemo();
    RectangleDemo r2=new RectangleDemo(40,70);
    r1.display();
    r2.display();
    System.out.println(r1.getArea() + " "+ r1.getPerimeter());
    System.out.println(r2.getArea() + " " + r2.getPerimeter());
    }
}
