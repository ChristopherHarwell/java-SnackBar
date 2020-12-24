package snackBar;

public class Main {
    private static void snackBarData() {
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocalateBar = new Snack("Chocalate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());

        Snack soda = new Snack("Soda", 36, 1.75, drink.getId());
        Snack water = new Snack("Water", 36, 1.75, drink.getId());

        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // System.out.println(customer1.getName() + " cash on hand " + "$" + customer1.setCashOnHand(37.75) + "\n"
        //         + "Quantity of " + snack4.getName() + " is " + snack4.setQuantity());

        // System.out.println(customer2.getName() + " cash on hand " + "$" + customer2.getCashOnHand() + "\n"
        //         + "Quantity of " + snack4.getName() + " is " + snack4.getCost());

    };

    public static void main(String[] args) {
        snackBarData();
    };
};