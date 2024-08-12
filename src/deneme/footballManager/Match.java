package deneme.footballManager;

public class Match {
	private Team team1;
	private Team team2;
	
	public Match(Team team1, Team team2) {
		this.team1 = team1;
		this.team2 = team2;
	}
	
	public void playMatch() {
		double team1Strength = team1.getTeamStrength();
		double team2Strength = team2.getTeamStrength();
		
		System.out.println(team1.getName() + " vs " + team2.getName());
		
		if (team1Strength > team2Strength) {
			System.out.println(team1.getName() + " kazandý!");
		} else if (team1Strength < team2Strength) {
			System.out.println(team2.getName() + " kazandý!");
		} else {
			System.out.println("Berabere!");
		}
	}
}