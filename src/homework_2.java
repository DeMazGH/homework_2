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
        float boxerWeightDifference = Math.abs(weightOfTheFirstBoxer - weightOfTheSecondBoxer);
        System.out.println("Разница в весе бойцов составляет " + boxerWeightDifference + " кг.");
        //----------------------------


    }
}
