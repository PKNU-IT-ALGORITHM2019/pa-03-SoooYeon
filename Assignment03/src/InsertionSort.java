
class InsertionSort{

	public static double insertionSort(int []A ,int n) {
		double start = System.currentTimeMillis();
		for(int i=1;i<n;i++) {
			int target = A[i];
			for(int j=i-1;j>=0;j--) {
				if(A[j]>target)   A[j+1]=A[j];   
				else { 
					A[j+1] = target;
					break;
				}
				if(j==0) A[0] = target;
			}
		}
		double end = System.currentTimeMillis();
		return (end-start);
	}
}
