package com.parameterisedwithreturntype;

public class AdditionOfNumbers 
{
	public int m1(int a, int b)
	{
		int c =a+b;
		
		System.out.println(c);
		
		return b;
	}
	public static void main(String[] args) 
	{
		AdditionOfNumbers add = new AdditionOfNumbers();
				add.m1(10, 20);
	}
}
