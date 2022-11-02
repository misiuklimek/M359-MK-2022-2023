package U5.ClassLab;

public class Defense {
    private double defenseScore;
    private double ptsAgainst;
    private double yardsAgainst;

    private double takeaways;

    public Defense(double ptsAgainst, double yardsAgainst, double takeaways) {
        this.defenseScore = 0;
        this.ptsAgainst = ptsAgainst;
        this.yardsAgainst = yardsAgainst;
        this.takeaways = takeaways;
    }

    public void calcDefense() {
        if (ptsAgainst > 25) {
            defenseScore += .1;
        } else if (ptsAgainst > 22.5) {
            defenseScore += .20;
        } else if (ptsAgainst > 20) {
            defenseScore += .3;
        } else if (ptsAgainst > 17.5) {
            defenseScore += .4;
        } else {
            defenseScore += .5;
        }

        if (yardsAgainst < 400) {
            defenseScore += .1;
        } else if (yardsAgainst < 380) {
            defenseScore += .2;
        } else if (yardsAgainst < 360) {
            defenseScore += .3;
        } else if (yardsAgainst < 330) {
            defenseScore += .4;
        } else {
            defenseScore += .5;
        }

    }
        public double getDefenseScore() {
        calcDefense();
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

    public double getTakeaways() {
        return takeaways;
    }

    public void setTakeaways(double takeaways) {
        this.takeaways = takeaways;
    }


}
