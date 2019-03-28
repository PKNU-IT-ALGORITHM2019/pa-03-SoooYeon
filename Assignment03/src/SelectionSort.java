
class SelectionSort{

	
	public static double selectionSort(int []A ,int n) {
		double start = System.currentTimeMillis();
		for(int i=n-1;i>=1;i--) {
			int maxindex=0;
			for(int j=1;j<=i;j++) {
				if(A[maxindex]<A[j]) maxindex=j;
			}
			int tmp = A[maxindex];
			A[maxindex]=A[i];
			A[i]=tmp;
		}
		double end = System.currentTimeMillis();
		return (end-start);
	}
}
