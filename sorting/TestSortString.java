package sorting;

import java.util.Arrays;
import java.util.Random;

public class TestSortString {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long mergeTime=0;
		long quickTime = 0;
		long heapTime = 0;
		long dualPivTime = 0;
		long radixTime = 0;
		long start,end;
		
		for(int len =4;len<=10;len+=2)		
		{
			for (int i=0;i<10;i++) {
				
				String s = "";
				
				int num = 100000;
				String []list = new String[num];
				
				Random r = new Random();
				
				for(int j = 0;j<num;j++)
				{
					s="";
					for (int k = 0; k <len;k++)
						s +=(char)('a'+r.nextInt(26));
					list[j] = s;
					//System.out.println(s);
				}
				String []input1 = list.clone();
				String []input2 = input1.clone();
				String []input3 = input1.clone();
				String []input4 = input1.clone();
				String []input5 = input1.clone();
				
				start = System.nanoTime();
				Sort.mergeSort(input1);
				end = System.nanoTime();
				mergeTime += (end - start);
				
				start = System.nanoTime();
				Sort.quicksort(input2);
				end = System.nanoTime();
				quickTime += (end-start);
				
				start = System.nanoTime();
				Sort.heapsort(input3);
				end = System.nanoTime();
				heapTime += (end - start);
				
				start = System.nanoTime();
				Arrays.sort(input4);
				end = System.nanoTime();
				dualPivTime += (end - start);
				
				start = System.nanoTime();
				RadixSort.radixSortA(input5,len);
				end = System.nanoTime();
				radixTime += (end - start);
				
				
				}
				
			System.out.println("Length of String = "+len);
			System.out.println("Average time taken by Merge Sort:" + (mergeTime)/100);
			System.out.println("Average time taken by Quick Sort:" + (quickTime)/100);
			System.out.println("Average time taken by Heap Sort:" + (heapTime)/100);
			System.out.println("Average time taken by Dual Pivot Sort:" + (dualPivTime)/100);
			System.out.println("Average time taken by Radix Sort:" + (radixTime)/100);
		}
		
		

	}

}
