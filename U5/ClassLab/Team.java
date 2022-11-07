package U5.ClassLab;

public class Team {

    // Instance variables
    private String name;
    private int wins;
    private int losses;
    private double winPerc;
    private Offense teamO;
    private Defense teamD;

    public static String bestTeam = "";
    public static String getBestTeam(){
        return bestTeam;
    }

    public static boolean coinFlip(){

        int coin = (int)(Math.random() * 10)+1;
        return coin >= 5;
    }

    // Constructor

    /**
     * Creates an NFL team as its own object.
     * @param name Name of the team
     * @param teamO Team's offense, has additional parameters
     * @param teamD Team's defense, has additional parameters
     */
    public Team(String name, Offense teamO, Defense teamD) {
        this.name = name;
        this.teamO = new Offense(teamO.getAvgPts(), teamO.getAvgYards());
        this.teamD = new Defense(teamD.getPtsAgainst(), teamD.getYardsAgainst(), teamD.getTakeaways());
        this.wins = 0;
        this.losses = 0;
        this.winPerc = 0;
    }

    // methods

    /**
     * Plays two teams against each other in order to find the winner using their offense and defense
     * scores to determine who should be the winner of the game.
     * @param other Team 2
     * @return
     */
    public Team playGame(Team other){
        double chance = .5;
        double offenseDifference = this.getTeamO().getOffenseScore() - other.getTeamO().getOffenseScore();
        double defenseDifference = this.getTeamD().getDefenseScore() - other.getTeamD().getDefenseScore();
        if (offenseDifference > .3){
            chance += .3;
        } else if (offenseDifference > .15){
            chance += .15;
        } else if (offenseDifference > .05){
            chance += .1;
        } else if (offenseDifference > -.05) {
            chance -= .1;
        } else if (offenseDifference > -.15) {
            chance -= .15;
        } else if (offenseDifference > -.30) {
            chance -= .3;
        }
        if (defenseDifference > .3){
            chance += .3;
        } else if (defenseDifference > .15){
            chance += .15;
        } else if (defenseDifference > .05){
            chance += .1;
        } else if (defenseDifference > -.05) {
            chance -= .1;
        } else if (defenseDifference > -.15) {
            chance -= .15;
        } else if (defenseDifference > -.30) {
            chance -= .3;
        }
        if (chance < .5){
            other.wins++;
            this.losses++;
            return other;
        } else if (chance > .5) {
            this.wins++;
            other.losses++;
            return this;
        } else{
            if(coinFlip()){
                other.wins++;
                this.losses++;
                return other;
            } else{
                this.wins++;
                other.losses++;
                return this;

            }
        }
    }




    /**
     * Calculates the win percentage by dividing wins by losses.
     */
    public void calcWinPerc(){
        winPerc = wins/losses;
    }




    //get/set

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public double getWinPerc() {
        return winPerc;
    }

    public void setWinPerc(double winPerc) {
        this.winPerc = winPerc;
    }


    public Offense getTeamO() {
        return teamO;
    }

    public void setTeamO(Offense teamO) {
        this.teamO = teamO;
    }

    public Defense getTeamD() {
        return teamD;
    }

    public void setTeamD(Defense teamD) {
        this.teamD = teamD;
    }
}
