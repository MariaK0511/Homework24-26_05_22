package task2;

public class Ram {
        String name;
        double volume;
        String type;
         Ram(){

        }

      Ram(String name, double volume, String type){
             this.name = name;
             this.volume = volume;
             this.type = type;
        }

        public  void ramInfo(){
                System.out.println("RAM: " + name + ", "+ volume + ", " + type);
        }
}
