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
    }
}