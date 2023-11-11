import java.util.ArrayList;
public class Order {
    // MEMBER VARIABLES
    private String name; // default value of null
    private boolean ready; // default value of false
    private ArrayList<Item> items; // defaults to null

    // CONSTRUCTOR
        // No arguments, sets name to "Guest", initializes items as an empty list.
    public Order(){
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }
        // Takes a name argument, sets name to argument, initializes items as an empty list.
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }
 // ORDER METHODS
    // Adds an item to the items list
    public void addItem(Item item){
        this.items.add(item);
    }

    // Order status is ready
    public String getStatusMessage(){
        if(this.ready){
            return "Your order is ready!";
        } else {
            return "Thank you for waiting! Your order will be ready soon.";
        }
    }

    // Displays the order's total price
   public double getOrderTotal(){
        double total = 0;
        for(Item item : items){
            total += item.getPrice();
        }
        return total;
    }
    
    // Displays the order's items
    public void display(){
        System.out.println("Customer Name: "+ this.name);
        for(Item item : this.items){
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getOrderTotal());
    }

    // GETTERS & SETTERS
    public String getName(){
        return this.name;
    }
    public boolean getReady(){
        return this.ready;
    }
    public ArrayList<Item> getItems(){
        return this.items;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setReady(boolean ready){
        this.ready=ready;
    }
    public void setItems(ArrayList<Item> items){
        this.items=items;
    }
}