package U3.ShoeCourseJUnitExample;

public class Shoe {
    //private variables
    private String brand;
    private String style;
    private double price;
    private double size;

    //constructors
    public Shoe(String brand, String style,double size,  double price){
        this.brand = brand;
        this.style = style;
        this.price = price;
        this.size = size;
    }

    //methods
    public boolean equals(Shoe other){
        if (this.getBrand().equals(other.getBrand()) && this.getStyle().equals(other.getStyle())){
            return true;
        } else{
            return false;
        }
    }

    public int compareTo(Shoe other){
        if (this.price < other.price){
            return -1;
        } else if (this.price > other.price){
            return 1;
        } else if (this.price == other.price){
            return 0;
        } else{
            return 0;
        }
    }


    //getset methods
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getStyle() {
        return style;
    }
    public void setStyle(String style) {
        this.style = style;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }
}
