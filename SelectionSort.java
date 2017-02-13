package ie.lyit.files;

import java.util.Arrays;

public class SelectionSort 
{
	public int[ ] selectionSort(int[] l)

	// pre: array is full, all elements are valid integers (not null)
	// post: array is sorted in ascending order (lowest to highest)
	{
		int temp = 0;
		long counter = 0;
		long counter2 = 0;
		
		Stopwatch timer = new Stopwatch();
		
		//start timer
		timer.start();
		
		int n = l.length - 1;
		
		for (int i = n; i > 0; i--)	  // This controls navigating through the array, splitting it into
		 {				//a sorted and unsorted portion with each iteration.
			
			int f = 0;	// (1) default value of the 1st element index – use this to test against every other element.
			
			counter ++;
			
			for(int j = 1; j <= i; j++)	  // (2) loop from the beginning of unsorted zone to the
			{			  //  end of the array.
				
				
				if(l [j] > l[f])	// compare current element to minimum
				 f = j;	// if it's lower, it becomes the new minimum to use to compare
				counter2++;
			}
				
				// swap the two values
				temp = l [f]; 
				l [f] = l[i];
				l [i] = temp;
		}
		
		//end timer
		timer.stop();
		
		//System.out.print("Sorted" + Arrays.toString(l));
		System.out.print("                 Sorted                 \n________________________________________\n");
		System.out.print("\nComparisons:\t" + counter + "\n");
		System.out.print("Swaps:\t\t" + counter2 + "\n");
		System.out.print("Nanoseconds:\t" + timer.getElapsedTime() + "\n\n");
		return l;
	}
	
	public int[ ] selectionSortInversed(int[] l)

	// pre: array is full, all elements are valid integers (not null)
	// post: array is sorted in ascending order (lowest to highest)
	{
		int temp = 0;
		long counter = 0;
		long counter2 = 0;
		
		Stopwatch timer = new Stopwatch();
		
		//start timer
		timer.start();
		
		int n = l.length - 1;
		
		for (int i = n; i > 0; i--)	  // This controls navigating through the array, splitting it into
		 {				//a sorted and unsorted portion with each iteration.
			
			int f = 0;	// (1) default value of the 1st element index – use this to test against every other element.
			
			counter ++;
			
			for(int j = 1; j <= i; j++)	  // (2) loop from the beginning of unsorted zone to the
			{			  //  end of the array.
				
				
				if(l [j] < l[f])	// compare current element to minimum
				 f = j;	// if it's lower, it becomes the new minimum to use to compare
				counter2++;
			}
				
				// swap the two values
				temp = l [f]; 
				l [f] = l[i];
				l [i] = temp;
		}
		
		//end timer
		timer.stop();
		
		//System.out.print("Sorted Inversely" + Arrays.toString(l));
		System.out.print("            Sorted Inversely           \n________________________________________\n");
		System.out.print("\nComparisons:\t" + counter + "\n");
		System.out.print("Swaps:\t\t" + counter2 + "\n");
		System.out.print("Nanoseconds:\t" + timer.getElapsedTime() + "\n\n");
		return l;
	}
	
	
	public void printArray(int[] numbers){
		System.out.println("Random Array : " + Arrays.toString(numbers) + " \n ");
	}
}
