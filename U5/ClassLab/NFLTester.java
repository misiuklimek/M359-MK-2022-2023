package U5.ClassLab;

public class NFLTester {
    public static void main(String[] args) {
        Team bears = new Team("Chicago Bears", new Offense(20.4,378), new Defense(18,300,14));
        Team lions = new Team("Detroit Lions", new Offense(24.4,400), new Defense(1,1,8));

        System.out.println(bears.playGame(lions));
    }

    public static String divisionPlayoffs(Team x, Team y, Team z, Team a){
        x.playGame(y);
        x.playGame(z);
        x.playGame(a);
        y.playGame(z);
        y.playGame(a);
        z.playGame(a);
        return "";
    }

}
