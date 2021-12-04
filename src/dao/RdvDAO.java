package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import classes.Patient;
import classes.Rdv;
public class RdvDAO {
	public void Ajouter(Rdv r)
	{
		String req="insert into rdv(codePatient,dateRDV,heureRDV) values(?,?,?)";
		
		PreparedStatement pst;
		try 
		{
			pst = connexion.ConnectDB().prepareStatement(req);
			pst.setInt(1,r.getCodePatient());
			pst.setString(2,r.getDateRdv() );
			pst.setString(3,r.getHeureRdv() );
			pst.executeUpdate();
			JOptionPane.showMessageDialog(null, " le rendez vous ajouter ");
		} 
		catch (SQLException e) 
		{
			
			e.printStackTrace();
		}
	}



public void Modifier(int c,String d , String h)
{
	String req="update rdv set dateRDV=?,heureRDV=? where codePatient=?";
	
	PreparedStatement pst;
	try {
		pst = connexion.ConnectDB().prepareStatement(req);
		
		pst.setInt(1,c );
		pst.setString(2,d );
		pst.setString(3, h);
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, "le rendez vous Modifié ");
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
}

public static ArrayList<Rdv> liste_rdv()
{
	String req="select * from rdv ";
	ResultSet rs=null;
	Rdv r ;
	ArrayList<Rdv> lr = new ArrayList<Rdv>();
	
	try
	{
		PreparedStatement pst=connexion.ConnectDB().prepareStatement(req);
		rs= pst.executeQuery();
		while(rs.next())
		{    
            r = new Rdv(
                    rs.getInt("codePatient"),
                    rs.getString("dateRDV"),
                    rs.getString("heureRDV")
                    
                   
            );
            
            lr.add(r);
        }
	}
	catch (SQLException e)
	{

		e.printStackTrace();
	}
	
	return lr;
	
}

public void Supprimer(int c)
{
	String req="delete from rdv where codePatient=? ";
	
	PreparedStatement pst;
	try
	{
		pst = connexion.ConnectDB().prepareStatement(req);
		pst.setInt(1,c );
		pst.executeUpdate();
		JOptionPane.showMessageDialog(null, " le rendez vous est supprimé ! ");
	} 
	catch (SQLException e) 
	{
		
		e.printStackTrace();
	}
	
}

}



