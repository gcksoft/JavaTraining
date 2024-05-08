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
	  void salary() {
		  
	  }
	  void house() { 
	  System.out.println("Sub implmentation....."); 
	  }
	 
}

//abstract
interface RBIBank{
	int a = 10;
	void credit();//abstract void salary();
}

abstract class SBIBank{
	abstract void debit();
	void credit() {
		System.out.println("credit implementation...>>>");
	}
}

class SBHBank extends SBIBank{
	void debit() {
		System.out.println("debit implementation...>>>");
	}
}

class Student{
	private int stdId;
	private String stdName;
	//constructor
	public Student(int id) {
		System.out.println("constract executed");
		stdId = id;
	}
	
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
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
		   
		System.out.println("interface and abstract........>>>>>>"); 
		System.out.println(RBIBank.a);
		SBIBank bank = new SBHBank();
		bank.credit();
		
		System.out.println("Encapsulation ..............>>>>>>>");
		Student student = new Student(36);
		System.out.println(student.getStdId());
		
		student.setStdId(12);
		System.out.println(student.getStdId());
		
		
	}

}








