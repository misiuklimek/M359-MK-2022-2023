/*
Authors: Michael Klimek, Julia Podstawka
Teacher: Moon Period 7
Description: A child of the Product class, a Food object is/n't fast, and has a size attribute
 */
package U9.U9Lab;

public class Food extends Product{
    private boolean isFast;
    private String size;


    //CONSTRUCTORS

    /**
     * Constructor with all variables
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param onSale Boolean if product is on sale (Super)
     * @param isFast Boolean of if the food is fast or sitdown
     * @param size String of the Food size
     * @param productName String of the apparel's name (Super)
     */
    public Food(String vendor, int price, boolean onSale, boolean isFast, String size, String productName) {
        super(vendor, price, onSale, productName);
        this.isFast = isFast;
        this.size = size;
    }
    /**
     * Constructor with all variables except if the food is on sale
     * @param vendor Name of apparel vendor (Super)
     * @param price Price of apparel (Super)
     * @param isFast Boolean of if the food is fast or sitdown
     * @param size String of the Food size
     * @param productName String of the apparel's name (Super)
     */
    public Food(String vendor, int price, boolean isFast, String size, String productName) {
        super(vendor, price, productName);
        this.isFast = isFast;
        this.size = size;
    }

    /**
     * Constructor is super uses no clause constructor
     * @param isFast If the food is fast or sit down
     * @param size String of food size
     */
    public Food(boolean isFast, String size) {
        this.isFast = isFast;
        this.size = size;
    }

    /**
     * No clause constructor
     */
    public Food(){
        this.isFast = false;
        this.size = "None";

    }

    /**
     * Compares the clothing someone is wearing and the food they are eating, if the food incorrectly matches
     * the clothing in a way that would get the clothing dirty it returns false, else true.
     * @param clothing Clothing object tto be compared
     * @return Boolean on if compatible
     */
    public boolean compatibleFoodWithClothing(Apparel clothing){
        if(clothing.getColor().equalsIgnoreCase("White") && this.isFast){
            return false;
        } else{
            return true;
        }
    }

    /**
     * Checks if the currently worn apparel is compatible with type of dining.
     * @param clothing Clothing object worn
     * @return Boolean of result
     */
    public boolean isClothingAppropriate(Apparel clothing){
        if(clothing.getActivity().equalsIgnoreCase("Formal") && this.isFast ||
                !this.isFast && !clothing.getActivity().equalsIgnoreCase("Casual")){
            return false;
        } else{
            return true;
        }
    }

    /**
     * Converts a food item into a string and describes its attributes
     * @return String of food attributes
     */
    @Override
    public String toString(){
        String output = super.toString();
        output += "Is it fast food? "+isFast+"\nSize: "+size+"\n";
        return output;
    }

    //GETTERS AND SETTERS
    public boolean isFast() {
        return isFast;
    }

    public void setFast(boolean fast) {
        isFast = fast;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
