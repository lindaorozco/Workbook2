package Week5.Soccer;

import java.util.List;

public class Team {

    private String name;
    private List<Player> players;

    // constructor
    public Team(String name, List<Player> players) {
        this.name = name;
        this.players = players;
    }
    // method
    public void addPlayer(Player player){

    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
