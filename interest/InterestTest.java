package interest;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class InterestTest {
	
	Interest it=new Interest();
	
	@Test
	public void simpleInterestTest() {
		
		assertEquals(200.0,it.simpleInterest(1000.0,4.0,5.0),0.0);
	}
	
	@Test
    public void compoundInterestTest() {
	
    	assertEquals(1215.5062500000001,it.compoundInterest(1000.0,4.0,5.0),0.0);
	}
	

}
