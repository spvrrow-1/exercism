public class Lasagna {
    public int expectedMinutesInOven(){
        int expectedMinutes = 40;
        return expectedMinutes;
    }
    public int remainingMinutesInOven(int passed){
        int result = expectedMinutesInOven() - passed;
        return result;
    }
    public int preparationTimeInMinutes(int layers){
        int result = 2 * layers;
        return result;
    }
    public int totalTimeInMinutes(int layers, int passed){
        int result = preparationTimeInMinutes(layers) + expectedMinutesInOven() - remainingMinutesInOven(passed);
        return result;
    }
}
