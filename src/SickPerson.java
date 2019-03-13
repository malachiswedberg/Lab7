/**
 * 
 * @author Malachi Swedberg
 *
 */
public class SickPerson extends Person{

	private int severity;
	
	public SickPerson(String name, int severity, int age) {
		super(name, age);
		this.severity = severity;
	}
	
	public int getSeverity() {
		return severity;
	}
	
	@Override
	protected int compareToImpl(Person p) {
		if (!(p instanceof SickPerson)) {
			return 0;
		}
		SickPerson o = (SickPerson)p;
		return o.severity - severity;
	}
	
	public String toString() {
		return String.format("%s Severity level %d", super.toString(), severity);
	}
}
