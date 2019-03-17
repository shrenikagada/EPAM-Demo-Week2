package com.test.calculate;

public class Calculator {
	public int testCalculator(int a,int b, char s) {
		if (s=='+') {
			return a+b;
		} else if(s=='*') {
			return a*b;
		} else if(s=='/') {
			return a/b;
		} else {
			return -1;
		}
	}
}
