package construction;
import static org.junit.Assert.assertEquals;
import org.junit.*;
public class ConstructionTest {
	Construction c=new Construction();
	@Test
   public void constructionCostTest() {
		
		assertEquals(2160000.0,c.constructionCost("standard",1800.0,false),0.0);
		
		assertEquals(2700000.0,c.constructionCost("Above standard",1800.0,false),0.0);
		
		assertEquals(3240000.0,c.constructionCost("high standard",1800.0,false),0.0);
		
		assertEquals(4500000.0,c.constructionCost("high standard",1800.0,true),0.0);
	
}
}
