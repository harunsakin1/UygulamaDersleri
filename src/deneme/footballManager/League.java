package deneme.footballManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class League {
	private String name;
	private List<Team> teams;
	
	public League(String name) {
		this.name = name;
		this.teams = new ArrayList<>();
	}
	
	public void addTeam(Team team) {
		teams.add(team);
	}
	
	public void startLeague() {
		Random random = new Random();
		for (int i = 0; i < teams.size(); i++) {
			for (int j = i + 1; j < teams.size(); j++) {
				Match match = new Match(teams.get(i), teams.get(j));
				match.playMatch();
			}
		}
	}
}