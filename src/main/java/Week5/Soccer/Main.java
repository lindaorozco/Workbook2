package Week5.Soccer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // create 8 players
        Player p1 = new Player("Player 1","forward", 22 );
        Player p2 = new Player("Player 2","center", 44);
        Player p3 = new Player("Player 3","forward", 21 );
        Player p4 = new Player("Player 4","forward", 267 );
        Player p5 = new Player("Player 5","forward", 274);
        Player p6 = new Player("Player 6","forward", 275);
        Player p7 = new Player("Player 7","forward", 24);
        Player p8 = new Player("Player 8","forward", 27 );

        // create list of players for each team
        List<Player> team1 = new ArrayList<>(Arrays.asList(p1,p2));
        List<Player> team2 = new ArrayList<>(Arrays.asList(p3,p4));
        List<Player> team3 = new ArrayList<>(Arrays.asList(p5,p6));
        List<Player> team4 = new ArrayList<>(Arrays.asList(p7,p8));

        // list of a teams names
        List<Team> teams = new ArrayList<>();
        teams.add(new Team("Jojo", team1));
        teams.add(new Team("Bolita", team2));
        teams.add(new Team("Kosita", team3));
        teams.add(new Team("King", team4));

        // create a tournament
        Tournament tournament = new Tournament("week6.TurtlePaint.src.main.java.com.pluralsight.forms.World Cup", teams);
        // launches the tournament
        tournament.startTournament();
    }
}
