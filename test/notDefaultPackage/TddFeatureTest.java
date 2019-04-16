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
		Account acc1 = new Account("Maciej", "Przybylo", 10);
		Account acc2 = new Account("Janusz", "Smith", 10);
		Account acc3 = new Account("Bogdan", "GrraazYna", 10);
		Account acc4 = new Account("Maciej", "Przybylo", 10);
		Account acc5 = new Account("Maciej", "Przybylo", 10);
		Account acc6 = new Account("Maciej", "Przybylo", 10);
		Account acc7 = new Account("Maciej", "Przybylo", 10);
		Account acc8 = new Account("Maciej", "Przybylo", 10);
		app.map.put(1, acc1);
		app.map.put(2, acc2);
		app.map.put(3, acc3);
		app.map.put(4, acc4);
		app.map.put(5, acc5);
		app.map.put(6, acc6);
		app.map.put(7, acc7);
		app.map.put(8, acc8);
	
		assertEquals(6, app.cAcc("Maciej"));
	
}

}