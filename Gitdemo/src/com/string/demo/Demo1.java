package com.string.demo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "velocity";
		String s2 = new String("velocity");
		System.out.println(s1 == s2);//false due to store different memory location
		System.out.println(s1.equals(s2));//onl check string content
   }

}
