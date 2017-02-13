package ie.lyit.files;

import java.util.Scanner;

public class Menu 
{
	private int option;
	
	public void display(){
		System.out.println("\t\t Select a number of elements");
	
	}
	
	public void readOption()
	{
		Scanner kbInt = new Scanner(System.in);
		System.out.println("\n Enter Option \n\n | 1 : Standard BubbleSort \n | 2 : Enhanced BubbleSort \n | 3 : Selection Sort \n | 4 : Insertion Sort \n | 5 : Sequence 1 to 4 \n | 6 : Print Random Array \n | 7 : Exit ");
		option=kbInt.nextInt();
	}
	
	public int getOption()
	{
		return option;
	}

}
