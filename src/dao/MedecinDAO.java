package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import classes.Medecin;
public class MedecinDAO {

	public static ArrayList<Medecin> liste()
	{
		String req="select * from medecin ";
		ResultSet rs=null;
		Medecin m;
		ArrayList<Medecin> lm = new ArrayList<Medecin>();
		
		try
		{
			PreparedStatement pst=connexion.ConnectDB().prepareStatement(req);
			rs= pst.executeQuery();
			while(rs.next())
			{    
                m = new Medecin(
                		rs.getInt("codeMedecin"),
                		rs.getString("nomMedecin"),
                		rs.getString("specialite")
                       
                );
                
                lm.add(m);
            }
		}
		catch (SQLException e)
		{

			e.printStackTrace();
		}
		
		return lm;
		
	}

}


