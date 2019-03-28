
class BubbleSort{


	public static double bubbleSort(int []A ,int n) {
		double start = System.currentTimeMillis();
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(A[j]>A[j+1]){
					int tmp = A[j];
					A[j]=A[j+1];
					A[j+1]=tmp;         
				}
			}
		}
		double end = System.currentTimeMillis();
		return (end-start);
	}
}
