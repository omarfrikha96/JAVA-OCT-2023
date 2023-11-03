public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.5;
        double lattePrice = 4.5;
        double cappuccinoPrice = 3.5;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Jimmy";
        String customer3 = "Noah";
        String customer4 = "Sam";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        // Cindhuri ordered a coffee. Print the name of the customer, then "ordered a coffee". If their order isn't ready, print "waiting for order".
        System.out.println(customer1 + " ordered a coffee.");
        if (isReadyOrder1 == false) {
            System.out.println("Waiting for order.");
        } else {
            System.out.println("Order is ready.");
        }
        // Noah ordered a cappuccino, and would like whipped cream. Write a print statement that shows they ordered a cappuccino, and that it will have whipped cream if isReadyOrder3 is true. If it's not ready, include a message to say that as well.
        System.out.println(customer3 + " ordered a cappuccino.");
        if (isReadyOrder3 == false) {
            System.out.println("Waiting for order.");
        } else {
            System.out.println("Order is ready.");
        }
        // Sam just ordered 2 lattes, and would like whipped cream on both. Write a print statement that shows they ordered 2 lattes, and that it will have whipped cream if isReadyOrder4 is true. If it's not ready, include a message to say that as well.
        System.out.println(customer4 + " ordered 2 lattes.");
        if (isReadyOrder4 == false) {
            System.out.println("Waiting for order.");
        } else {
            System.out.println("Order is ready.");
        }
        // Jimmy just realized he was charged for a coffee but had ordered a latte. Tell him his new total (what he owes) to make up the difference.
        System.out.println(customer2 + " ordered a latte.");
        System.out.println(displayTotalMessage + lattePrice);

    }
}
