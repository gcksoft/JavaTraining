package com.gcksoft.thisKeywordDemo;

class A{
	A(){
		this.m1();
		System.out.println("Default Constructor......");
	}
	
	A(String name){
		
	}
	
	A(int x){
		this();
		System.out.println("Argument Constructor......");
	}
	
	void m1() {
		System.out.println("m1 method.....");
	}
}

public class ThisKeywordDemo {
	public static void main(String[] args) {
		A a = new A(4);
		
	}

}
