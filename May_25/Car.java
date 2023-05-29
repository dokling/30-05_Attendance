package May_25;

public class Car extends Vehicle {
    private String tireType;
    
    public Car(int speed, String color, double price, String tireType) {
        super(speed, color, price);
        this.tireType = tireType;
    }
    
    public void drive() {
        System.out.println("Car is driving.");
    }
    
    //@Override
    public void stop() {
        System.out.println("Car has stopped.");
    }
    
    public String getTireType() {
        return tireType;
    }
}