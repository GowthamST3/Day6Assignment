package com.BridgeLabz_Day6Assigment;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		 int number1=0,number2=1;
	     Scanner scanner =new Scanner(System.in);
	     System.out.println("Enter the number to print Fibonacci series");
	     int number=scanner.nextInt();
	     System.out.println(number1 +"\n"+number2);   
	       for(int i=2;i<number;i++){
	    	   int number3=number1+number2;
	    	   System.out.println(number3);
	    	   number1=number2;
	    	   number2=number3;
	      }
	}
}
