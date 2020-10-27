package snackBar;

public class Main {
    public static void main(String[] args) {
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, 1);
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, 1);
        Snack pretzel = new Snack("Pretzel", 30, 2.00, 2);

        Snack soda = new Snack("Soda", 24, 2.50, 2);
        Snack water = new Snack("Water", 20, 2.75, 2);
        // Processing
        // Customer 1 Jane buys 3 of snack 4 soda
        jane.buySnacks(soda.getCost() * 3);
        soda.buySnacks(3);
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println("Quantity of Soda " + soda.getQuantity());

        // Customer 1 Jane buys 1 of snack 3 pretzel
        jane.buySnacks(pretzel.getCost());
        pretzel.buySnacks(1);
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println("Quantity of Pretzel " + pretzel.getQuantity());

        // customer 2 Bob buys 2 of snack 4 soda
        bob.buySnacks(soda.getCost() * 2);
        soda.buySnacks(2);
        System.out.println("Bob cash on hand " + bob.getCash());
        System.out.println("Quantity of Soda " + soda.getQuantity());

        // customer 1 Jane finds $10
        jane.addCash(10.00);
        System.out.println("Jane cash on hand " + jane.getCash());

        // customer 1 jave buys 1 of snack 2 chocolate bar
        jane.buySnacks(chocolateBar.getCost());
        chocolateBar.buySnacks(1);
        System.out.println("Jane cash on hand " + jane.getCash());
        System.out.println("Quantity of Chocalate Bar's " + chocolateBar.getQuantity());

        // add 12 more items to snack 3 pretzel
        pretzel.setQuantity(12);
        System.out.println("Quantity of Pretzel's " + pretzel.getQuantity());

        // customer 2 bob buys 3 of snack 3 pretzel
        bob.buySnacks(pretzel.getCost() * 3);
        pretzel.buySnacks(3);
        System.out.println("Bob cash on hand " + bob.getCash());
        System.out.println("Quantity of Pretzel's " + pretzel.getQuantity());
    }

}
