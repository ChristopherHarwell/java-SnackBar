package snackBar;

public class Snack {
    private static int maxId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;



    public Snack(String name, int quantity, double cost, int vendingMachineId) {

        maxId++;
        id = maxId;

        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    };

    // id
    public int getId() {
        return this.id;
    }


    // name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    // quantity
    public int getQuantity() {
        return this.quantity;
    }

    public void setAddQuantity(int addedQuantity) {
        this.quantity = quantity + addedQuantity;
    };

    public void setRemoveQuantity(int removedQuantity) {
        this.quantity = quantity - removedQuantity;
    }



    // cost
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = quantity * cost;
    }


    // vending machine id
    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }


 
    
}
