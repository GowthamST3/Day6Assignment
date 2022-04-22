package com.BridgeLabz_Day6Assigment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		int number,sum=0;
	      Scanner scanner = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = scanner.nextInt();
	     
	      for(int i = 1; i<= number/2; i++)
	      {
	          
	           if(number%i==0){
	            System.out.println(i+" ");
	            sum=sum+i;
	           }
	      }
	      if(sum==number)
	    	  System.out.println("Number " + number +" is Perfect number"); 
	      else
	    	  System.out.println("Number " + number +" is not Perfect number");  
    }
}
