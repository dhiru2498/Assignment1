package com.codebind;

public class Exptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		int [] marks=new int[5];
		System.out.println("statment 1");
		System.out.println("statment 2");
		System.out.println("statment 3");
		try {
			System.out.println(marks[6]);
		}
		catch(IndexOutOfBoundsException q) {
			System.out.println(q);
		}
		try {
		int j=10/i;
		}
		
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
			finally {
				System.out.println("finally");
			}
		
		System.out.println("statment 4");
		System.out.println("statment 5");

	}
	}
	
