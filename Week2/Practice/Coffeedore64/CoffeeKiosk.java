import java.util.ArrayList;
public class CoffeeKiosk {
     // MEMBER VARIABLES
    private ArrayList<Order> orders;
    private ArrayList<Item> menu;

    // CONSTRUCTOR
    public CoffeeKiosk() {
        this.orders = new ArrayList<Order>();
        this.menu = new ArrayList<Item>();
    }

    // KIOSK METHODS
    // add Menu Item
    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name, price);
        this.menu.add(newItem);
        newItem.setIndex(this.menu.indexOf(newItem));
    }
    // display Menu
    public void displayMenu() {
        System.out.println("Menu:");
        for(Item item : this.menu) {
            System.out.println(item.getIndex() +" "+ item.getName() + " -- $" + item.getPrice());
        }
    }
    // new Order
  public void newOrder() {
        
    	// Shows the user a message prompt and then sets their input to a variable, name
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
    
    	// Your code:
        // Create a new order with the given input string
        Order order = new Order(name);
        // Show the user the menu, so they can choose items to add.
        displayMenu();
        
    	// Prompts the user to enter an item number
        System.out.println("Please enter a menu item index or q to quit:");
        String itemNumber = System.console().readLine();
        
        // Write a while loop to collect all user's order items
        while(!itemNumber.equals("q")) {
            
            // Get the item object from the menu, and add the item to the order
            try{
                order.addItem(menu.get(Integer.parseInt(itemNumber)));
            }catch(IndexOutOfBoundsException i){
                System.out.println("Invalid selection");
            }catch(NumberFormatException n){
                System.out.println("Invalid selection");
            }
            // Ask them to enter a new item index or q again, and take their input
            System.out.println("Please enter a menu item index or q to quit:");
            itemNumber = System.console().readLine();
        }
        // After you have collected their order, print the order details 
    	// as the example below. You may use the order's display method.
        order.display();
        
    }

    //Getters and Setters
    public ArrayList<Order> getOrders() {
        return this.orders;
    }
    public ArrayList<Item> getMenu() {
        return this.menu;
    }
    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    public void setMenu(ArrayList<Item> menu) {
        this.menu = menu;
    }
}