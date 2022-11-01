package U5.ClassLab;

public class Defense {
    private double defenseScore;
    private double ptsAgainst;
    private double yardsAgainst;
    private double passAgainst;
    private double sacks;
    private double ints;

    public Defense(double defenseScore) {
        this.defenseScore = defenseScore;
        this.ptsAgainst = ptsAgainst;
        this.yardsAgainst = yardsAgainst;
        this.passAgainst = passAgainst;
        this.sacks = sacks;
        this.ints = ints;
    }

    public double getDefenseScore() {
        return defenseScore;
    }

    public void setDefenseScore(double defenseScore) {
        this.defenseScore = defenseScore;
    }

    public double getPtsAgainst() {
        return ptsAgainst;
    }

    public void setPtsAgainst(double ptsAgainst) {
        this.ptsAgainst = ptsAgainst;
    }

    public double getYardsAgainst() {
        return yardsAgainst;
    }

    public void setYardsAgainst(double yardsAgainst) {
        this.yardsAgainst = yardsAgainst;
    }

    public double getPassAgainst() {
        return passAgainst;
    }

    public void setPassAgainst(double passAgainst) {
        this.passAgainst = passAgainst;
    }

    public double getSacks() {
        return sacks;
    }

    public void setSacks(double sacks) {
        this.sacks = sacks;
    }

    public double getInts() {
        return ints;
    }

    public void setInts(double ints) {
        this.ints = ints;
    }
}
