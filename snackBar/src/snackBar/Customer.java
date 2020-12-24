package snackBar;

public class Customer {

    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;




    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    };


    // id
    public int getId() {
        return this.id;
    };

    // name
    public String getName() {
        return this.name;
    };

    public void setName(String name) {
        this.name = name;
    };

    // cash on hand
    public double getCashOnHand() {
        return this.cashOnHand;
    };

    public void setCashOnHand(double cashToAdd) {
        this.cashOnHand = this.cashOnHand + cashToAdd;
    };

    public void buySnacks(double costToBuy) {
        this.cashOnHand = this.cashOnHand - costToBuy;
    }

}
