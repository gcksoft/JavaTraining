package com.gcksoft.superKeywordDemo;

class Animal{  
	String color="white";
	Animal(){
		System.out.println("Parent Constructor.....");
	}
	
	void live() {
		System.out.println("Actually Animal live in forest....");
	}
}  
class Dog extends Animal{  
	String color;//by default constructor will assign value null for String variables
	
	//final
		final int b = 10;
		
		final void add() {
			
		}
    // end final
	static int a; static{}
	
	{
		color = "black";
		System.out.println("instance block.....");
	}
	
	Dog(){
		super();//step1
		//step2 - invoke instance intialize block or if no instance block then system will assign default values to instance variable
		System.out.println("Child Constructor.....");//step3
	}
	
	void printColor(){ 
    
	System.out.println(color);//prints color of Dog class  
	System.out.println(super.color);//prints color of Animal class 
	
	super.live();
	}  
}  
public class SuperDemo{ 
	public static void main(String args[]){  
		Dog d=new Dog();  //step 1 : complted
		d.printColor();
		System.out.println("final value :"+d.b);
		}
}  
