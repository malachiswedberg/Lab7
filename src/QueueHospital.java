import java.util.ArrayList;
/**
 * 
 * @author Malachi Swedberg
 *
 */
@SuppressWarnings("rawtypes")
public class QueueHospital<PatientType> extends Hospital{
	
	private ArrayList<PatientType> patients;
	
	public QueueHospital() {
		this.patients = new ArrayList<PatientType>(25);
	}

	public PatientType nextPatient() {
		return patients.get(0);
	}
	
	public PatientType treatNextPatient() {
		
		ArrayList<PatientType> temp = new ArrayList<PatientType>(patients.size());
		PatientType temp2 = patients.get(0);
		for (int i = 0; i < patients.size() - 1; ++i) {
			temp.add(patients.get(i + 1));
		}
		this.patients = temp;
		
		return temp2;
	}
	
	public int numPatients() {
		return patients.size();
	}
	
	public String hospitalType() {
		return "QueueHospital";
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
