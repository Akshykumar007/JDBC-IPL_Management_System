package sess.jun2IPLProject;

import java.util.ArrayList;
import java.util.List;

public class PlayerService {
	PlayerDao dao=null;
	List<Player> playerList=null;
	Player p=null;
	int rowCnt;
	
	PlayerService(){
		dao = new PlayerDao();
	}
	
	public List<Player> getPlayerList() {
		 playerList=dao.getPlayerList();
		return playerList;
	}

	public Player getPlayerByID(int id) {
		playerList=this.getPlayerList();
		for(Player player : playerList) {
			if(player.getId()==id) {
				return player;
			}
		}
	    return null;
	}
	
	public List<Player> getPlayersByTeamName(String TeamName) {
		playerList=this.getPlayerList();
		boolean flag=false;
		List<Player> players = new ArrayList<Player>();
		for(Player player : playerList) {
			if(player.getTeamname().equals(TeamName)) {
				players.add(player);
				flag=true;
			}
		}
		if(flag==true) {
		          return players;
		}
		else {
			    return null;
		}
	}	
	
	public List<Player> getPlayerByName(String name) {
		playerList=this.getPlayerList();
		boolean flag=false;
		List<Player> players = new ArrayList<Player>();
		for(Player player : playerList) {
			if(player.getName().equals(name)) {
				flag=true;
				players.add(player);
			}
		}
		if(flag==true) {
	          return players;
	        }
	     else {
		    return null;
	         }
	}

	public List<Player> getBatsmans(String pos) {
		playerList=this.getPlayerList();
		boolean flag=false;
		List<Player> players = new ArrayList<Player>();
		for(Player p1:playerList) {
			if(p1.getPos().equals(pos)) {
				players.add(p1);
				flag=true;
			}
		}
		if(flag==true) {
	          return players;
	        }
	     else {
		    return null;
	         }
	}
	
	public List<Player> getBowlers(String pos) {
		playerList=this.getPlayerList();
		boolean flag=false;
		List<Player> players = new ArrayList<Player>();
		for(Player p1:playerList) {
			if(p1.getPos().equals(pos)) {
				players.add(p1);
				flag=true;
			}
		}
		if(flag==true) {
	          return players;
	        }
	     else {
		    return null;
	         }
	}
	
	public Player getMaximumRuns() {
		playerList=this.getPlayerList();
		Player p=null;
		int max=0;
		for(Player p1: playerList) {
			if(p1.getRuns()>max) {
				max=p1.getRuns();
				p=p1;
			}
		}
		return p;
	}
	
	public Player getMaximumWickets() {
		playerList=this.getPlayerList();
		Player p=null;
		int max=0;
		for(Player p1: playerList) {
			if(p1.getWickets()>max) {
				max=p1.getWickets();
				p=p1;
			}
		}
		return p;
	}
	
	public Player getMaximumCatches() {
		playerList=this.getPlayerList();
		Player p=null;
		int max=0;
		for(Player p1: playerList) {
			if(p1.getCatches()>max) {
				max=p1.getCatches();
				p=p1;
			}
		}
		return p;
	}

	public String insertNewPlayer(Player newPlayer) {
		String s = dao.insertNewPlayer(newPlayer);
		return s;
	}

	public int updatePlayerTeamNameByID(int playerid, String playerTeamName) {
		rowCnt = dao.updatePlayerTeamNameByID(playerid, playerTeamName);
		return rowCnt;
	}

	public int updatePlayerRunsByID(int playerid, int playerRuns) {
		rowCnt = dao.updatePlayerRunsByID(playerid, playerRuns);
		return rowCnt;
	}

	public int updatePlayerWicketsByID(int playerid, int playerWickets) {
		rowCnt = dao.updatePlayerWicketsByID(playerid, playerWickets);
		return rowCnt;
	}

	public int updatePlayerCatchesByID(int playerid, int playerCatches) {
		rowCnt = dao.updatePlayerCatchesByID(playerid, playerCatches);
		return rowCnt;
	}	
	
	public int deletePlayerByID(int playerID) {
		rowCnt = dao.deletePlayerByID(playerID);
		return rowCnt;
	}
}
