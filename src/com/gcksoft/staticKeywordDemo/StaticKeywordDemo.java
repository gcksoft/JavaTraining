package com.gcksoft.staticKeywordDemo;

class Student{
	int roleId;
	String name;
	static int marcks;
	
	Student(int roleId,String name,int marcks){
		this.roleId = roleId;
		this.name = name;
		this.marcks = marcks;
	}
}

public class StaticKeywordDemo {
	 public static void main(String[] args) {
		
		 Student s2 = new Student(2,"Raju",5);
		 Student s1 = new Student(1,"Ramu",20);
		 
		System.out.println(s1.name);
		System.out.println(s1.marcks);
		
		System.out.println(s2.name);
		System.out.println(s2.marcks);
		
		//method calling
		add();
		
	}
	 
    public static void add() {
    	sub();
    }
   public static void sub() {
	   StaticKeywordDemo skd = new StaticKeywordDemo();
	   skd.multiplication();
    }
   public void multiplication() {
   	
   }
   
    
}
