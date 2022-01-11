import java.util.Scanner;

import javax.security.auth.callback.TextOutputCallback;

class Item {

    private String name;
    private double price;
    private int itemId;

    public Item(String _name, double _price, int _itemId) {
         name = _name;
         price = _price;
         itemId = _itemId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return itemId;
    }

    public String toString() {
        return name + ">>" + price + ">>" + itemId;
    }

}

public class MianAbrarBusiness{

    public String name;
    public double price;
    public int itemId;
    
    public static void main(String[] args) {
        Item[] menuItems = new Item[10];
    {
        menuItems[0] = new Item("Bacon, Egg, and Cheese", 6.99, 1);
        menuItems[1] = new Item("Reuben Sandwhich", 5.99, 2);
        menuItems[2] = new Item("Bage;", 4.99, 3);
        menuItems[3] = new Item("Prosciutto", 4.99, 4);
        menuItems[4] = new Item("Deli Cheese", 5.99, 5);
        menuItems[5] = new Item("Meatball Sandwhich", 6.99, 6);
        menuItems[6] = new Item("Salami", 5.99, 7);
        menuItems[7] = new Item("Chorizo", 4.99, 8);
        menuItems[8] = new Item("Mortadella", 2.99, 9);
        menuItems[9] = new Item("Pastrami", 7.99, 10);
    }
        String owner = "Ibby";
        String store = "Ibby's Deli";

        String decorativeLine = "\n$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n";
        System.out.println(decorativeLine);

        System.out.println("Welcome to " + store + "!");
        System.out.println("I'm " + owner + ", What's your name?");
        Scanner in = new Scanner(System.in);
        String userName = in.nextLine();
        String greeting = "Hey there, " + userName + "!";
        System.out.println(greeting);
        System.out.println(decorativeLine);
        

        String[] menu = new String[menuItems.length];
        for(int i = 0; i<menuItems.length; i++){
            menu[i] = menuItems[i].getName();
        }

        int i = 1;
        for (int counter = 0; counter < menu.length; counter++) {

            System.out.print(i + ".");
            System.out.println(menuItems[counter]);
            System.out.println("");
            i++;
        }
        System.out.println(decorativeLine);
        System.out.println("");
        System.out.print("\nHow many things do you want to order ? "); // asking user how many items he wants
        int numOrders = in.nextInt(); // taking input as integer

        String orderedItems[] = new String[numOrders]; // array to recieve each of users selected item

        System.out.println("\nKindly Place your order now !");
        System.out.println("(Please type the number associated with name of the item you would like to order)");
System.out.println("if you would like to quit press 0");
        double totalCost = 0;

        for (int l = 0; l < numOrders; l++) { // loop for taking user input of every item he wants
            int UserInput = in.nextInt();

            if (UserInput == 0){
            break;
            }
    
            int ItemIndex = UserInput - 1;
            orderedItems[l] = menu[ItemIndex];
            totalCost += menuItems[ItemIndex].getPrice();
            System.out.println("Whats your next Item #");
    
        }

        System.out.println(decorativeLine);
        System.out.println("");
        System.out.println("You ordered the following: ");
        for (String item : orderedItems) {
            System.out.println(item);
        }
        System.out.println("Your subtotal is" + totalCost) ;
        System.out.println(decorativeLine);
        System.out.println("");
        System.out.println("Thank you, Your order's coming right up! Have a good day! ");

    }
}
