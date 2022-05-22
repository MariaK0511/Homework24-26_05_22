package task2;

public class Computer {
    int cost;
    String model;
    int ram;
    int hdd;
    Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }
    Computer(int cost, String model, int ram, int hdd) {
        this.cost = cost;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }
    public void compInfo() {
        System.out.println("Cost: " + cost);
        System.out.println("Model: " + model);
    }
}
