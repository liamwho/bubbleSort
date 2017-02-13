package ie.lyit.files;

import java.util.Arrays;

public class InsersionSort
{
	public static int[] insersionSort(int[] l) 
	{
		int temp = 0;
		long counter = 0;
		long counter2 = 0;
		
		Stopwatch timer = new Stopwatch();
		
		//start timer
		timer.start();
		
		int n = l.length;
		
        for (int i = 1; i < n; i++) 
        {
        	counter ++;
        
            int next = l[i];
            // find the insertion location while moving all larger element up
            int j = i;
            
            while (j > 0 && l[j - 1] > next) 
            {
            	counter2++;
                l[j] = l[j - 1];
                j--;
            }
            // insert the element
            l[j] = next;
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
	
	public static int[] insersionSortInversed(int[] l) 
	{
		int temp = 0;
		long counter = 0;
		long counter2 = 0;
		
		Stopwatch timer = new Stopwatch();
		
		//start timer
		timer.start();
		
		int n = l.length;
		
        for (int i = 1; i < n; i++) 
        {
        	counter ++;
        
            int next = l[i];
            // find the insertion location while moving all larger element up
            int j = i;
            
            while (j > 0 && l[j - 1] < next) 
            {
            	counter2++;
                l[j] = l[j - 1];
                j--;
            }
            // insert the element
            l[j] = next;
        }
        //end timer
  		timer.stop();
  		
  		//System.out.print("Inversely" + Arrays.toString(l));
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
