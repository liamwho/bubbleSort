# bubbleSort
Lab 1 Quadratic Sorting Algorithms

Practical Lab 1 – Bubble sort (Standard and Enhanced) Insertion sort and Selection sort application
Create a GUI or menu based application that will:
1.	Allow the user to select the number of elements the array will hold. 
i.	1000 
ii.	10,000 
iii.	100,000 

2.	The program will then generate an array of that length, with random numbers between 0 and 100.
3.	Allow the user to select which Algorithm to use to sort that array.
i.	Standard Bubble Sort 
ii.	Enhanced Bubble Sort 
iii.	Selection Sort 
iv.	Insertion Sort 

4.	Allow the user to select the structure of the data in each array.
i.	Random 
ii.	Sorted 
iii.	Inversely sorted 

5.	You should record the time of the execution of each algorithm, against each of the available sizes of arrays of each structure type (1000, 10,000 and 100,000) as well as recording the number of comparisons and swap operations the algorithm takes, store these details to compare against executions of other algorithms in your report.

Marking Structure:
The assignment will be marked with the following weighting:
				55% - Code
				30% - Lab Book 
				15% - Presentation 

Note:
1.	See Quadratic Algorithms lecture for notes on creating a timer using the System.currentTimeMillis() method.

2.	Use the random number generator in java to populate your array, see below:
myArray[i] = (int)(Math.random() * 10)

Example Screen – (Your implementation should include both Bubble Sorts as well as showing timings for inversely sorted list).
