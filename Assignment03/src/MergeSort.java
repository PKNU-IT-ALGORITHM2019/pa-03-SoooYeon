
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
			//p>=r 인 경우는 데이터가 1개 or 2개 인경우이기 때문에 정렬 안함
			int q = (p+r)/2;   //q = p부터 r 의 중간 값 (분할)
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
		}//한쪽 배열이 끝날때까지 진행
		while(i<=q)//앞쪽 배열이 남았을 때 실행됨
			tmp[k++]=data[i++];
		while(j<=r)//뒤쪽 배열이 남았을 때 실행됨
			tmp[k++]=data[j++];
		for(int t=p;t<=r;t++)
			data[t]=tmp[t]; //새로 저장한 배열을 원래 저장한 배열로 옮긴다.
	}


}
