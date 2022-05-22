package task2;

public class Hdd {
    String name;
    double volume;
    Hdd() {
    }
    Hdd(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }
    public void hddInfo() {
        System.out.println("HDD: " + name + ", " + volume);
    }
}
