package com.task1;

public class A 
{

	public void m1(String a)
	{
		B b = new B();
		  b.m2(a);
	}
	public static void main(String[] args) 
	{
		
		A a = new A();
		  a.m1("CJC");
	}
}
