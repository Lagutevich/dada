package package2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import package1.Prime;

public class PrimeTest {
	Prime pr;
	boolean a;
	
    @BeforeEach
    void setUp() {
        pr =  new Prime();
        a = pr.isPrime(377);
    }
	
	@Test
	void isPrime() {
		assertEquals(false, pr.isPrime(377));		
	}
}
