public class JedliksToyCar {
    
    private int metersDriven = 0;
    private int batteryPercentage = 100;
    
    public static JedliksToyCar buy() {
        JedliksToyCar newCar = new JedliksToyCar();
        return newCar;
    }

    public String distanceDisplay() {
        return "Driven " + this.metersDriven + " meters";
    }

    public String batteryDisplay() {
        if (this.batteryPercentage > 0) {
            return "Battery at " + this.batteryPercentage + "%";
        } else {
            return "Battery empty";
        }
    }

    public void drive() {
        if(this.batteryPercentage > 0){
            this.batteryPercentage -= 1;
            this.metersDriven += 20;
        }
    }
}









