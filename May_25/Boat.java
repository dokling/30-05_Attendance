package May_25;

public class Boat extends Vehicle {
    private String mainSailColor;
    
    public Boat(int speed, String color, double price, String mainSailColor) {
        super(speed, color, price);
        this.mainSailColor = mainSailColor;
    }
    
    public void floatOnWater() {
        System.out.println("Boat is floating on water.");
    }
    
    
    public void stop() {
        System.out.println("Boat has stopped.");
    }
    
    public String getMainSailColor() {
        return mainSailColor;
    }
}