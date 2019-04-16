package notDefaultPackage;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;





public class TddFeatureTest {
	
	TddFeature bob = new TddFeature();

	@Test
	public void tdd() {
		assertEquals(0,bob.getClass());
	}

}
