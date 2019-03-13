import org.junit.Assert;
import org.junit.Test;

public class HealthyPersonTest {

	@Test
	public void constructorTest() {
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		
		Assert.assertEquals("Jim", hp.getName());
		Assert.assertEquals(18, hp.getAge());
		Assert.assertEquals("Checkup", hp.getReason());
	}
	
	@Test
	public void compareToImplTest() {
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Hailey", 19, "Checkup");
		SickPerson sp = new SickPerson("Joey", 9, 12);
		
		Assert.assertEquals(1, hp.compareToImpl(hp2));
		Assert.assertEquals(-1, hp2.compareToImpl(hp));
		Assert.assertEquals(0, hp.compareToImpl(hp));
		Assert.assertEquals(0, hp.compareToImpl(sp));
	}
	
	@Test
	public void compareToTest() {
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Hailey", 19, "Checkup");
		SickPerson sp = new SickPerson("Joey", 9, 12);
		
		Assert.assertEquals(1, hp.compareTo(hp2));
		Assert.assertEquals(-1, hp2.compareTo(hp));
		Assert.assertEquals(0, hp.compareTo(hp));
		Assert.assertEquals(0, hp.compareTo(sp));
	}
	
	@Test
	public void toStringTest() {
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");

		Assert.assertEquals("Jim, a 18-year old. In for Checkup", hp.toString());
	}

}
