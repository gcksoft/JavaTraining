package com.gcksoft.stringDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		//nCopies(4,"vamsee kris");
		stringMethodExamples();
		
	}
	
	public static void nCopies(int n,String name) 
	{
		List<String> list = new ArrayList<String>();
		for (int i=0;i<n;i++) {
			list.add(name);
		}
		System.out.println(list);
	}
	
   //string methods examples
	public static void stringMethodExamples() {
		String str = "VASEE SABSDAA";
		System.out.println(str.length());
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.concat("krishna"));
		
		System.out.println(str.replace("EE", "I"));
		
		String array[] =  str.split("S");//{0-> VA,1 -> EE, 2-> AA, 3->DDD}
		
		System.out.println("Actual Existing Str :"+str);
		
		System.out.println(Arrays.asList(array));
		
		System.out.println(array[3]);
		
		System.out.println(str.endsWith("DD"));
		System.out.println(str.startsWith("V"));
		
		System.out.println(str.charAt(5));
		
		String name = "krishna";
		String surname = "Krishna";
		System.out.println("Checking equals method......");
		System.out.println(name.equals(surname));
		System.out.println(name.equalsIgnoreCase(surname));
		
		
	}


}
