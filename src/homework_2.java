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
        System.out.println("Разница в весе бойцов составляет " + boxerWeightDifference + " кг.\n");
        //----------------------------

        // Task 3 --------------------
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakfastWeight = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
        double breakfastWeightInKg = breakfastWeight * 0.001;
        System.out.println("Общий вес завтрака " + breakfastWeightInKg + " кг.\n");
        //----------------------------

        // Task 4 --------------------
        int weightLossInKg = 7;
        int weightLossInGram = weightLossInKg * 1000;
        int perDayWeightLoss = 250;
        int dayToLostWeightMin = weightLossInGram / perDayWeightLoss;
        perDayWeightLoss = 500;
        int dayToLostWeightMax = weightLossInGram / perDayWeightLoss;
        int averageWeightLost = (dayToLostWeightMin + dayToLostWeightMax) / 2;
        System.out.println("Минимальное количество дней для снижения веса - " + dayToLostWeightMin + ".");
        System.out.println("Максимальное количество дней для снижения веса - " + dayToLostWeightMax + ".");
        System.out.println("Среднее количество дней для снижения веса - " + averageWeightLost + ".\n");
        //----------------------------


    }
}
