class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        boolean attack = !knightIsAwake;
        return attack;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean spy = knightIsAwake || archerIsAwake || prisonerIsAwake;
        return spy;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        boolean signal = !archerIsAwake && prisonerIsAwake;
        return signal;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent) {
        boolean result = false;
        if(petDogIsPresent && !archerIsAwake){
            result = true;
        }
        else if(prisonerIsAwake && !knightIsAwake && !archerIsAwake){
            result = true;
        }
        else if(1 == 1){
            result = false;
        }
        return result;
    }
}
