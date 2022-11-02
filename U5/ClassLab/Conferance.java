package U5.ClassLab;

public class Conferance {
    private String name;
    private Division d1;
    private Division d2;
    private Division d3;
    private Division d4;
    private String winner;

    public Conferance(String name, Division d1, Division d2, Division d3, Division d4, String winner) {
        this.name = name;
        this.d1 = new Division(d1.getWinner(), d1.getTeam1(), d1.getTeam2(), d1.getTeam3(), d1.getTeam4(), d1.getWinner(), d1.getWinPer());
        this.d2 = new Division(d2.getWinner(), d2.getTeam1(), d2.getTeam2(), d2.getTeam3(), d2.getTeam4(), d2.getWinner(), d2.getWinPer());
        this.d3 = new Division(d3.getWinner(), d3.getTeam1(), d3.getTeam2(), d3.getTeam3(), d3.getTeam4(), d3.getWinner(), d3.getWinPer());
        this.d4 = new Division(d4.getWinner(), d4.getTeam1(), d4.getTeam2(), d4.getTeam3(), d4.getTeam4(), d4.getWinner(), d4.getWinPer());
        this.winner = winner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Division getD1() {
        return d1;
    }

    public void setD1(Division d1) {
        this.d1 = d1;
    }

    public Division getD2() {
        return d2;
    }

    public void setD2(Division d2) {
        this.d2 = d2;
    }

    public Division getD3() {
        return d3;
    }

    public void setD3(Division d3) {
        this.d3 = d3;
    }

    public Division getD4() {
        return d4;
    }

    public void setD4(Division d4) {
        this.d4 = d4;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }
}
