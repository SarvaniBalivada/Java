import java.util.Scanner;
public class Week {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number between 1-7: ");
    int n=sc.nextInt();
    switch(n){
        case 1:System.out.println("Sunday");
        break;
        case 2:System.out.println("Monday");
        break;
        case 3:System.out.println("Tuesday");
        break;
        case 4:System.out.println("Wednesday");
        break;
        case 5:System.out.println("Thursay");
        break;
        case 6:System.out.println("Friday");
        break;
        case 7:System.out.println("Saturday");
        break;
        default:System.out.println("Invalid Statement");
        break;

    }
    sc.close();
 }

}
