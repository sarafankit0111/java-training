package Day3;

public class Bike extends Vehicle{

    @Override
    void run() {
        System.out.println("Runnable");
    }

    public static void main(String args[]){
        Bike b = new Bike();
        b.run();
        b.show();
    }
}
