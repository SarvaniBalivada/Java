import java.util.Scanner;
public class Tempo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Fahrenheit=sc.nextInt();
        int Celsius= (Fahrenheit-32) * 5/9;
        System.out.println("The temperature in Celsius: "+ Celsius); 
        sc.close();
    }
   
}

