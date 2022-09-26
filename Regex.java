package com.codebind;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile(".aa.");
		Matcher m=p.matcher("1aa2");
		boolean b=m.matches();
		System.out.println(b);
		

	}

}
