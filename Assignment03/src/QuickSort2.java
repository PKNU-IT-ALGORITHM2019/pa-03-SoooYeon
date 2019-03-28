
class QuickSort2{
	public static double Quick2Time(int []A ,int n) 
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
			q=partition(A,p,r); //���� q=pivot�� ��ġ
			quickSort(A,p,q-1); //���� �κ� �迭 ����
			quickSort(A,q+1,r); //������ �κ� �迭 ����
		}
	}
	public static int partition(int []A, int p, int r) //pivot�� ��ġ�� �ڸ��� return 
	{
		int middle = 0;
		middle = (p+r)/2;
		int median=0;
		median = Median(A,middle,p,r);
		int x=A[median];
		swap(A,median,r);
		int i=p-1; //p-1���� ���� �Ѵ�. (���� pivot���� ���� ���� ���)
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
	public static int Median(int []data, int a, int b, int c){
		
	    if (data[a] > data[b]){
	        if (data[b] > data[c])          return b;
	        else if (data[a] >data [c])     return c;
	        else                return a;
	    }
	    else{
	        if (data[a] > data[c])          return a;
	        else if (data[b] > data[c])     return c;
	        else                return b;
	    }
	}
}
