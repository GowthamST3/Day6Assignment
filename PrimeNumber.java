package com.BridgeLabz_Day6Assigment;

import java.util.Scanner;

public class PrimeNumber {
      public static void main(String[] args) {
    	  int flag=0,i=2;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number");
		int number=scanner.nextInt();
		if(number==0 || number==1)
			flag=1;
	          while(i<=number/2){
			    if(number%i==0){
				 flag=1;
				 break;
			    }
			    i++;
		   }
		if(flag==0)
        	  System.out.println("The Number " +number+ " is prime number");  
          else
        	  System.out.println("The Number " +number+ " is not prime number");
	}

}

