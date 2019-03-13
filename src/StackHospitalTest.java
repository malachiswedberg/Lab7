import org.junit.Assert;
import org.junit.Test;

public class StackHospitalTest {

	@Test
	public void addPatientTest() {
		StackHospital<Animal> stackHos = new StackHospital<Animal>();
		Animal a = new Animal("terrior", 2);
		stackHos.addPatient(a);
		
		Assert.assertEquals(a, stackHos.nextPatient());
	}
	
	@Test
	public void nextPatientTest() {
		StackHospital<Animal> stackHos = new StackHospital<Animal>();
		Animal a = new Animal("Poodle", 3);
		Animal a2 = new Animal("Terrior", 2);

		stackHos.addPatient(a);
		stackHos.addPatient(a2);
		
		Assert.assertEquals(a2, stackHos.nextPatient());
	}
	
	@Test
	public void hospitalTypeTest() {
		StackHospital<Animal> stackHos = new StackHospital<Animal>();

		Assert.assertEquals("StackHospital", stackHos.hospitalType());
	}
	
	@Test
	public void allPatientInfoTest() {
		StackHospital<Animal> stackHos = new StackHospital<Animal>();
		Animal a = new Animal("Terrior", 2);
		Animal a2 = new Animal("Poodle", 3);
		stackHos.addPatient(a);
		stackHos.addPatient(a2);
		
		Assert.assertEquals("A 2-year old Terrior.A 3-year old Poodle.", stackHos.allPatientInfo());
	}
	
	@Test
	public void treatNextPatientTest() {
		StackHospital<Person> stackHos = new StackHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");
		stackHos.addPatient(hp);
		stackHos.addPatient(hp2);
		
		Assert.assertEquals(2, stackHos.numPatients());
		Assert.assertEquals(hp2, stackHos.treatNextPatient());
		Assert.assertEquals(1, stackHos.numPatients());
	}
	
	@Test
	public void hospitalToStringTest() {
		StackHospital<Person> stackHos = new StackHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");
		stackHos.addPatient(hp);
		stackHos.addPatient(hp2);
		
		Assert.assertEquals("A StackHospital-type hospital with 2 patients.", stackHos.toString());
	}
}
