package package2;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import package1.Fact;

public class FactTest {
	Fact f;
	int a;
	
    @BeforeEach
    void setUp() {
        f =  new Fact();
        a = f.GetFact(5);
    }
	
	@Test
	void GetFact() {
		assertEquals(120, f.GetFact(5));		
	}
}
