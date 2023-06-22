package package2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import package1.Fibonachi;

public class FibonachiTest {
	Fibonachi fib;
	int a;
	
    @BeforeEach
    void setUp() {
        fib =  new Fibonachi();
        a = fib.GetFibonachi(12);
    }
	
	@Test
	void GetFibonachi() {
		assertEquals(377, fib.GetFibonachi(12));		
	}
}
