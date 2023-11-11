public class TestOrders {
    public static void main(String[] args){

        // Menu items
        Item item1 = new Item("drip coffee", 1.80);
        Item item2 = new Item("capuccino", 2.50);
        Item item3 = new Item("iced coffee", 2.3);
        Item item4 = new Item("mocha", 3.50);

        // 2 orders for unspecified guests
        Order order1 = new Order();
        Order order2 = new Order();

        // 3 orders for specified guests
        Order order3 = new Order("Omar");
        Order order4 = new Order("Ahmed");
        Order order5 = new Order("Mohamed");

        // add 2 last items to each order
        order1.addItem(item1);
        order1.addItem(item2);
        order2.addItem(item3);
        order2.addItem(item4);
        order3.addItem(item1);
        order3.addItem(item3);
        order4.addItem(item2);
        order4.addItem(item4);
        order5.addItem(item4);
        order5.addItem(item1);
        order5.addItem(item3);

        // display all orders
        System.out.println("=== Orders Display ===");
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // display order status
        System.out.println("=== Order Status ===");
        System.out.println(order1.getStatusMessage());
        order2.setReady(true); 
        System.out.println(order2.getStatusMessage());
        System.out.println(order3.getStatusMessage());
        order4.setReady(true); 
        System.out.println(order4.getStatusMessage());
        System.out.println(order5.getStatusMessage());

        // display order total
        System.out.println("=== Order Totals ===");
        System.out.println(order1.getOrderTotal());
        order1.display();


    }
    
}