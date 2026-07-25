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
        boolean result = (petDogIsPresent && !archerIsAwake) || (prisonerIsAwake && !knightIsAwake && !archerIsAwake);
        return result;
    }
}
