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
    public Food(String vendor, int price, boolean onSale, boolean isFast, String size, String productName) {
        super(vendor, price, onSale, productName);
        this.isFast = isFast;
        this.size = size;
    }

    public Food(String vendor, int price, boolean isFast, String size, String productName) {
        super(vendor, price, productName);
        this.isFast = isFast;
        this.size = size;
    }

    public Food(boolean isFast, String size) {
        this.isFast = isFast;
        this.size = size;
    }

    public Food(){
        this.isFast = false;
        this.size = "None";

    }

    public boolean compatibleFoodWithClothing(Apparel clothing, Food foodItem){
        if(clothing.getColor().equalsIgnoreCase("White") && foodItem.isFast){
            return false;
        } else{
            return true;
        }
    }

    public boolean isClothingAppropriate(Apparel clothing, Food foodItem){
        if(clothing.getActivity().equalsIgnoreCase("Formal") && foodItem.isFast){
            return false;
        } else{
            return true;
        }
    }

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
