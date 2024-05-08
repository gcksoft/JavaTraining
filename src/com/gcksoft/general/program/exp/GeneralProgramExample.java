package com.gcksoft.general.program.exp;

public class GeneralProgramExample {
	int a;float b;//instance/global/dynamic variable
	static int d;//global static variable
	
	//constructor overloading - start
	  public GeneralProgramExample(){
	  System.out.println("Default Constractor executed......"); a = 0; b = 0.0f; 
	  //it will initialize with default values to instance variable, not for static values.
	  }
	
	  public GeneralProgramExample(int i){
	  System.out.println("int parameterized Constractor executed......"); a = i; }
	  
	  public GeneralProgramExample(float i){
	  System.out.println("float parameterized Constractor executed......"); b = i; }
    //end
	
	public static void main(String[] args) {
		  int c = 10;//local variable
		  reverseString();
		  new GeneralProgramExample();
		  System.out.println("Global Static variable :"+d);
		  new GeneralProgramExample(3f);
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



