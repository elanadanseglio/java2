import java.util.ArrayList;

public class ShoppingCart {

    private double total;
    private double shippingCharge;
    private ArrayList<Item> Items = new ArrayList<>();
    // private Invoice invoice;

    public ShoppingCart(){
    }

    public ShoppingCart(double shippingCharge){
        this.shippingCharge = shippingCharge;
    }

    public void addItem(Item item){
        Items.add(item);
    }

    public void calculateTotal(){
        for (int i = 0; i < Items.size(); i++){
            total += (Items.get(i).getPrice() * Items.get(i).getQuantity());
        }
        total = (double) Math.round(total*100)/100;
        total = total + (total*0.10);
        total = (double) Math.round(total*100)/100;

        if (total < 10.00){
            total += shippingCharge;
        } else {
            shippingCharge = 0;
        }
    }

    public String getTotal(){
        return "$" + String.format("%.2f", total);
    }

    public double getShippingCharge(){
        return shippingCharge;
    }

    public Invoice shipOrder(String name, String streetAddr, String city, String state, int zip){
        return new Invoice(name, streetAddr, city, state, zip);
    }

    public class Invoice {
        private String name, streetAddr, city, state;
        private int zip;

        public Invoice(String name, String streetAddr, String city, String state, int zip){
            this.name = name;
            this.streetAddr = streetAddr;
            this.state = state;
            this.city = city;
            this.zip = zip;
        }

        @Override
        public String toString(){
            String ship = "";
            if (getShippingCharge() == 0) {
                ship = "Free";
            } else {
                ship = "$" + String.format("%.2f", getShippingCharge()) + "";
            }

            String inv1 = "Ship to: \n" + " " + name + "\n " + streetAddr + "\n " + city + ", " + state + " " + zip + "\n\n";
            String inv2 = "Items \n----- \n"; 
            for (Item s : Items){
                inv2 += s + "\n";
            }
            String inv3 = "\nShipping: " + ship + "\n\n";
            String inv4 = "Total Cost \n----- \n" + getTotal();
            return inv1+inv2+inv3+inv4;
        }
    }
}

