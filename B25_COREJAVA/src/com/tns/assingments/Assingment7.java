//to find number a positive or negative number

package com.tns.assingments;
import java.util.Scanner;
public class Assingment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if(n>0)
        {
      	  System.out.println("Number is positive:"+n);
        }
        if(n<0)
        {
      	  System.out.println("Number is negative:"+n);
        }
        else if(n==0)
        {
      	 System.out.println("Number is zero:"+n);
        }

	}

}
