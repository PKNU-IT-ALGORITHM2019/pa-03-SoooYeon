
class QuickSort1{

	public static double Quick1Time(int []A ,int n) 
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
		int x=A[r];
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
}
