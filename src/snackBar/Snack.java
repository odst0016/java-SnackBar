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
        this.id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }

    public void setVendingMachineId(int id) {
        this.vendingMachineId = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int toAdd) {
        this.quantity = this.quantity + toAdd;
    }

    public void buySnacks(int toBuy) {
        this.quantity = this.quantity - toBuy;
    }

    public double totalCost(double howMany) {
        return cost * howMany;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" + "name: " + name + "\n" + "quantity: " + quantity + "\n" + "cost: " + cost
                + "\n" + "Vending Machine ID: " + vendingMachineId;
        return rtnStr;
    }

}
