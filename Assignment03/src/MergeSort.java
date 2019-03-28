
class MergeSort{
	public static double mergeTime(int []A ,int n)
	{
		double start = System.currentTimeMillis();
		mergeSort(A,0,n-1);
		double end = System.currentTimeMillis();
		return end-start;
	}

	public static void mergeSort(int A[],int p, int r) {
		if(p<r) {   
			//p>=r �� ���� �����Ͱ� 1�� or 2�� �ΰ���̱� ������ ���� ����
			int q = (p+r)/2;   //q = p���� r �� �߰� �� (����)
			mergeSort(A,p,q);
			mergeSort(A,q+1,r);
			merge(A,p,q,r);
		}
	}
	public static void merge(int []data, int p, int q, int r) {
		int i=p, j=q+1, k=p;
		int [] tmp = new int[data.length];
		while(i<=q && j<=r) {
			if(data[i]<=data[j])
				tmp[k++]=data[i++];
			else
				tmp[k++]=data[j++];
		}//���� �迭�� ���������� ����
		while(i<=q)//���� �迭�� ������ �� �����
			tmp[k++]=data[i++];
		while(j<=r)//���� �迭�� ������ �� �����
			tmp[k++]=data[j++];
		for(int t=p;t<=r;t++)
			data[t]=tmp[t]; //���� ������ �迭�� ���� ������ �迭�� �ű��.
	}


}
