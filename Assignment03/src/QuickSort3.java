
class QuickSort3{
	public static double Quick3Time(int []A ,int n) 
	{
		double start = System.currentTimeMillis();
		quickSort(A,0,n-1);
		double end = System.currentTimeMillis();
		return end - start;
	}
	public static void quickSort(int []A, int p, int r)
	{		
		int q=0;
		if(p<r) {
			q=partition(A,p,r); //분할 q=pivot의 위치
			quickSort(A,p,q-1); //왼쪽 부분 배열 정렬
			quickSort(A,q+1,r); //오른쪽 부분 배열 정렬
		}
	}
	public static int partition(int []A, int p, int r) //pivot이 위치한 자리를 return 
	{
		int random = 0;
		random = randomRange(p,r);
		int x=A[random];
		swap(A,random,r);
		int i=p-1; //p-1에서 시작 한다. (아직 pivot보다 작은 값이 없어서)
		for(int j=p; j<r; j++) {
			if(A[j]<=x) {
				i++;
				swap(A,i,j);
			}
		}	
		swap(A,i+1,r);
		return i+1;
	}
	public static void swap(int []A, int a, int b)
	{
		int tmp = A[a];
		A[a] = A[b];
		A[b] = tmp;
	}
	  public static int randomRange(int n1, int n2) {
		    return (int) (Math.random() * (n2 - n1 + 1)) + n1;
		  }
}
