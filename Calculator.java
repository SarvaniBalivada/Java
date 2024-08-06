public class Calculator {
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double x,double y){
        System.out.println(x+y);
    }
    void add(int l,int m,int n){
        System.out.println(l+m+n);
    }
}
class CalculatorDemo{
    public static void main(String[] args){
        Calculator c1=new Calculator();
        c1.add(3,5);
        c1.add(4.5,23.7);
        c1.add(65,23,89);
    }
}
