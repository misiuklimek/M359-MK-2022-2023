package U5.ClassLab;

public class League {
    private Conferance c1;
    private Conferance c2;
    private final int NUM_WILDCARD = 3;
    private String winner;

    public League(Conferance c1, Conferance c2) {
        this.c1 = new Conferance(c1.getName(), c1.getD1(), c1.getD2(), c1.getD3(), c1.getD4(), c1.getWinner());
        this.c2 = new Conferance(c2.getName(), c2.getD1(), c2.getD2(), c2.getD3(), c2.getD4(), c2.getWinner());
    }


    public Conferance getC1() {
        return c1;
    }

    public void setC1(Conferance c1) {
        this.c1 = c1;
    }

    public Conferance getC2() {
        return c2;
    }

    public void setC2(Conferance c2) {
        this.c2 = c2;
    }
}
