package com.gcksoft.logicalStmt;

//Control Statements, conditional stmt /logical stmt
public class LogicalStatments {

	public static void main(String[] args) {
     //if-else,if-else-if,nested-if example
	  boolean result = checkControlStmt(2,4); 
	  System.out.println(result); 
	  if(result) {
	     System.out.println("2"); 
	  }
	  System.out.println("3");
	  
	 //ternary Operator example
	  boolean ternaryOperatorResult = checkTernaryOperator(2);
	  System.out.println(ternaryOperatorResult);
	  
	 //Switch eample
	 boolean switchResult = checkingSwitch(4);
        System.out.println(switchResult);
	}
	
	public static boolean checkControlStmt(int a,int b) {
		//if - else, else if stmt   
		  if(a==2 || b==3) {
			  //nested-if
			  if(b==5) {
			  return true;
			  }else {
				  return false;
			  }
			  }else if(a==3)
			  { return true;
			  }else if(a==4)
		  { return true; 
		  } 
		  return false;
		
	}
	
	public static boolean checkTernaryOperator(int a) {
	   return (a==2)?true:false;
	}
	
	public static boolean checkingSwitch(int a) {
	 switch(a) {
	 case 2: return true;
	 case 4: return true;
	 default : return false;
	 }
	}

}
