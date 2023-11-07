import java.util.ArrayList;

public class CafeUtil {

    public int getStreakGoal(int numWeeks){
        int sum = 0;
        for(int i = 1; i <= numWeeks; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum=0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
        }
    return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i = 0; i < menuItems.size(); i++){
            System.out.printf("%s %s \n",i,menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name: ");
        String name = System.console().readLine();
        System.out.printf("Hello %s " , name);
        System.out.printf(" There are %s customers ahead of you ", customers.size());
        customers.add(name);
        System.out.println(customers);
    }

    public void printPriceChart(String product, double price, int maxQuantity) {
        System.out.println(product);
            for(int i = 1; i <= maxQuantity; i++){
                System.out.printf("%d - $%.2f \n", i,  price *i);
            }
     
    }

    public boolean displayMenu(ArrayList<String> menuItems, ArrayList<Double> prices){
        if (menuItems.size() != prices.size()){
            System.out.println("Menu items and prices are not the same length");
            return false;
        }else{
            for(int i = 0; i < menuItems.size(); i++){
                System.out.printf("%d %s -- $%.2f \n",i,menuItems.get(i), prices.get(i));
            }
            return true;
        }
    }
        // Sensei bonus:
    public void addCustomers(ArrayList<String> customerList) {
        boolean finished = false;
        String input;
        while (!finished) {
            System.out.println("Please enter a customer name or press Q to quit:");
            input = System.console().readLine();
            if (input.equals("Q")) {
                finished = true;
                return;
            }
            customerList.add(input);
            System.out.printf("%s was added to the list.", input);
            System.out.println(customerList);
        }
    }

}

