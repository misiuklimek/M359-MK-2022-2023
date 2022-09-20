package U3;

public class Pizza {
    // instance variables
    // test
    private String store;
    private int inches;
    private int numToppings;
    private boolean isDeepDish;


    // constructors
    public Pizza(String store, int inches, int numToppings, boolean isDeepDish){
        this.store = store;
        this.inches = inches;
        this.numToppings = numToppings;
        this.isDeepDish = isDeepDish;
    }

    public Pizza(String store, int inches, boolean isDeepDish){
        this.store = store;
        this.inches = inches;
        this.numToppings = 0;
        this.isDeepDish = isDeepDish;
    }

    // methods

    // toString method returns (not prints) the pizza in a string/text format
    public String toString(){
        String output = "I am from " + this.store + "\n";
        output += "I am " + this.inches + " inches\n";
        output += "I have " + this.numToppings + " toppings\n";
        output += "Am I deep dish? " + this.isDeepDish + "\n";
        return output;
    }

    //printinfo method: print all pizza info
    public void printInfo(){
        System.out.println("I am from " + this.store);
        System.out.println("I am " + this.inches + " inches");
        System.out.println("I have " + this.numToppings + " toppings");
        System.out.println("Am I deep dish? " + this.isDeepDish + "\n");
    }

    // .equals method returns if pizzas are equal or not
    public boolean equals(Pizza other){
        if (this.inches == other.inches){
            return true;
        }
        else{
            return false;
        }
    }

    //compareTo returns neg if this comes before other, 0 if =, pos if comes after other
    public int compareTo(Pizza other){
        if (this.inches > other.inches){
            return -1;
        }
        else if (this.inches < other.inches){
            return 1;
        }
        else {
            return 0;
        }
    }

    //get/set methods
    public void setStore(String newStore){
        this.store = newStore;
    }
    public String getStore(){
        return this.store;
    }
    public int getInches() {
        return inches;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }
    public int getNumToppings() {
        return numToppings;
    }
    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }
    public boolean isDeepDish() {
        return isDeepDish;
    }
    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }


}
