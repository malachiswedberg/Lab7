/**
 * 
 * @author Malachi Swedberg
 *
 */
public class SickPerson extends Person{

	//Severity of the patients condition
	private int severity;
	
	/**
	 * @param name of the patient
	 * @param severity of the patient's condition
	 * @param age of the patient
	 */
	public SickPerson(String name, int severity, int age) {
		super(name, age);
		this.severity = severity;
	}
	
	//getter for the Severity of a SickPerson instance
	public int getSeverity() {
		return severity;
	}
	
	/**
	 * @return
	 * 	negitive if p's severity is less than the given instance
	 * 	Positive if p's severity is greater than the given instance
	 * 	0 if the severity is equivilant, or if p is not an instance of SickPerson
	 */
	@Override
	protected int compareToImpl(Person p) {
		if (!(p instanceof SickPerson)) {
			return 0;
		}
		SickPerson o = (SickPerson)p;
		return o.severity - severity;
	}
	
	/**
	 * @return the supers toString followed by the addition of severity
	 */
	public String toString() {
		return String.format("%s Severity level %d", super.toString(), severity);
	}
}
