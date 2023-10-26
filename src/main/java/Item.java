public class Item{    
    private int quantity;
    private String description;
    private double price;
    private String str;

    public Item(double price, int quantity, String description){
        this.price = price;
        this.quantity = quantity;
        this.description = description;
    }

    public int getQuantity(){
        return quantity;
    }

    public String getDescription(){
        return description;
    }

    public double getPrice(){
        return price;
    }

    public String toString(){
        str = description + "  $" + String.format("%.2f", price) + "  (" + quantity + ")   $" + String.format("%.2f", price*quantity);
        return str;
    }
}
