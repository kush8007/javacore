package com.findout.even.oddnumber;

public class evenodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creat an arry of 10 numbers
		int[] numbers = new int[]{1,2,3,4,5,6,7,8,9,10};
		
		for(int i=0;i<numbers.length;i++){
			/*
			 * use modulus operrator to check if the number
			 * is even or odd if we divide auny number by
			 * 2 and reminder by 2 and reminder is 0 then
			 * number is even otherwise it is odd
			 */
		if(numbers[i]%2 ==0)
			System.out.println(numbers[i] + " is even number");
		else
			System.out.println(numbers[i] + " is oddnumber");
	
		
	
		}
	}

}
