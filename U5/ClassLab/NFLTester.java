package U5.ClassLab;

public class NFLTester {
    public static void main(String[] args) {
        Team bears = new Team("Chicago Bears", new Offense(20.4,378), new Defense(18,300,9));
        Team lions = new Team("Detroit Lions", new Offense(24.4,400), new Defense(1,1,2));

        System.out.println(bears.playGame(lions));



    }

    /**
     * Plays out a divisional season to find out who wins the division through the use of matches
     * between each of its members.
     * @param x Team in division #1
     * @param y Team in division #2
     * @param z Team in division #3
     * @param a Team in division #4
     * @return Team with most wins
     */
    public static String divisionPlayoffs(Team x, Team y, Team z, Team a){
        x.playGame(y);
        x.playGame(z);
        x.playGame(a);
        y.playGame(z);
        y.playGame(a);
        z.playGame(a);
        int xWins = x.getWins();
        int yWins = y.getWins();
        int zWins = z.getWins();
        int aWins = a.getWins();
        String winner = "";


        return "Winner is: " + winner;
    }

    /**
     *
     * @param x Team 1
     * @param y Team 2
     * @param z Team 3
     * @param a Team 4
     * @return
     */
    public static String divisionToString(Team x, Team y, Team z, Team a){
        String output = "* * * * * * * * * * * * * * *\n";

        output += "Team: " + x.getName() + "\n\tOffense Score: " + x.getTeamO().getOffenseScore()
                + "\n\tDefense Score: " + x.getTeamD().getDefenseScore() + "\n\n";
        output += "Team: " + y.getName() + "\n\tOffense Score: " + y.getTeamO().getOffenseScore()
                + "\n\tDefense Score: " + y.getTeamD().getDefenseScore() + "\n\n";
        output += "Team: " + z.getName() + "\n\tOffense Score: " + z.getTeamO().getOffenseScore()
                + "\n\tDefense Score: " + z.getTeamD().getDefenseScore() + "\n\n";
        output += "Team: " + a.getName() + "\n\tOffense Score: " + a.getTeamO().getOffenseScore()
                + "\n\tDefense Score: " + a.getTeamD().getDefenseScore() + "\n\n";

        output += "* * * * * * * * * * * * * * *\n";
        return output;
    }

}
