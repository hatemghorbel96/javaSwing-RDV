package classes;

public class Patient {
	private int codePatient;
	private String nomPatient;
	private String dateNaiss;
	
	
	public Patient(int codePatient, String nomPatient, String dateNaiss) {
		super();
		this.codePatient = codePatient;
		this.nomPatient = nomPatient;
		this.dateNaiss = dateNaiss;
	}
	public int getCodePatient() {
		return codePatient;
	}
	public void setCodePatient(int codePatient) {
		this.codePatient = codePatient;
	}
	public String getNomPatient() {
		return nomPatient;
	}
	public void setNomPatient(String nomPatient) {
		this.nomPatient = nomPatient;
	}
	public String getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(String dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	
	

}
