/**
 * 
 * @author Malachi Swedberg
 *
 */
public class HealthyPerson extends Person{

	private String reason;
	
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}
	
	public String getReason() {
		return reason;
	}
	
	protected int compareToImpl(Person p) {
		if (!(p instanceof HealthyPerson)) {
			return 0;
		}
		if (this.getName().compareToIgnoreCase(p.getName()) > 0) {
			return 1;
		}
		else if (this.getName().compareToIgnoreCase(p.getName()) < 0) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return String.format("%s In for %s", super.toString(), reason);
	}
}
