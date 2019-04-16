package notDefaultPackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Ignore;
import org.junit.Test;





public class TddFeatureTest {
	
	

	@Test
	public void tdd() {
		try {
			TddFeature bob = new TddFeature();
			
			
		} catch (ClassNotFoundException e) {
			fail("Class not existing");
		}

}}
