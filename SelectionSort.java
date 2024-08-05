class SelectionSort{
public static void main(String[] args){
		int A[]={45,21,67,42,90,12};
		SSort(A);
		System.out.println("Sorted Array: ");
		for(int i=0;i<A.length;i++)
			System.out.println(A[i] + " ");}
static void SSort(int[] A){
 int n=A.length;
 for(int i=0;i<n-1;i++){
 	int minInd=i;
 	for(int j=i+1;j<n;j++)
 		if(A[minInd]>A[j])
 			minInd=j;
 			int temp=A[i];
 			A[i]=A[minInd];
 			A[minInd]=temp;
 	}
 }
}
