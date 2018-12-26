import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TrainingTest {
	private Training publicTraining;
	private Training corporateTraining;
	
	@Before
	public void setUp(){
		publicTraining = new publicTraining("C",7000);
		corporateTraining = new corporateTraining("JAVA",30000);
	}
	
	@Test
	public void publicTrainingCharges() {
		int expected = 700000;
		int actual = publicTraining.getOrderValue();
		assertEquals(expected,actual);
	}

	@Test
	public void publicCorporateCharges() {
		int expected = 150000;
		int actual = corporateTraining.getOrderValue();
		assertEquals(expected,actual);
	}
}