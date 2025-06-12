package sess.jun2IPLProject;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import sess.may31.MyDBConf;

public class PlayerDao {
	
	Connection con =null;
	String query=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	int rowCnt=0;
	
	PlayerDao(){
		con=MyDBConf.getMyDBConnection();
	}

	public List<Player> getPlayerList() {
		List<Player> players = new ArrayList<Player>();
		try {
			st=con.createStatement();
			query="select * from player"; 
			rs=st.executeQuery(query);
			while(rs.next()) {
				Player p = new Player();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setTeamname(rs.getString(3));
				p.setPos(rs.getString(4));
				p.setRuns(rs.getInt(5));
				p.setWickets(rs.getInt(6));
				p.setCatches(rs.getInt(7));
				players.add(p);			
			}
			return players;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return null;
	}

	public String insertNewPlayer(Player newPlayer) {
		query="insert into kiran_academy.player values(?,?,?,?,?,?,?)"; 
		try {
			pst=con.prepareStatement(query);
			pst.setInt(1, newPlayer.getId());
			pst.setString(2, newPlayer.getName());
			pst.setString(3, newPlayer.getTeamname());
			pst.setString(4, newPlayer.getPos());
			pst.setInt(5, newPlayer.getRuns());
			pst.setInt(6, newPlayer.getWickets());
			pst.setInt(7, newPlayer.getCatches());
			pst.executeUpdate();
			return newPlayer.getName() + " >> inserted sucessfully";
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return newPlayer.getName() + " >> failed to insert.";
	}

	public int updatePlayerTeamNameByID(int playerID,String teamName) {
		try {
		   st=con.createStatement();	
		   query = "UPDATE kiran_academy.player SET teamname = ? WHERE id = ?";
		   pst = con.prepareStatement(query); 
   	       pst.setString(1, teamName);
   	       pst.setInt(2,playerID);

	       int rowsAffected = pst.executeUpdate();
	       return rowsAffected;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int updatePlayerRunsByID(int playerID,int runs) {
		try {
		   st=con.createStatement();	
		   query = "UPDATE kiran_academy.player SET runs = ? WHERE id = ?";
		   pst = con.prepareStatement(query);
	       pst.setInt(1, runs);
	       pst.setInt(2,playerID);

	       int rowsAffected = pst.executeUpdate();
	       return rowsAffected;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int updatePlayerWicketsByID(int playerID,int wickets) {
		try {
		   st=con.createStatement();	
		   query = "UPDATE kiran_academy.player SET wickets = ? WHERE id = ?";
		   pst = con.prepareStatement(query);
	       pst.setInt(1, wickets);
	       pst.setInt(2,playerID);

	       int rowsAffected = pst.executeUpdate();
	       return rowsAffected;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	public int updatePlayerCatchesByID(int playerID,int catches) {
		try {
		   st=con.createStatement();	
		   query = "UPDATE kiran_academy.player SET catches = ? WHERE id = ?";
		   pst = con.prepareStatement(query);
		   pst.setInt(1, catches);// 1st ?
		   pst.setInt(2,playerID); 

	       int rowsAffected = pst.executeUpdate();
	       return rowsAffected;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}
	
	/*public int deletePlayerByID(int playerID) {
		try {
		   query="delete from kiran_academy.player where id=? ";
		   st = con.prepareStatement(query);
	       pst.setInt(1, playerID);

	       int rowsAffected = pst.executeUpdate();

	       return rowsAffected;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return 0;
	}*/
	
	public int deletePlayerByID(int playerID) {
	    query = "DELETE FROM kiran_academy.player WHERE id=?";
	    try (PreparedStatement pst = con.prepareStatement(query)) {
	        pst.setInt(1, playerID);
	        return pst.executeUpdate(); 
	    } catch (SQLException e) {
	        e.printStackTrace(); 
	    }
	    return 0; 
	}

}
