package com.gcksoft.opps;


class Parent{
	String bike ="Hero";
	void parentMethod() {
		System.out.println("Parent Drive : "+bike);
	}
	
	//Overriding
	void house() {
		System.out.println("Parent House....");
	}
}

class Child extends Parent{
	void childMethod() {
		System.out.println("Child Drive : "+bike);
	}
	//Overriding
	void house() {
		System.out.println("Parent House....renovated");
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



public class OppsConcepts {
	public static void main(String[] args) {
		
		//Inheritance example
		Parent p = new Parent();
		p.parentMethod();
		Child c = new Child(); 
		c.childMethod();
		
		//Polymorphism example
		System.out.println("OverLoading ...........>>>>>>");
		OverLoading ol = new OverLoading();
		ol.house(1);
		ol.house(1.5f);
		
		System.out.println("Overriding ...........>>>>>>>");
		Parent p1 = new Parent();
		p1.house();
		
		Parent p2 = new Child();
		p1.house();
	}

}








