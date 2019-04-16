package notDefaultPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;





public class TddFeatureTest {
	TddFeature bob = new TddFeature();	
	
	@Ignore
	@Test
	public void tdd() {
		TddFeature bob = new TddFeature();
}
	@Test
	public void accCount() {
		assertEquals(0, bob.countAcc());
	
}
	@Test
	public void CountAccount() {
		
	
		assertEquals(6, app.cAcc("Maciej"));
	
}

}