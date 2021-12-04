package classes;

public class Rdv {
private int codePatient;
private String dateRdv;
private String heureRdv;


public Rdv(int codePatient, String dateRdv, String heureRdv) {
	super();
	this.codePatient = codePatient;
	this.dateRdv = dateRdv;
	this.heureRdv = heureRdv;
}
public int getCodePatient() {
	return codePatient;
}
public void setCodePatient(int codePatient) {
	this.codePatient = codePatient;
}
public String getDateRdv() {
	return dateRdv;
}
public void setDateRdv(String dateRdv) {
	this.dateRdv = dateRdv;
}
public String getHeureRdv() {
	return heureRdv;
}
public void setHeureRdv(String heureRdv) {
	this.heureRdv = heureRdv;
}


}
