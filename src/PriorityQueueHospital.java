import java.util.ArrayList;

/**
 * 
 * @author Malachi Swedberg
 *
 */
@SuppressWarnings("rawtypes")
public class PriorityQueueHospital<PatientType extends Comparable<PatientType>> extends Hospital{

	private ArrayList<PatientType> patients;
	
	public PriorityQueueHospital() {
		patients = new ArrayList<PatientType>(25);
	}

	@SuppressWarnings("unchecked")
	public void addPatient(Object patient) {
		patients.add((PatientType) patient);
	}
	
	public PatientType nextPatient() {
		return patients.get(0);
	}
	
	public int numPatients() {
		return patients.size();
	}
	
	public String hospitalType() {
		return "PriorityQueueHospital";
	}

	public String allPatientInfo() {
		String result = "";
		for (int i = 0; i < patients.size(); ++i) {
			result = result.concat(patients.get(i).toString());
		}
		return result;
	}

	@Override
	public Object treatNextPatient() {
		ArrayList<PatientType> temp = new ArrayList<PatientType>(patients.size());
		PatientType temp2 = patients.get(0);
		for (int i = 0; i < patients.size() - 1; ++i) {
			temp.add(patients.get(i + 1));
		}
		this.patients = temp;
		
		return temp2;
	}
}
