import org.junit.Assert;
import org.junit.Test;

public class PriorityQueueHospitalTest {

	@Test
	public void addPatientTest() {
		PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		personPQueue.addPatient(hp);
		
		Assert.assertEquals(hp, personPQueue.nextPatient());
	}
	
	@Test
	public void nextPatientTest() {
		PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");

		personPQueue.addPatient(hp);
		personPQueue.addPatient(hp2);
		
		Assert.assertEquals(hp, personPQueue.nextPatient());
	}
	
	@Test
	public void hospitalTypeTest() {
		PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();

		Assert.assertEquals("PriorityQueueHospital", personPQueue.hospitalType());
	}
	
	@Test
	public void allPatientInfoTest() {
		PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");
		personPQueue.addPatient(hp);
		personPQueue.addPatient(hp2);
		
		Assert.assertEquals("Jim, a 18-year old. In for CheckupJoe, a 18-year old. In for Checkup", personPQueue.allPatientInfo());
	}
	
	@Test
	public void treatNextPatientTest() {
		PriorityQueueHospital<Person> personPQueue = new PriorityQueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");
		personPQueue.addPatient(hp);
		personPQueue.addPatient(hp2);
		
		Assert.assertEquals(2, personPQueue.numPatients());
		Assert.assertEquals(hp, personPQueue.treatNextPatient());
		Assert.assertEquals(1, personPQueue.numPatients());
	}
}
