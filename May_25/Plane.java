package May_25;

public class Plane extends Vehicle {
    private double wingsSpan;
    
    public Plane(int speed, String color, double price, double wingsSpan) {
        super(speed, color, price);
        this.wingsSpan = wingsSpan;
    }
    
    public void fly() {
        System.out.println("Plane is flying.");
    }
    
    @Override
    public void stop() {
        System.out.println("Plane has stopped.");
    }
    
    public double getWingsSpan() {
        return wingsSpan;
    }
}
