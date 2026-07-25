public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven(){
        int expectedMinutes = 40;
        return expectedMinutes;
    }
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int passed){
        int result = expectedMinutesInOven() - passed;
        return result;
    }
    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int layers){
        int result = 2 * layers;
        return result;
    }
    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int layers, int passed){
        int result = preparationTimeInMinutes(layers) + expectedMinutesInOven() - remainingMinutesInOven(passed);
        return result;
    }
}
