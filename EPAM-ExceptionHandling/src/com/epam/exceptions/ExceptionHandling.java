package com.epam.exceptions;

import java.util.Scanner;
class MyCalculator {
    long power(int n , int p) throws Exception{
    	//Checking whether n and p values are zero 
        if(n==0 && p==0) {
            throw new Exception("n and p should not be zero.");
        } else if( n<0 || p<0) { //Checking whether any of n and p values are negative 
            throw new Exception("n or p should not be negative.");
        } else {
        	//Calculating power(n,p)
            int sm=1;
            while(p>0) {
                sm=sm*n;
                p--;
            }
            return sm;
        }
    }  
}
public class ExceptionHandling {
    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);
    
    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();
            
            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}