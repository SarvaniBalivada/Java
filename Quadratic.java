import java.util.Scanner;

public class Quadratic{

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        double root1,root2,d;
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        d=b*b-(4*a*c);
        if(d>=0)
        {
            root1=(-b+Math.sqrt(d))/(2*a);
            root2=(-b-Math.sqrt(d))/(2*a);
            if(root1==root2){
            System.out.printf("root1 = root2 = %.2f",root1,root2);}
            else{
                System.out.printf("root1 = %.2f and root2 = %.2f",root1,root2);
            }
        }
        else
        {
            double real=-b/(2*a);
            double imaginary=Math.sqrt(-d)/(2*a);
            System.out.printf("root1 = %.2f+%.2fi\n",real,imaginary);
            System.out.printf("root2 = %.2f-%.2fi",real,imaginary);
        }sc.close();
    }
   
}