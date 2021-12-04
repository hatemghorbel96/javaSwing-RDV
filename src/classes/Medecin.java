package classes;

public class Medecin {
private int codeMedecin;
private String nomMedecin;
private String specialite;


public Medecin(int codeMedecin, String nomMedecin, String specialite) {
	super();
	this.codeMedecin = codeMedecin;
	this.nomMedecin = nomMedecin;
	this.specialite = specialite;
}
public int getCodeMedecin() {
	return codeMedecin;
}
public void setCodeMedecin(int codeMedecin) {
	this.codeMedecin = codeMedecin;
}
public String getNomMedecin() {
	return nomMedecin;
}
public void setNomMedecin(String nomMedecin) {
	this.nomMedecin = nomMedecin;
}
public String getSpecialite() {
	return specialite;
}
public void setSpecialite(String specialite) {
	this.specialite = specialite;
}

}
