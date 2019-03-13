import org.junit.Assert;
import org.junit.Test;


public class QueueHospitalTest {
	
	@Test
	public void constructorTest() {
		QueueHospital<Person> qHos = new QueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		qHos.addPatient(hp);
		
		Assert.assertEquals(hp, qHos.nextPatient());
	}
	
	@Test
	public void nextPatientTest() {
		QueueHospital<Person> qHos = new QueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");

		qHos.addPatient(hp);
		qHos.addPatient(hp2);
		
		Assert.assertEquals(hp, qHos.nextPatient());
	}
	
	@Test
	public void hospitalTypeTest() {
		QueueHospital<Person> qHos = new QueueHospital<Person>();

		Assert.assertEquals("QueueHospital", qHos.hospitalType());
	}
	
	@Test
	public void allPatientInfoTest() {
		QueueHospital<Person> qHos = new QueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");
		qHos.addPatient(hp);
		qHos.addPatient(hp2);
		
		Assert.assertEquals("Jim, a 18-year old. In for CheckupJoe, a 18-year old. In for Checkup", qHos.allPatientInfo());
	}
	
	@Test
	public void treatNextPatientTest() {
		QueueHospital<Person> qHos = new QueueHospital<Person>();
		HealthyPerson hp = new HealthyPerson("Jim", 18, "Checkup");
		HealthyPerson hp2 = new HealthyPerson("Joe", 18, "Checkup");
		qHos.addPatient(hp);
		qHos.addPatient(hp2);
		
		Assert.assertEquals(2, qHos.numPatients());
		Assert.assertEquals(hp, qHos.treatNextPatient());
		Assert.assertEquals(1, qHos.numPatients());
	}
	
}
