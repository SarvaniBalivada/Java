
class bs{
public static void main(String[] args){
   int A[]={43,13,67,23,78,15};
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
