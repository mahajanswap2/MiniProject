package com.string.demo;

public class Test {

	public static void main(String[] args) {
	//	 TODO Auto-generated method stub
  
		String Str="My name is swapnil";
             int counter=0;
		for(int i=0;i<=Str.length();i++) {
			char ch=Str.charAt(i);
			if(ch ==' ') {
				counter++;
				
			}
			
		}
		System.out.println(counter);
		
//		String str = "velocity training center pune";
//
//		int counter = 0;
//		for (int i = 0; i < str.length(); i++) {
//
//			char ch = str.charAt(i);
//			if (ch == ' ') {
//				counter++;
//			}
//		}
//		System.out.println("total space in string are>>" + counter);
//
//		
		
	}

}
