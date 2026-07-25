
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] birdsLastWeek = new int[] { 0, 2, 5, 3, 7, 8, 4};
        return birdsLastWeek;
    }

    public int getToday() {
        int result = 0;
        for (int bird : birdsPerDay) {
            result = bird;
        }
        return result;
    }

    public void incrementTodaysCount() {
        birdsPerDay[6]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean dayWithoutBirds = false;
        for (int bird: birdsPerDay){
            if (bird == 0){
                dayWithoutBirds = true;
                break;
            }
            else {
                dayWithoutBirds = false;
            }
        }
        return dayWithoutBirds;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int result = 0;
        int x = 0;
        for (int bird: birdsPerDay){
            if(x < numberOfDays){
                result += bird;
                  x++;
                }
            }
        return result;
    }
        
        
    public int getBusyDays() {
        int result = 0;
        for (int bird: birdsPerDay){
            if (bird >= 5){
                result++;
            }
        }
        return result;
    }
}
