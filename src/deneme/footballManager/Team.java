package deneme.footballManager;

import java.util.ArrayList;
import java.util.List;

public class Team {
	private String name;
	private int budget;
	private List<Player> players;
	
	public Team(String name, int budget) {
		this.name = name;
		this.budget = budget;
		this.players = new ArrayList<>();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBudget() {
		return budget;
	}
	
	public void setBudget(int budget) {
		this.budget = budget;
	}
	
	public List<Player> getPlayers() {
		return players;
	}
	
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	
	public void addPlayer(Player player) {
		if (budget >= player.getValue()) {
			players.add(player);
			budget -= player.getValue();
		} else {
			System.out.println("Yeterli bütçe yok!");
		}
	}
	
	// Oyuncularý listeleme
	public void listPlayers() {
		for (Player player : players) {
			System.out.println(player);
		}
	}
	
	// Takýmýn gücünü hesaplama
	public double getTeamStrength() {
		int strength = 0;
		for (Player player : players) {
			strength += player.getSkillLevel();
		}
		return (double) strength / players.size();
	}
}