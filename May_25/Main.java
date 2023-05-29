package May_25;

 public class Main {
    public static void main(String[] args) {
        U2SpyPlane u2SpyPlane = new U2SpyPlane(500, "Black", 10000000.0, 84.0);
        System.out.println("Speed: " + u2SpyPlane.getSpeed());
        System.out.println("Color: " + u2SpyPlane.getColor());
        System.out.println("Price: " + u2SpyPlane.getPrice());
        System.out.println("Wingspan: " + u2SpyPlane.getWingsSpan());
        
        u2SpyPlane.fly();
        u2SpyPlane.stop();
        
        System.out.println();
        
        FandangoYacht fandangoYacht = new FandangoYacht(20, "White", 500000.0, "Blue");
        System.out.println("Speed: " + fandangoYacht.getSpeed());
        System.out.println("Color: " + fandangoYacht.getColor());
        System.out.println("Price: " + fandangoYacht.getPrice());
        System.out.println("Main Sail Color: " + fandangoYacht.getMainSailColor());
        
        fandangoYacht.floatOnWater();
        fandangoYacht.stop();
        
        System.out.println();
        
        ToyotaVIOS vios = new ToyotaVIOS(140, "Silver", 35000.0, "Summer");
        System.out.println("Toyota Vios:");
        System.out.println("Speed: " + vios.getSpeed());
        System.out.println("Color: " + vios.getColor());
        System.out.println("Price: " + vios.getPrice());
        System.out.println("Tire Type: " + vios.getTireType());
        
        vios.drive();
        vios.stop();
   
    }
}