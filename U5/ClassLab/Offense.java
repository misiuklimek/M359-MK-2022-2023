package U5.ClassLab;

public class Offense {
    private double offenseScore;
    private double avgPts;
    private double avgYards;


    public Offense(double avgPts, double avgYards) {
        this.offenseScore = 0;
        this.avgPts = avgPts;
        this.avgYards = avgYards;
    }

    public void calcOffense(){
        if (avgPts > 17.5) {
            if (avgPts > 20) {
                if (avgPts > 25) {
                    if (avgPts > 30) {
                        offenseScore += .5;
                    } else {
                        offenseScore += .42;
                    }
                } else {
                    offenseScore += .25;
                }
            } else {
                offenseScore += .26;
            }
        } else {
            offenseScore += .15;
        }

        if (avgYards > 335) {
            if (avgYards > 368) {
                if (avgYards > 380) {
                    if (avgYards > 400) {
                        offenseScore += .5;
                    } else {
                        offenseScore += .42;
                    }
                } else {
                    offenseScore += .25;
                }
            } else {
                offenseScore += .26;
            }
        } else {
            offenseScore += .15;
        }
    }

    public double getOffenseScore() {
        calcOffense();
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
