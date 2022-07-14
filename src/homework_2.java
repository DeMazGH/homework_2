public class homework_2 {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        byte a = 1;
        short b = 2000;
        int c = 30000000;
        long d = 4000L;

        float e = 0.5f;
        double f = 0.666;

        char g = 'g';
        boolean h = true;
    }

    public static void task2() {
        float weightOfTheFirstBoxer = 78.2f;
        float weightOfTheSecondBoxer = 82.7f;
        float totalWeightOfBoxers = weightOfTheFirstBoxer + weightOfTheSecondBoxer;
        System.out.println("Общий вес боксеров " + totalWeightOfBoxers + " кг.");
        float boxerWeightDifference = Math.abs(weightOfTheFirstBoxer - weightOfTheSecondBoxer);
        System.out.println("Разница в весе бойцов составляет " + boxerWeightDifference + " кг.\n");
    }

    public static void task3() {
            int bananaWeight = 80;
            int milkWeight = 105;
            int iceCreamWeight = 100;
            int eggWeight = 70;
            int breakfastWeight = 5 * bananaWeight + 2 * milkWeight + 2 * iceCreamWeight + 4 * eggWeight;
            double breakfastWeightInKg = breakfastWeight * 0.001;
            System.out.println("Общий вес завтрака " + breakfastWeightInKg + " кг.\n");
    }

    public static void task4() {
        double weightLoss = 7;
        double perDayWeightLoss = 0.25;
        int dayToLostWeightMax = (int) Math.ceil(weightLoss / perDayWeightLoss);
        perDayWeightLoss = 0.5;
        int dayToLostWeightMin = (int) Math.ceil(weightLoss / perDayWeightLoss);
        int averageWeightLost = (dayToLostWeightMin + dayToLostWeightMax) / 2;
        System.out.println("Минимальное количество дней для снижения веса - " + dayToLostWeightMin + ".");
        System.out.println("Максимальное количество дней для снижения веса - " + dayToLostWeightMax + ".");
        System.out.println("Среднее количество дней для снижения веса - " + averageWeightLost + ".\n");
    }

    public static void task5() {
        int salaryPerMonthMasha = 67760;
        int salaryPerMonthDenis = 83690;
        int salaryPerMonthKristina = 76230;

        int newSalaryPerMonthMasha = (int) (salaryPerMonthMasha + salaryPerMonthMasha / (100 * 1.0) * 10);
        int newSalaryPerMonthDenis = (int) (salaryPerMonthDenis + salaryPerMonthDenis / (100 * 1.0) * 10);
        int newSalaryPerMonthKristina = (int) (salaryPerMonthKristina + salaryPerMonthKristina / (100 * 1.0) * 10);
        System.out.println("Маша теперь получает " + newSalaryPerMonthMasha +
                " рублей в месяц. " + "Годовой доход вырос на "
                + ((newSalaryPerMonthMasha - salaryPerMonthMasha) * 12) + " рублей.");
        System.out.println("Денис теперь получает " + newSalaryPerMonthDenis +
                " рублей в месяц. " + "Годовой доход вырос на " +
                ((newSalaryPerMonthDenis - salaryPerMonthDenis) * 12) + " рублей.");
        System.out.println("Кристина теперь получает " + newSalaryPerMonthKristina +
                " рублей в месяц. " + "Годовой доход вырос на " +
                ((newSalaryPerMonthKristina - salaryPerMonthKristina) * 12) + " рублей.\n");
    }

    public static void task6() {
        //Задача 6
        //Объявите целочисленные переменные a = 12, b = 27, c = 44, d = 15, e = 9.
        //Вычислите выражение a * (b + (c - d * e)) и присвойте его результат переменной result.
        //Инвертируйте результат (значение в переменной result), преобразовав его в вариант с противоположным значением
        // (отрицательное -> положительное, положительное -> отрицательное).
        //Выведите (напечатайте) результат в консоль.

        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;

        int result = a * (b + (c - d  * e));
        result = result * -1;

        System.out.println(result + "\n");
    }

    public static void task7() {
        //Объявите целочисленные переменные a = 5 и b = 7.
        //С помощью математических манипуляций добейтесь того, чтобы a = 7 и b = 5.
        //Использовать дополнительные переменные или числа запрещено.

        int a = 5;
        int b = 7;

        a = a - b;
        b = a + b;
        a = b - a;

        System.out.println("a = " + a + "; b = " + b + ".\n");
    }

    public static void task8() {
        //Объявите переменную a и инициализируйте ее любым трехзначным числом.
        //Объявите переменную b и, путем математических операций над a получите и присвойте переменной b цифру,
        // которая находится в центре значения из переменной a.
        //Например, если a = 256, то необходимо с помощью математических действий достать цифру 5 из центра и
        // присвоить переменной b. Если a = 789, то b должна быть инициализирована числом 8, так как эта цифра
        // является вторым из трех (центральным) символом в значении a.
        //Следует учесть, что алгоритм должен быть универсальным и корректно срабатывать на любых трехзначных
        // числах из a без изменений.
        //Это значит, что рассчитать в голове сумму, которую необходимо вычесть или прибавить к a
        // для корректного значения в b нельзя, так как при каждом изменении значения в a её нужно пересчитывать.

        int a = 894;
        int b = ((a / 10) % 10);

        System.out.println(b);
    }
}
