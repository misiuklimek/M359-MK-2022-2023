package U5.ClassLab;

public class Defense {
    private double defenseScore;
    private double ptsAgainst;
    private double yardsAgainst;

    private double takeaways;

    /**
     * @param ptsAgainst Points the team allows on average per game
     * @param yardsAgainst Yards they allow on average per game
     * @param takeaways Amount of takeaways the team has all season
     */
    public Defense(double ptsAgainst, double yardsAgainst, double takeaways) {
        this.defenseScore = calcDefense(ptsAgainst, yardsAgainst, takeaways);
        this.ptsAgainst = ptsAgainst;
        this.yardsAgainst = yardsAgainst;
        this.takeaways = takeaways;
        if (this.defenseScore > bestDefenseScore){
            bestDefenseScore = this.defenseScore;
        }
    }

    /**
     * Calculates a defenses overall score based off 3 factors to create an overall defensive
     * score for a team based off their stats.
     * @param ptsAgainst Points the team allows on average per game
     * @param yardsAgainst Yards they allow on average per game
     * @param takeaways Amount of takeaways the team has all season
     * @return Returns the overall score
     */
    public static double calcDefense(double ptsAgainst, double yardsAgainst, double takeaways) {
        double defenseScore = 0;
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

        if (yardsAgainst > 400) {
            defenseScore += .1;
        } else if (yardsAgainst > 380) {
            defenseScore += .2;
        } else if (yardsAgainst > 360) {
            defenseScore += .3;
        } else if (yardsAgainst > 330) {
            defenseScore += .4;
        } else {
            defenseScore += .5;
        }

        if (takeaways > 12){
            if (defenseScore >= .905){
                defenseScore = 1.0;
            } else{
                defenseScore = defenseScore * 1.1;
            }
        }
        return defenseScore;
    }

    public static double bestDefenseScore = 0.0;

    public static double getBestDefenseScore(){
        return bestDefenseScore;
    }



    // get/set methods

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

    public double getTakeaways() {
        return takeaways;
    }

    public void setTakeaways(double takeaways) {
        this.takeaways = takeaways;
    }


}
