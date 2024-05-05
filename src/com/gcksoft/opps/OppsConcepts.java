package com.gcksoft.opps;


class Parent{
	String bike ="Hero";
	void parentMethod() {
		System.out.println("Parent Drive : "+bike);
	}
}

class Child extends Parent{
	void childMethod() {
		System.out.println("Child Drive : "+bike);
	}
}

//Overloading
class OverLoading{
	void house(int a) {
		System.out.println("House prise : "+a);
	}
	void house(float a) {
		System.out.println("House prise : "+a);
	}
}

//Overriding
class Super{
	
	  void house() {
	  System.out.println("Super implmentation....");
	  }
	 
}

class Sub extends Super{
	
	  void house() { 
	  System.out.println("Sub implmentation....."); 
	  }
	 
}



public class OppsConcepts {
	public static void main(String[] args) {
		
		//Inheritance example
		System.out.println("Inheritance ...........>>>>>>");
		Parent p = new Parent();
		p.parentMethod();
		Child c = new Child(); 
		c.childMethod();
		
		//Polymorphism example
		System.out.println("OverLoading ...........>>>>>>");
		OverLoading ol = new OverLoading();
		ol.house(1);
		ol.house(1.5f);
		
		System.out.println("Overriding .............>>>>>>");
		Super sp = new Super();
		sp.house();
		
		Sub sub = new Sub();
		sub.house();
		
		Super sp1 = new Sub();
		   sp1.house(); 
	}

}








