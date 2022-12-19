package com.string.demo;

import java.util.Scanner;

public class Returnmethod {

	public static String Empname(String name) {
		return name;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter your name:-");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String result=Empname(name);//using static that call direct method name
		System.out.println(result);
		
		
		

	}

}
