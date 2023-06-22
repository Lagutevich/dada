import package1.Fibonachi;
import package1.Prime;
import package1.Fact;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.util.*;

public class dadada {

	public static void main(String[] args) {
		
		Fact f = new Fact();
		Fibonachi a = new Fibonachi();
		int b = a.GetFibonachi(12);
		int c = f.GetFact(5);
		
		System.out.println(c);
	}

}
