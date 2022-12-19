package com.string.demo;

public class Operation {

	
	public static void main(String[] args) {
	
	
		String str = "Swapnil";
		System.out.println("============================");
		System.out.println("Char count :-"+str.length());
		System.out.println("============================");
		System.out.println("char is :-"+str.charAt(4));
		System.out.println("============================");
		System.out.println("Compare both string:"+str.compareTo("Swapnil"));
		System.out.println("============================");
		System.out.println(str.concat("Mahajan"));
		System.out.println("============================");
		System.out.println(str.hashCode());
		System.out.println("============================");
		System.out.println(str.toLowerCase());
		System.out.println("============================");
		System.out.println(str.toUpperCase());
		System.out.println("============================");

	}

}
