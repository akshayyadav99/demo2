package com.noparameterised;       //nonparamiterised,no return type

public class AdditionOfNumbers 
{
	public void m1()
	{
		int a = 10;
		int b = 20;
		
		int c = a+b;
		System.out.println(c);
	}	
	public static void main(String [] args)
	{
		AdditionOfNumbers add = new AdditionOfNumbers();
		      			add.m1();
	
	}
}
