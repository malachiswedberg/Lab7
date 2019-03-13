/**
 * 
 * @author Malachi Swedberg
 *
 */
public class HealthyPerson extends Person{

	private String reason;
	
	/**
	 * 
	 * @param name of patient
	 * @param age of patient
	 * @param reason for coming to the Hospital
	 */
	public HealthyPerson(String name, int age, String reason) {
		super(name, age);
		this.reason = reason;
	}
	
	/**
	 * 
	 * @return reason for the patient instance
	 */
	public String getReason() {
		return reason;
	}
	
	/**
	 * @return 1 - this comes before p
	 * 		   -1 - this comes after p
	 * 		   0 - names are alphebitically the same, or if p is not an instance of HealthyPerson
	 */
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
	
	/**
	 * @return the super's to string of the patient, followed by their reasoning for coming
	 */
	public String toString() {
		return String.format("%s In for %s", super.toString(), reason);
	}
}
