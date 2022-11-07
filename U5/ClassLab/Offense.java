package U5.ClassLab;

public class Offense {
    private double offenseScore;
    private double avgPts;
    private double avgYards;


    public static double calcOffense(double avgPts, double avgYards){
        double offenseScore = 0;
        if (avgPts > 30){
            offenseScore += .5;
        } else if (avgPts > 25) {
            offenseScore += .4;
        } else if (avgPts > 20) {
            offenseScore += .25;
        } else if (avgPts > 17.5) {
            offenseScore += .1;
        }

        if (avgYards > 400){
            offenseScore += .5;
        } else if (avgYards > 380) {
            offenseScore +=.4;
        } else if (avgYards > 370) {
            offenseScore += .3;
        } else if (avgYards >340) {
            offenseScore += .2;
        } else {
            offenseScore += .1;
        }
        return offenseScore;
    }

    public Offense(double avgPts, double avgYards) {
        this.offenseScore = calcOffense(avgPts, avgYards);
        this.avgPts = avgPts;
        this.avgYards = avgYards;
    }


    public double getOffenseScore() {
        return offenseScore;
    }

    public void setOffenseScore(double offenseScore) {
        this.offenseScore = offenseScore;
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


}
