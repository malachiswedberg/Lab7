import java.util.ArrayList;

/**
 * 
 * @author Malachi Swedberg
 *
 */
@SuppressWarnings("rawtypes")
public class StackHospital<PatientType> extends Hospital{
	
	private ArrayList<PatientType> patients;
	
	public StackHospital() {
		this.patients = new ArrayList<PatientType>(25);
	}

	public PatientType nextPatient() {
		return patients.get(patients.size() - 1);
	}
	
	public PatientType treatNextPatient() {
		
		ArrayList<PatientType> temp = new ArrayList<PatientType>(patients.size());
		PatientType temp2 = patients.get(patients.size() - 1);
		for (int i = 0; i < patients.size() - 1; ++i) {
			temp.add(patients.get(i));
		}
		this.patients = temp;
		
		return temp2;
	}
	
	
	public int numPatients() {
		return patients.size();
	}
	
	public String hospitalType() {
		return "StackHospital";
	}
	
	public String allPatientInfo() {
		String result = "";
		for (int i = 0; i < patients.size(); ++i) {
			result = result.concat(patients.get(i).toString());
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addPatient(Object patient) {
		patients.add((PatientType) patient);
	}
}
