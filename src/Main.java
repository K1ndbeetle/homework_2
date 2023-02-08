public class Main {
    public static void main(String[] args) {

        //task №1
        System.out.println("Задача №1");
        int oranges = 1234;
        byte lemons = 123;
        short apples = 12345;
        long pears = 12345678910L;
        float pineapples = 1.2f;
        double kiwi = 1.234;
        System.out.println("Зачение переменной oranges с типом int равно " + oranges);
        System.out.println("Зачение переменной lemons с типом byte равно " +lemons);
        System.out.println("Зачение переменной apples с типом short равно " + apples);
        System.out.println("Зачение переменной pears с типом long равно " + pears);
        System.out.println("Зачение переменной pineapples с типом float равно " + pineapples);
        System.out.println("Зачение переменной kiwi с типом double равно " + kiwi );

        //task №2
        float float1 = 27.12F;
        long long1 = 987678965549L;
        double double1 = 2.786;
        boolean boolean1 = false;
        short short2 = 569;
        short short3 = -159;
        int int1 = 27897;
        byte byte2 = 67;

        //task №3
        System.out.println("Задача №3");
        int ludmilaPavlovna = 23;
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int sheets = 480;
        int sheetsPerStudent = sheets / (ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги" );

        //task №4
        System.out.println("Задача №4");
        int bottles = 16;
        int minutes = 2;
        int bottlesPerMinute = bottles / minutes;
        int twentyMinutes = 20;
        System.out.println("За " + twentyMinutes + " минут машина произвела бутылок " + twentyMinutes * bottlesPerMinute + " штук");
        int day = 24 * 60;
        System.out.println("За " + day + " минут машина произвела бутылок " + day * bottlesPerMinute + " штук");
        int threeDays = day * 3;
        System.out.println("За " + threeDays + " минут машина произвела бутылок " + threeDays * bottlesPerMinute + " штук");
        int oneMonth = day * 30;
        System.out.println("За " + oneMonth + " минут машина произвела бутылок " + oneMonth * bottlesPerMinute + " штук");

        //task №5
        System.out.println("Задача №5");
        int totalPaint = 120;
        int whitePaint = 2;
        int brownPaint = 4;
        int totalClassroomInSchool = totalPaint / (whitePaint + brownPaint);
        int totalWhitePaint = totalClassroomInSchool * whitePaint;
        int totalBrownPaint = totalClassroomInSchool * brownPaint;
        System.out.println("В школе, где " + totalClassroomInSchool + " классов, нужно " + totalWhitePaint + " банок белой краски и " + totalBrownPaint + " банок коричневой краски");

        //task №6
        System.out.println("Задача №6");
        int oneBanana = 80; //гр
        float oneHundredMlMilk = 105; //гр
        int oneIceCream = 100; //гр
        int oneEgg = 70; //гр
        int fiveBananas = oneBanana * 5;
        float twoHundredMlMilk = oneHundredMlMilk / 100 * 200;
        int twoIceCream = oneIceCream * 2;
        int fourEggs = oneEgg * 4;
        int oneKg = 1000; //1 кг = 1000 гр
        float breakfastGr = fiveBananas + twoHundredMlMilk + twoIceCream + fourEggs;
        float breakfastKg = breakfastGr / oneKg;
        System.out.println("Общий вес завтрака " + breakfastKg + " кг");

        //task №7
        System.out.println("Задача №7");
        int loseWeight = 7;
        float kg = 1000;
        int weight250Gr = 250;
        int weight500Gr = 500;
        float weight250Kg = weight250Gr / kg;
        float weight500Kg = weight500Gr / kg;
        float minDays = loseWeight / weight250Kg;
        float maxDays = loseWeight / weight500Kg;
        float averageDays = (minDays + maxDays) / 2;
        System.out.println("Если худеть на 250 грамм каждый день, понадобится " + minDays + " дней!");
        System.out.println("Если худеть на 500 грамм каждый день, понадобится " + maxDays + " дней!");;
        System.out.println("Среднее количество дней для похудения " + averageDays);

        //task №8
        System.out.println("Задача №8");
        float masha = 67760;
        float denis = 83690;
        float kristina = 76230;
        float masha10 = masha / 100 * 10;
        float denis10 = denis / 100 * 10;
        float kristina10 = kristina / 100 * 10;
        float yearMasha = masha10 * 12;
        float yearDenis = denis10 * 12;
        float yearKristina = kristina10 * 12;
        System.out.println("Маша теперь получает " + (masha + masha10) + " рублей. Годовой доход вырос на " + yearMasha + " рублей.");
        System.out.println("Денис теперь получает " + (denis + denis10) + " рублей. Годовой доход вырос на "  + yearDenis + " рублей.");
        System.out.println("Кристина теперь получает " + (kristina + kristina10) + " рублей. Годовой доход вырос на " + yearKristina + " рублей.");
    }
}