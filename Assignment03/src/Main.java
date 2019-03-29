public class Main {

	public static int N1 = 1000;
	public static int N2 = 10000;
	public static int N3 = 100000;
	public static int [] data_ran = new int [N1];
	public static int [] data_ran2 = new int [N2];	
	public static int [] data_ran3 = new int [N3];

	public static int [] data_rev = new int [N1];
	public static int [] data_rev2 = new int [N2];
	public static int [] data_rev3 = new int [N3];
	public static void main(String[] args) {
		System.out.println("\t\tRandom1000\tReverse1000\tRandom10000\tReverse10000\tRandom100000\tReverse100000");
		double BsumTime1=0,BsumTime2=0,BsumTime3=0;
		double SsumTime1=0,SsumTime2=0,SsumTime3=0;
		double IsumTime1=0,IsumTime2=0,IsumTime3=0;
		double MsumTime1=0,MsumTime2=0,MsumTime3=0;
		double Q1sumTime1=0,Q1sumTime2=0,Q1sumTime3=0;
		double Q2sumTime1=0,Q2sumTime2=0,Q2sumTime3=0;
		double Q3sumTime1=0,Q3sumTime2=0,Q3sumTime3=0;

		for(int i=0;i<10;i++) {
			data_ran=madeRandom(N1);
			data_ran2=madeRandom(N2);
			data_ran3=madeRandom(N3);
			
			BsumTime1 += BubbleSort.bubbleSort(data_ran,N1);
			BsumTime2 += BubbleSort.bubbleSort(data_ran2,N2);
			BsumTime3 += BubbleSort.bubbleSort(data_ran3,N3);
			
			SsumTime1 += SelectionSort.selectionSort(data_ran, N1);
			SsumTime2 += SelectionSort.selectionSort(data_ran2, N2);
			SsumTime3 += SelectionSort.selectionSort(data_ran3, N3);
			
			IsumTime1 += InsertionSort.insertionSort(data_ran, N1);
			IsumTime2 += InsertionSort.insertionSort(data_ran2, N2);
			IsumTime3 += InsertionSort.insertionSort(data_ran3, N3);

			MsumTime1 += MergeSort.mergeTime(data_ran, N1);
			MsumTime2 += MergeSort.mergeTime(data_ran2, N2);
			MsumTime3 += MergeSort.mergeTime(data_ran3, N3);

			Q1sumTime1 += QuickSort1.Quick1Time(data_ran, N1);
			Q1sumTime2 += QuickSort1.Quick1Time(data_ran2, N2);
//			Q1sumTime3 += QuickSort1.Quick1Time(data_ran3, N3);  //스택 오버플로우

			Q2sumTime1 += QuickSort2.Quick2Time(data_ran, N1);
			Q2sumTime2 += QuickSort2.Quick2Time(data_ran2, N2);
			Q2sumTime3 += QuickSort2.Quick2Time(data_ran3, N3);
			
			Q3sumTime1 += QuickSort3.Quick3Time(data_ran, N1);
			Q3sumTime2 += QuickSort3.Quick3Time(data_ran2, N2);
			Q3sumTime3 += QuickSort3.Quick3Time(data_ran3, N3);

			}
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Bubble\t\t"+BsumTime1/10000);
		System.out.print("\t\t"+BubbleSort.bubbleSort(data_rev,N1)/1000);
		System.out.print("\t\t"+BsumTime2/10000);
		System.out.print("\t\t"+BubbleSort.bubbleSort(data_rev2,N2)/1000);
		System.out.print("\t\t"+BsumTime3/10000);
		System.out.println("\t\t"+BubbleSort.bubbleSort(data_rev3,N3)/1000);
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Selection\t"+SsumTime1/1000);
		System.out.print("\t\t"+SelectionSort.selectionSort(data_rev,N1)/1000);
		System.out.print("\t\t"+SsumTime2/1000);
		System.out.print("\t\t"+SelectionSort.selectionSort(data_rev2,N2)/1000);
		System.out.print("\t\t"+SsumTime3/1000);
		System.out.println("\t\t"+SelectionSort.selectionSort(data_rev3,N3)/1000);
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Insertion\t"+IsumTime1/1000);
		System.out.print("\t\t"+InsertionSort.insertionSort(data_rev,N1)/1000);
		System.out.print("\t\t"+IsumTime2/1000);
		System.out.print("\t\t"+InsertionSort.insertionSort(data_rev2,N2)/1000);
		System.out.print("\t\t"+IsumTime3/1000);
		System.out.println("\t\t"+InsertionSort.insertionSort(data_rev3,N3)/1000);
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Merge\t\t"+MsumTime1/10000);
		System.out.print("\t\t"+MergeSort.mergeTime(data_rev, N1)/1000);
		System.out.print("\t\t"+MsumTime2/10000);
		System.out.print("\t\t"+MergeSort.mergeTime(data_rev2, N2)/1000);
		System.out.print("\t\t"+MsumTime3/10000);
		System.out.println("\t\t"+MergeSort.mergeTime(data_rev3, N3)/1000);
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Quick1\t\t"+Q1sumTime1/10000);
		System.out.print("\t\t"+QuickSort1.Quick1Time(data_rev, N1)/1000);
		System.out.print("\t\t"+Q1sumTime2/10000);
		System.out.print("\t\t"+QuickSort1.Quick1Time(data_rev2, N2)/1000);
		System.out.println("\t\t"+Q1sumTime3/10000);
//		System.out.println("\t\t"+QuickSort1.Quick1Time(data_rev3, N3)/1000); //스택 오버플로우
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Quick2\t\t"+Q2sumTime1/10000);
		System.out.print("\t\t"+QuickSort2.Quick2Time(data_rev, N1)/1000);
		System.out.print("\t\t"+Q2sumTime2/10000);
		System.out.print("\t\t"+QuickSort2.Quick2Time(data_rev2, N2)/1000);
		System.out.print("\t\t"+Q2sumTime3/10000);
		System.out.println("\t\t"+QuickSort2.Quick2Time(data_rev3, N3)/1000);
		data_rev = madeReverse(N1);
		data_rev2 = madeReverse(N2);
		data_rev3 = madeReverse(N3);
		System.out.print("Quick3\t\t"+Q3sumTime1/10000);
		System.out.print("\t\t"+QuickSort3.Quick3Time(data_rev, N1)/1000);
		System.out.print("\t\t"+Q3sumTime2/10000);
		System.out.print("\t\t"+QuickSort3.Quick3Time(data_rev2, N2)/1000);
		System.out.print("\t\t"+Q3sumTime3/10000);
		System.out.println("\t\t"+QuickSort3.Quick3Time(data_rev3, N3)/1000);
	}
	public static int[] madeReverse(int n)
	{
		int [] data_rev = new int[n];
		int j=n;
		for(int i=0;i<n;i++) {
			data_rev[i] = j;
			j--;
		}
		return data_rev;
	}
	public static int[] madeRandom(int n)
	{
		int [] data_ran = new int[n];
		for(int k=0;k<n;k++) {
			data_ran[k] = (int)(Math.random()*n)+1;
		}
		return data_ran;
	}
}
