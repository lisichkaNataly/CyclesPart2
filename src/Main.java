public class Main {
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    task9();






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
    public static void task4() {

        // Домашнее задание 2
        System.out.println("Домашнее задание 2");
        // Задание 1
        System.out.println("Задание 1");

        int deposit = 15_000;
        int total = 0;

        for (int i = 0; total < 12_000_000; i++) {
            total = total + total/100*7;
            total = total + deposit;
            System.out.println("Месяц " + i + " , сумма накоплений равна " + total );
            }
        }
    public static void task5() {
        // Задание 2
        System.out.println("Задание 2");

        int deposit = 15_000;
        int total = 0;
        for (int i = 0; total < 12_000_000; i = i + 6) {
            total = total + total/100*7;
            total = total + deposit;
            if (i %6 == 0);
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total);
        }
    }
    public static void task6() {
        // Задание 3
        System.out.println("Задание 3");

        int deposit = 15_000;
        int total = 0;

        for (int i = 0; i <= 108; i = i + 6) {
            total = total + total/100*7;
            total = total + deposit;
            if (i % 6 == 0);
            System.out.println("Месяц " + i + " ,сумма накоплений равна " + total);
        }
    }
    public static void task7() {
        // Задание 4
        System.out.println("Задание 4");

        for (int day = 1; day <= 31; day = day +7) {
            if (day % 7 == 0);
            System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет.");
        }
    }
    public static void task8() {
        //Домашнее задание 3
        System.out.println("Домашнее задание 3");
        // Задание 1
        System.out.println("Задание 1");

        int year = 2022;
        int yearsBefore = year - 200;

        for (year=0; yearsBefore <= 2122; yearsBefore = yearsBefore + 79) {
            System.out.println(yearsBefore);
        }
        }
    public static void task9() {
        // Задание 2
        System.out.println("Задание 2");

        int number = 2;
         for (int i = 1; i <= 10; i++) {
             System.out.println(number + " * " + i + " = " + number*i);
         }
    }

    }







