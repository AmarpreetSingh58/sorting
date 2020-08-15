package sorting;

import java.util.Arrays;
import java.util.Random;

public class TestSort {
	
	public static Long[] genRandomArray() {
		int num = 100000;
		Long []arr = new Long[num];
		Random r = new Random();
		
		for(int i =0; i<num;i++)
			arr[i] = r.nextLong();
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long mergeTime=0;
		long quickTime = 0;
		long heapTime = 0;
		long dualPivTime = 0;
		long start,end;
		
		
		for (int i=0;i<100;i++) {
		Long []input1 = genRandomArray();
		Long []input2 = input1.clone();
		Long []input3 = input1.clone();
		Long []input4 = input1.clone();
		
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
		
		}
		
		System.out.println("Average time taken by Merge Sort:" + (mergeTime)/100);
		System.out.println("Average time taken by Quick Sort:" + (quickTime)/100);
		System.out.println("Average time taken by Heap Sort:" + (heapTime)/100);
		System.out.println("Average time taken by Dual Pivot Sort:" + (dualPivTime)/100);
		

	}

}
