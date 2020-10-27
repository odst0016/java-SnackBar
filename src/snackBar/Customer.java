package snackBar;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.cash = cash;
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

    public void addCash(double cash) {
        this.cash = this.cash + cash;
    }

    public double getCash() {
        return cash;
    }

    public void buySnacks(double total) {
        this.cash = this.cash - total;
    }

    @Override
    public String toString() {
        String rtnStr = "id: " + id + "\n" + "name: " + name + "\n" + "cash: " + cash;
        return rtnStr;
    }
}
