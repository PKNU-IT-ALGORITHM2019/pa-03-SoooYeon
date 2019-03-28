
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
			q=partition(A,p,r); //���� q=pivot�� ��ġ
			quickSort(A,p,q-1); //���� �κ� �迭 ����
			quickSort(A,q+1,r); //������ �κ� �迭 ����
		}
	}
	public static int partition(int []A, int p, int r) //pivot�� ��ġ�� �ڸ��� return 
	{
		int random = 0;
		random = randomRange(p,r);
		int x=A[random];
		swap(A,random,r);
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
	  public static int randomRange(int n1, int n2) {
		    return (int) (Math.random() * (n2 - n1 + 1)) + n1;
		  }
}
