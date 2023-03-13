public class Groceries {
    private String groceryName;
    private double quantity;

    public Groceries(String groceryName, double quantity){
        this.groceryName = groceryName;
        this.quantity = quantity;
    }

    public String toString(){
        return this.groceryName + " quantity available " + this.quantity;
    }

    public String getGroceryName(){
        return this.groceryName;
    }

    public void setGroceryName(String groceryName) {
        this.groceryName = groceryName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public void addQuantity(double quantity){
        this.quantity = getQuantity() + quantity;
    }

    public void removeQuantity(double quantity){
        this.quantity = getQuantity() - quantity;
    }

}
