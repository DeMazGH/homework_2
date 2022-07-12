public class homework_2 {
    public static void main(String[] args) {
        // Task 1 --------------------
        byte a = 1;
        short b = 2000;
        int c = 30000000;
        long d = 4000L;
        float e = 0.5f;
        double f = 0.666;
        char g = 'g';
        boolean h = true;
        //----------------------------

        // Task 2 --------------------
        float weightOfTheFirstBoxer = 78.2f;
        float weightOfTheSecondBoxer = 82.7f;
        float totalWeightOfBoxers = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeightOfBoxers + " кг.");
        float boxerWeightDifference = weightOfTheSecondBoxer - weightOfTheFirstBoxer;
        System.out.println("Разница в весе бойцов составляет " + boxerWeightDifference + " кг.");
        //----------------------------

        // Task 3 --------------------
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakfastWeight = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        double breakfastWeightInKg = breakfastWeight * 0.001;
        System.out.println("Общий вес завтрака " + breakfastWeightInKg + " кг.");
        //----------------------------


    }
}
