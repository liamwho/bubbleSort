package ie.lyit.testers;
import java.util.Arrays;
import java.util.Scanner;

import ie.lyit.files.*;

public class MenuTester 
{
	static int[] numbers;
	
	public static void main(String[] args) 
	{
		
		//********start of Menu***********
		Menu menuObj = new Menu();
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Array number of elements : ");
		int n = s.nextInt();
				
		numbers = new int[n];
		
		for(int i = 0; i < n; i++)
		{
				//Random numbers between 0 and 100
			numbers[i] = (int)(Math.random()*101);
		}
		
		int[] numbers2 = numbers.clone();
		
		do{
			BubbleSort bs = new BubbleSort();
			EnhancedBubbleSort es = new EnhancedBubbleSort();
			SelectionSort ss = new SelectionSort();
			InsersionSort is = new InsersionSort();
			
			// Call it's display() method
			//menuObj.display();
			
			//Call it's read option method
			menuObj.readOption();
			
			switch(menuObj.getOption()){
				case 1:{
					int[] standardBubblesort1 = numbers.clone();
					int[] standardBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n               BubbleSort               \n****************************************\n");
					//bs.printArray(numbers);
					bs.bubbleSort(standardBubblesort1);
					bs.inversebubbleSort(standardBubblesort2);
				}break;
				case 2:{
					int[] enhancedBubblesort1 = numbers.clone();
					int[] enhancedBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n           Enhanced BubbleSort          \n****************************************\n");
					//es.printArray(numbers);
					es.enhancedBubbleSort(enhancedBubblesort1);
					es.enhancedBubbleSortInversed(enhancedBubblesort2);
				}break;
				case 3:{
					int[] selectionBubblesort1 = numbers.clone();
					int[] selectionBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n             Selection Sort             \n****************************************\n");
					//ss.printArray(numbers);
					ss.selectionSort(selectionBubblesort1);
					ss.selectionSortInversed(selectionBubblesort2);
				}break;
				case 4:{
					int[] insersionBubblesort1 = numbers.clone();
					int[] insersionBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n             Insersion Sort             \n****************************************\n");
					//is.printArray(numbers);
					is.insersionSort(insersionBubblesort1);
					is.insersionSortInversed(insersionBubblesort2);
				}break;
				case 5:{
					int[] standardBubblesort1 = numbers.clone();
					int[] standardBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n               BubbleSort               \n****************************************\n");
					//bs.printArray(numbers);
					bs.bubbleSort(standardBubblesort1);
					bs.inversebubbleSort(standardBubblesort2);
					
					int[] enhancedBubblesort1 = numbers.clone();
					int[] enhancedBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n           Enhanced BubbleSort          \n****************************************\n");
					//es.printArray(numbers);
					es.enhancedBubbleSort(enhancedBubblesort1);
					es.enhancedBubbleSortInversed(enhancedBubblesort2);
					
					int[] selectionBubblesort1 = numbers.clone();
					int[] selectionBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n             Selection Sort             \n****************************************\n");
					//ss.printArray(numbers);
					ss.selectionSort(selectionBubblesort1);
					ss.selectionSortInversed(selectionBubblesort2);
					
					int[] insersionBubblesort1 = numbers.clone();
					int[] insersionBubblesort2 = numbers.clone();
					
					System.out.println("****************************************\n             Insersion Sort             \n****************************************\n");
					//is.printArray(numbers);
					is.insersionSort(insersionBubblesort1);
					is.insersionSortInversed(insersionBubblesort2);
				}break;
				case 6:{
					bs.printArray(numbers);
					System.out.println();
				}break;
				case 7:break;
				default:System.out.println("INVALID OPTION..");
				System.out.println(menuObj.getOption());
			}
		}while(menuObj.getOption() != 7);

	}

}
