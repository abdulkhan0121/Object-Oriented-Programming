import java.util.ArrayList;

public class PlayersList   {
	public ArrayList<TennisPlayers> players = new ArrayList<TennisPlayers>();

	public PlayersList() {
		
	}
	
	public ArrayList<TennisPlayers> addToList(TennisPlayers player) {
		players.add(player);
		return players;
	}
	
	public ArrayList<TennisPlayers> removeFromList(TennisPlayers player){
		players.remove(player);
		return players;
	}
	
	public ArrayList<TennisPlayers> getList(){
		return players;
	}
	
}
