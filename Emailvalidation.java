package com.codebind;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;


public class Emailvalidation {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        System.out.println("Enter ur email");
	        String email=sc.next();
	        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	        boolean res = email.matches(regex);
	        //String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	        boolean result=email.matches(regex);
	        if(res){
	            System.out.println("True");
	        }
	        else{
	            System.out.println("False");
	}
	}
}

