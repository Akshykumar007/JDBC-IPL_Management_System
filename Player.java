package sess.jun2IPLProject;

public class Player {

	private int id,runs,wickets,catches;
	private String name,pos,teamname;

	Player(){

	}

	public Player(int id,String name, String teamname, String pos, int runs, int wickets, int catches) {
		super();
		this.id = id;
		this.runs = runs;
		this.wickets = wickets;
		this.catches = catches;
		this.name = name;
		this.pos = pos;
		this.teamname = teamname;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getCatches() {
		return catches;
	}
	public void setCatches(int catches) {
		this.catches = catches;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPos() {
		return pos;
	}
	public void setPos(String pos) {
		this.pos = pos;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}

	@Override
	public String toString() {
		return  id + "\t" + name + "\t" + teamname + "\t\t"+ pos + "\t\t" + runs + "\t" + wickets + "\t\t" + catches ;
	}
}
