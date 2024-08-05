import java.util.Scanner;
class BubbleSort{
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of elements: ");
	int n=sc.nextInt();
	int[] A = new int[n];
	System.out.println("Enter the elements: ");
	for(int i=0;i<n;i++)
	A[i]=sc.nextInt();
	bubbleSort(A);
	System.out.println("Sorted Array: ");
	for(int i=0;i<A.length;i++)
		System.out.println(A[i] + " ");
	
}


public static void bubbleSort(int[] A){
	int n=A.length;
	for(int i=1;i<n;i++)
		for(int j=0;j<n-i;j++)
			if(A[j]>A[j+1]){
				int temp=A[j];
				A[j]=A[j+1];
				A[j+1]=temp;
	}
  }
}
