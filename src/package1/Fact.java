package package1;

public class Fact {
	 int fact;  
	  
	 public Fact()
	 {
		 fact = 1;
	 }
	 
	 public int GetFact(int num)
	 {
		 fact = 1;
		 
		 for(int i = 1; i <= num; i++)
		 {    
			 fact *= i;    
		 }    

		 return fact;
	 }
	 
}
