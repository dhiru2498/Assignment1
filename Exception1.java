package com.codebind;

public class Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=22;
		if(age<22) {
			throw new ArithmeticException("yes");
			
		}
		else {
			System.out.println("no");
		}
		

	}

}
class InvalidAgeException extends Exception {
	InvalidAgeException(String s)
	{
		super(s);
	}
}
