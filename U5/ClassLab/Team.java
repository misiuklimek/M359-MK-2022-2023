package U5.ClassLab;

public class Team {

    // Instance variables
    private String name;
    private int wins;
    private int losses;
    private double winPerc;
    private String div;
    private Offense teamO;
    private Defense teamD;

    public static String bestTeam = "";
    public static String getBestTeam(){
        return bestTeam;
    }

    public static boolean coinFlip(){

        int coin = (int)(Math.random() * 10)+1;
        if (coin >= 5){
            return true;
        } else{
            return false;
        }
    }



    // Constructor

    public Team(String name, String div, Offense teamO, Defense teamD) {
        this.name = name;
        this.div = div;
        this.teamO = new Offense(teamO.getAvgPts(), teamO.getAvgYards());
        this.teamD = new Defense(teamD.getPtsAgainst(), teamD.getYardsAgainst(), teamD.getTakeaways());
        this.wins = 0;
        this.losses = 0;
        this.winPerc = 0;
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

    public String getDivision() {
        return div;
    }

    public void setDivision(String division) {
        this.div = division;
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
