package com.gcksoft.general.program.exp;

public class GeneralProgramExample {

	public static void main(String[] args) {
		  final int A = 10;
		  reverseString();
	}

public static void reverseString() {
	 String originalStr = "Ramu";
	    String reversedStr = "";
	    System.out.println("Original string: "+originalStr);
	    
	    System.out.println("way2................>>>>>>>>");    
	    for (int i = 0; i < originalStr.length(); i++) {
	      reversedStr = originalStr.charAt(i)+reversedStr;// P = 2 -> m+aR
	    }
	    System.out.println("Reversed string: "+ reversedStr);
	    
	    
	  System.out.println("way2................>>>>>>>>");
	    StringBuilder sb = new StringBuilder();
	    sb.append(originalStr);
	    sb.reverse();
	    System.out.println("Reversed string: "+sb.toString());
	  }
}



