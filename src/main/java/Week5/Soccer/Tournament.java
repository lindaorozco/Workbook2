package Week5.Soccer;

import java.util.ArrayList;
import java.util.List;

public class Tournament {

    private String nameOfTournament;
    private List<Team> teams;
    private List<Round> rounds;
    private Team winnerOfTournament;

    // create constructor
    public Tournament(String nameOfTournament, List<Team> teams){
        this.nameOfTournament = nameOfTournament;
        this.teams = teams;

    }

    public void startTournament(){
        while (winnerOfTournament == null){
            // create first round
            Round round = createRound(teams);
            teams = round.playRound();
            if (teams.size() == 1){
               winnerOfTournament = teams.getFirst();
            }

        }
        System.out.println("The winner of " + nameOfTournament + " is " + winnerOfTournament.getName());
    }
    // create the first round with 4 matches using 8 teams
    // First round will be 4 matches
    public Round createRound (List<Team> teams ) {
        // create a new list to store which team wins the match
        List<Match> matches = new ArrayList<>();
        for (int i = 0; i < teams.size(); i = i + 2) { //
            // create the first match
            Match match = new Match(teams.get(i), teams.get(i + 1));
            matches.add(match);
        }
        return new Round(matches);
    }


}

