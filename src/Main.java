public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();


    }
    public static void task1() {
        //Домашнее задание 1
        System.out.println("Домашнее задание 1");

        //Задание 1
        System.out.println("Задание 1");

        int salary = 29000;
        int total = 0;
        int i = 0;
        for (; total <= 2_459_000; i++) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total);
        }

    }

    public static void task2() {

        //Задание 2
        System.out.println("Задание 2");

        int i = 1;
        while (i<=10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
    }}

    public static void task3() {
        System.out.println();

        // Залание 3
        System.out.println("Задание 3");

        int population = 12_000_000;
        double birth = (double) 17/1000;
        double death = (double) 8/1000;
        for (int i = 1; i < 11; i++) {
            population = population + (int) (population * birth) - (int) (population * death);
            System.out.println("Год -  " + i + " численность населения составляет: " + population);
        }

    }



}