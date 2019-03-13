import org.junit.Assert;
import org.junit.Test;

public class SickPersonTest {

	@Test
	public void constructorTest() {
		SickPerson sp = new SickPerson("Jim", 7, 9);
		Assert.assertEquals("Name not saved correctly", "Jim", sp.getName());
		Assert.assertEquals("Severity not initialized cotrrectly", 7, sp.getSeverity());
		Assert.assertEquals("Age not initialized correctly", 9, sp.getAge());
	}
	
	@Test
	public void compareToTest() {
		SickPerson sp = new SickPerson("Jim", 7, 9);
		SickPerson sp2 = new SickPerson("Joanna", 8, 10);
		HealthyPerson hp = new HealthyPerson("Jimmy", 4, "Checkup");
		
		Assert.assertEquals(1 ,sp.compareToImpl(sp2));
		Assert.assertEquals(-1, sp2.compareToImpl(sp));
		Assert.assertEquals(0, sp.compareToImpl(sp));
		Assert.assertEquals(0, sp.compareToImpl(hp));
	}
	
	@Test
	public void animalCompareToTest() {
		Animal a = new Animal("Terrior", 2);
		Animal a2 = new Animal("Poodle", 3);
		
		Assert.assertEquals(1, a.compareTo(a2));
		Assert.assertEquals(-1, a2.compareTo(a));
		Assert.assertEquals(0, a.compareTo(a));
	}
	
	@Test
	public void toStringTest() {
		SickPerson sp = new SickPerson("Jim", 7, 9);
		System.out.println(sp);
		
		Assert.assertEquals("Jim, a 9-year old. Severity level 7", sp.toString());
	}
}
