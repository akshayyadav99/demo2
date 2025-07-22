package com.task2;

public class A 
{

	public String m1(String a)
	{
		B b = new B();
		String x = b.m2(a);
		 
		return x;
	}
	public static void main(String[] args) 
	{
		
		A a = new A();
		String msg = a.m1("CJC");
		  
		System.out.println("Class A =" +msg);
	}
}
