package basics;

public class ControlStatements {
	
	public static void IfCondition()
	{
		int empID = 20;
		if (empID == 20) {
			System.out.println("valid");
		} else {
			System.out.println("not valid");
		}
	}

	public static void IfElseIf() {    
		    int marks=65;  
		      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<70){  
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
		}  
	
	public static void main(String[] args) {
		IfCondition();
		IfElseIf();
	}
}
