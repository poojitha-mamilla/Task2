package calculator;
import org.junit.*;
import calculator.*;
public class CalTest {
	Cal c=new Cal();
	@Test
    public void addTest() {
    	
    	Assert.assertEquals(11,c.add("2 4 5"));
    	
    }
    @Test
    public void multiplicationTest() {
    	Assert.assertEquals(720,c.multiplication("2 4 9 10"));
    	
    }
    @Test
    public void divisionTest() {
    	
    	Assert.assertEquals(2,c.division(4, 2));
    	
    }

}
