package com.BridgeLabz_Day6Assigment;

import java.util.Scanner;

public class ReverseOfNumber {
   public static void main(String[] args) {
	    int reverse=0;
		  Scanner scanner=new Scanner(System.in);
		  System.out.println("Enter the Number");
		  int number=scanner.nextInt();
		    while(number!=0){
			   int remainder=number%10;
			   reverse=reverse*10+remainder;
			   number=number/10;
		 }
		 System.out.println("Reverse of the Number is : "+ reverse); 
   }

}
