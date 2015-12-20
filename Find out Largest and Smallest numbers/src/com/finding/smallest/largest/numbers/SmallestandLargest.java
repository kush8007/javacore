package com.finding.smallest.largest.numbers;

public class SmallestandLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//array of 10 numbers
		int numbers[]=new int[]{45,80,74,25,39,40,33,55,90,04};
		
		//assign first element of an arry to largest and smallest
		
		int smallest = numbers[0];
		int largest = numbers[0];
		
		 for(int i=1; i< numbers.length; i++)
			
			 
		{
			if(numbers[i]>largest){
				largest = numbers[i];
				System.out.println("Number " +i+ " is" +numbers[i]);
			} else if(numbers[i]<smallest)
				smallest=numbers[i];
			
				}
		System.out.println("largest number is:" + largest);
		System.out.println("smallest number is:" + smallest);
		
		
		
		
			
		
	}

}
