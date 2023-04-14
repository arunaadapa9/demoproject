package com.prasad;
import java.lang.*;
import java.util.Scanner;
public class Calculator {
		public static  void main(String[] args) {
			
	System.out.println("enter two values");
	Scanner input1= new Scanner(System.in);
	int a=input1.nextInt();
	Scanner input2= new Scanner(System.in);
	int b=input2.nextInt();
	int c= Sum(a,b);
	System.out.println("addition of given numbers " + a +" and " + b +" is "  + c);
	int d= Subtract(a,b);
	System.out.println("sub of given numbers " + a +" and " + b +" is "  + d);
	int e= Multiply(a,b);
	System.out.println("mul of given numbers " + a +" and " + b +" is "  + e);
	int f= Divide(a,b);
	System.out.println("division of given numbers " + a +" and " + b +" is "  + f);

		}
	public static int Sum(int a, int b)
	{
	return a+b;
	}
	public static int Subtract(int a, int b)
	{
	return a-b;
	}
	public static int Multiply(int a, int b)
	{
	return a*b;
	}
	public static int Divide(int a, int b)
	{
	return a/b;
	}

}
