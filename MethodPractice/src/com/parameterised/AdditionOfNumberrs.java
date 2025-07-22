package com.parameterised;

import com.noparameterised.AdditionOfNumbers;

public class AdditionOfNumberrs 
{
	public void m1(int a, int b)
	{
		int c = a+b;
		
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		AdditionOfNumbers add = new AdditionOfNumbers();
						add.m1();
	}
}
