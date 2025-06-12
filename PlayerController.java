package sess.jun2IPLProject;

import java.util.List;

public class PlayerController {
    
	PlayerService service = null;
	List<Player> playerList=null;
	Player player=null;
	int rowCnt;
	PlayerController(){
		service=new PlayerService();
	}
	public List<Player> getPlayerList() {
	    playerList=service.getPlayerList();
		return playerList;
	}

	public Player getPlayerByID(int id) {
		player = service.getPlayerByID(id);
		return player;
	}
	
	public List<Player> getPlayersByTeamName(String TeamName) {
	    playerList=service.getPlayersByTeamName(TeamName);
		return playerList;
	}
	public List<Player> getPlayerByName(String name) {
		playerList=service.getPlayerByName(name);
		return playerList;
	}
	public List<Player> getBatsmans(String pos) {
		playerList=service.getBatsmans(pos);
		return playerList;
	}
	public List<Player> getBowlers(String pos) {
		playerList=service.getBatsmans(pos);
		return playerList;
	}
	public Player getMaximumRuns() {
		player = service.getMaximumRuns();
		return player;
	}
	public Player getMaximumWickets() {
		player = service.getMaximumWickets();
		return player;
	}
	public Player getMaximumCatches() {
		player = service.getMaximumCatches();
		return player;
	}
	public String insertNewPlayer(Player newPlayer) {
		String s = service.insertNewPlayer(newPlayer);
		return s;
	}
	
	public int updatePlayerTeamNameByID(int playerid, String playerTeamName) {
		rowCnt =service.updatePlayerTeamNameByID(playerid,playerTeamName);
		return rowCnt;
	}
	public int updatePlayerRunsByID(int playerid, int playerRuns) {
		rowCnt = service.updatePlayerRunsByID(playerid,playerRuns);
		return rowCnt;
	}
	public int updatePlayerWicketsByID(int playerid, int playerWickets) {
		rowCnt = service.updatePlayerWicketsByID(playerid,playerWickets);
		return rowCnt;
	}
	public int updatePlayerCatchesByID(int playerid, int playerCatches) {
		rowCnt = service.updatePlayerCatchesByID(playerid,playerCatches);
		return rowCnt;
	}
	public int deletePlayerByID(int playerID) {
		rowCnt = service.deletePlayerByID(playerID);
		return rowCnt;
	}
}
