package task2;

public class Computer {
    int cost;
    String model;
    Ram ram;
    Hdd hdd;

    public static class Ram {
        String name;
        double volume;
        String type;

        Ram() {
        }

        Ram(String name, double volume, String type) {
            this.name = name;
            this.volume = volume;
            this.type = type;
        }

        public void ramInfo() {
            System.out.println("RAM: " + name + ", " + volume + ", " + type);
        }
    }

    public static class Hdd {
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

    Computer(int cost, String model) {
        this.cost = cost;
        this.model = model;
    }
    Computer(int cost, String model, Ram ram, Hdd hdd) {
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
