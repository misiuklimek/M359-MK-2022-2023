package U5.ClassLab;

public class Offense {
    private double offenseScore;
    private int numPlayMakers;
    private double avgPts;
    private double avgYards;
    private double avgRush;
    private double avgPass;

    public Offense(double offenseScore, int numPlayMakers, double avgPts, double avgYards, double avgRush, double avgPass) {
        this.offenseScore = offenseScore;
        this.numPlayMakers = numPlayMakers;
        this.avgPts = avgPts;
        this.avgYards = avgYards;
        this.avgRush = avgRush;
        this.avgPass = avgPass;
    }

    public void calcOffense(){
        if ()
    }

    public double getOffenseScore() {
        return offenseScore;
    }

    public void setOffenseScore(double offenseScore) {
        this.offenseScore = offenseScore;
    }

    public int getNumPlayMakers() {
        return numPlayMakers;
    }

    public void setNumPlayMakers(int numPlayMakers) {
        this.numPlayMakers = numPlayMakers;
    }

    public double getAvgPts() {
        return avgPts;
    }

    public void setAvgPts(double avgPts) {
        this.avgPts = avgPts;
    }

    public double getAvgYards() {
        return avgYards;
    }

    public void setAvgYards(double avgYards) {
        this.avgYards = avgYards;
    }

    public double getAvgRush() {
        return avgRush;
    }

    public void setAvgRush(double avgRush) {
        this.avgRush = avgRush;
    }

    public double getAvgPass() {
        return avgPass;
    }

    public void setAvgPass(double avgPass) {
        this.avgPass = avgPass;
    }
}
