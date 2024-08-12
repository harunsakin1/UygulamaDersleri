package deneme.footballManager;

public class FootballManager {
	public static void main(String[] args) {
		// Takým ve oyuncu oluþturma
		Player player1 = new Player("John Doe", 25, "Forward", 80, 1000000);
		Player player2 = new Player("Jane Smith", 22, "Midfielder", 85, 1200000);
		Player player3 = new Player("Bob Brown", 28, "Defender", 75, 800000);
		Player player4 = new Player("Alice Green", 30, "Goalkeeper", 90, 1500000);
		
		Team team1 = new Team("Team A", 5000000);
		team1.addPlayer(player1);
		team1.addPlayer(player2);
		
		Team team2 = new Team("Team B", 5000000);
		team2.addPlayer(player3);
		team2.addPlayer(player4);
		
		// Lig oluþturma ve takýmlarý ekleme
		League league = new League("Super League");
		league.addTeam(team1);
		league.addTeam(team2);
		
		// Ligi baþlatma
		league.startLeague();
		System.out.println(team1.getPlayers());
		System.out.println(team1.getTeamStrength());
	}
}