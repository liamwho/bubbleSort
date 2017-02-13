package ie.lyit.files;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
	
	public int[] bubbleSort(int[] l)
	{
		int temp = 0;
		long counter = 0;
		long counter2 = 0;
		
		Stopwatch timer = new Stopwatch();
		
		//start timer
		timer.start();
		
		long n = l.length;
		
		for(int i = 0; i < n - 1; i++)
		{	
			for(int j = 0; j < n - 1; j++)
			{	
				counter ++;
				
				if(l[j] > l[j+1])
				{
					counter2++;
					temp = l[j];
					l[j] = l[j+1];
					l[j+1] = temp;
				}
			}
		}
		
		//end timer
		timer.stop();
		
		//System.out.print("Sorted" + Arrays.toString(l));
		System.out.print("                 Sorted                 \n________________________________________\n");
		System.out.print("\nComparisons:\t" + counter + "\n");
		System.out.print("Swaps:\t\t" + counter2 + "\n");
		System.out.print("Nanoseconds:\t" + timer.getElapsedTime() + "\n\n");
		// seconds
		return l;
	}
	
	public int[] inversebubbleSort(int[] l)
	{
		int temp = 0;
		long counter = 0;
		long counter2 = 0;
		
		Stopwatch timer = new Stopwatch();
		
		//start timer
		timer.start();
		
		int n = l.length;
		
		for(int i = 0; i < n; i++)
		{	
			for(int j = 1; j < (n-i); j++)
			{	
				counter ++;
				
				if(l[j - 1] < l[j])
				{
					counter2++;
					temp = l[j - 1];
					l[j - 1] = l[j];
					l[j] = temp;
				}
			}
		}
		
		//end timer
		timer.stop();
		
		//System.out.print("Inversely : "+ Arrays.toString(l));
		
		System.out.print("            Sorted Inversely           \n________________________________________\n");
		System.out.print("Comparisons:\t" + counter + "\n");
		System.out.print("Swaps:\t\t" + counter2 + "\n");
		System.out.print("Nanoseconds:\t" + timer.getElapsedTime() + "\n\n");
		return l;
	}
	
	public void printArray(int[] numbers){
		System.out.println("Random Array : " + Arrays.toString(numbers)+ " \n ");
	}
}