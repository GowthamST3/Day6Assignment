package com.BridgeLabz_Day6Assigment;

import java.util.Scanner;

public class CouponNumber {
    public static void main(String[] args) {
    	int distinctValue=0,count=0;
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int number=scanner.nextInt();
		int check = (int)Math.floor(Math.random() * 10) % number;
		System.out.println(check);
		while(distinctValue!=check){
			count++;
			
		}
	   System.out.println(count);

	}

}
