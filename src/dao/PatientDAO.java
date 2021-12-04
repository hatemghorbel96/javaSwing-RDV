package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import classes.Patient;

public class PatientDAO {

	public void Ajouter(Patient p)
	{
		String req="insert into patient(codePatient,nomPatient,dateNaiss) values(?,?,?)";
		
		PreparedStatement pst;
		try 
		{
			pst = connexion.ConnectDB().prepareStatement(req);
			pst.setInt(1,p.getCodePatient());
			pst.setString(2,p.getNomPatient() );
			pst.setString(3,p.getDateNaiss() );
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, " le patient est inserer ");
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}



public void Modifier(int c,String n , String d)
{
	String req="update patient set nomPatient=?,dateNaiss=? where codePatient=?";
	
	PreparedStatement pst;
	try {
		pst = connexion.ConnectDB().prepareStatement(req);
		
		pst.setInt(1,c );
		pst.setString(2,n );
		pst.setString(3, d);
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "le patient Modifié ");
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
}

public static ArrayList<Patient> liste_calendrier()
{
	String req="select * from patient ";
	ResultSet rs=null;
	Patient p ;
	ArrayList<Patient> lc = new ArrayList<Patient>();
	
	try
	{
		PreparedStatement pst=connexion.ConnectDB().prepareStatement(req);
		rs= pst.executeQuery();
		while(rs.next())
		{    
            p = new Patient(
                    rs.getInt("codePatient"),
                    rs.getString("nomPatient"),
                    rs.getString("dateNaiss")
                    
                   
            );
            
            lc.add(p);
        }
	}
	catch (SQLException e)
	{

		e.printStackTrace();
	}
	
	return lc;
	
}

public void Supprimer(String p)
{
	String req="delete from patient where codePatient=? ";
	
	PreparedStatement pst;
	try
	{
		pst = connexion.ConnectDB().prepareStatement(req);
		pst.setString(1,p );
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, " le patient supprimé ! ");
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
	
}

}

