public class Fibonacci {
    public static void main(String[] args){
    int n=10;
    int x=0,y=1;
    for(int i=0;i<n;i++){
    
        System.out.println(x); 
        int temp=x+y;
        x=y;
        y=temp;
    }

 
    }
    
}
