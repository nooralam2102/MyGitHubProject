package com.app;
import java.util.Scanner;

public class TableDemo {
public static void main(String[] args) {
	int n,i;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter ur digit number");
	n=Integer.parseInt(s.nextLine());
	for(i=1;i<=10;i++ )
	{
		System.out.println(n+"*"+i+"="+(n*i));
	}
	System.out.println("this is my first test");
	
}
}
