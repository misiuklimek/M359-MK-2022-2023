package U5.ClassLab;

public class Division {
    private String name;
    private Team team1;
    private Team team2;
    private Team team3;
    private Team team4;
    private String winner;
    private double winPer;

    public Division(String name, Team team1, Team team2, Team team3, Team team4, String winner, double winPer) {
        this.name = name;
        this.team1 = new Team(team1.getName(), team1.getDivision(), team1.getTeamO(), team1.getTeamD());
        this.team2 = new Team(team2.getName(), team2.getDivision(), team2.getTeamO(), team2.getTeamD());
        this.team3 = new Team(team3.getName(), team3.getDivision(), team3.getTeamO(), team3.getTeamD());
        this.team4 = new Team(team4.getName(), team4.getDivision(), team4.getTeamO(), team4.getTeamD());
        this.winner = winner;
        this.winPer = winPer;
    }

    public Team getTeam1() {
        return team1;
    }

    public void setTeam1(Team team1) {
        this.team1 = team1;
    }

    public Team getTeam2() {
        return team2;
    }

    public void setTeam2(Team team2) {
        this.team2 = team2;
    }

    public Team getTeam3() {
        return team3;
    }

    public void setTeam3(Team team3) {
        this.team3 = team3;
    }

    public Team getTeam4() {
        return team4;
    }

    public void setTeam4(Team team4) {
        this.team4 = team4;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public double getWinPer() {
        return winPer;
    }

    public void setWinPer(double winPer) {
        this.winPer = winPer;
    }
}
