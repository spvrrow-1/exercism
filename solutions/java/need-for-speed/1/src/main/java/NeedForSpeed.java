class NeedForSpeed {

    private int carSpeed;
    private int batteryPercentage;
    private int distanceDriven;
    public int batteryDrain;
    
    NeedForSpeed(int speed, int batteryDrain) {
        this.carSpeed = speed;
        this.batteryPercentage = 100;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return this.batteryPercentage < this.batteryDrain;
    }

    public int distanceDriven() {
        return this.distanceDriven;
    }

    public void drive() {
        if(!batteryDrained()) {
        this.distanceDriven += this.carSpeed;
        this.batteryPercentage -= this.batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitroCar = new NeedForSpeed(50, 4);
        return nitroCar;
    }

    public int getBattery() {
        return this.batteryPercentage;
    }
    
    public int getSpeed() {
        return this.carSpeed;
    }

    public int getDrain() {
        return this.batteryDrain;
    }
}

class RaceTrack {

    private int distance;
    
    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        float fDistance = this.distance;
        float fSpeed = car.getSpeed();
        float fBattery = car.getBattery();
        float fDrain = car.getDrain();
        return fDistance / fSpeed <= fBattery / fDrain;
    }
}
