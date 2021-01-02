package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc=new Scanner (System.in);
	System.out.print("Enter  number : ");
	int n=sc.nextInt();
	if (n<0){
		System.out.println(n+" is negativ" );
	}
	else if (n>0){
		System.out.println(n+" is positiv" );
	}
	else{
		System.out.println(n+" is 0" );
	}

    }
}
