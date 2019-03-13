import java.util.ArrayList;

/**
 * 
 * @author Malachi Swedberg
 *
 */
@SuppressWarnings("rawtypes")
public class StackHospital<PatientType> extends Hospital{
	
	private ArrayList<PatientType> patients;
	
	/**
	 * initializes the arrayList for the Hospital
	 */
	public StackHospital() {
		this.patients = new ArrayList<PatientType>(25);
	}

	/**
	 * @return the next patient to be treated, which is the last in the ArrayList
	 */
	public PatientType nextPatient() {
		return patients.get(patients.size() - 1);
	}
	
	/**
	 * @return the next patient to be treated, while also resaving a new ArrayList without the treated patient.
	 */
	public PatientType treatNextPatient() {
		
		ArrayList<PatientType> temp = new ArrayList<PatientType>(patients.size());
		PatientType temp2 = patients.get(patients.size() - 1);
		for (int i = 0; i < patients.size() - 1; ++i) {
			temp.add(patients.get(i));
		}
		this.patients = temp;
		
		return temp2;
	}
	
	/**
	 * @return the size of the patients arrayList
	 */
	public int numPatients() {
		return patients.size();
	}
	
	/**
	 * @return the type of Hospital the object is
	 */
	public String hospitalType() {
		return "StackHospital";
	}
	
	/**
	 * Prints a toString of all patients found in the Hospital, simply concatonated onto one another
	 */
	public String allPatientInfo() {
		String result = "";
		for (int i = 0; i < patients.size(); ++i) {
			result = result.concat(patients.get(i).toString());
		}
		return result;
	}

	/**
	 * Adds a patient to the ArrayList
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void addPatient(Object patient) {
		patients.add((PatientType) patient);
	}
}
