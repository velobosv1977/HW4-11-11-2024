//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1. v1.
        System.out.println("ДЗ№3-1. Условный оператор. Урок 2.");
        System.out.println("Задача 1. В1. Моб.приложение");
        //Задание переменной, где 0 - iOS, 1 - Android
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Ошибочный выбор. Введите 0 - iOS; 1 - Android");
        }
        //Task 1. v2. else-if
        System.out.println("Задача 1. В2. Моб.приложение");
        int clientOS1 = 0;
        if (clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Ошибочный выбор. Введите 0 - iOS; 1 - Android");
        }
        //Task 2. var1.
        System.out.println("Задача 2. Моб.приложение+год выпуска. 1-й вариант решения.");
        //Задание переменных по выбору ОС и году выпуска ОС
        int OS = 0;
        int clientDeviceYear = 2012;
        if (OS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите нормальную версию приложения для iOS по ссылке");
        } else if (OS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (OS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите нормальную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        //Task 2.var2.
        System.out.println("Задача 2. Моб.приложение+год выпуска. 2-й вариант решения.");
        //Задание переменных по выбору ОС и году выпуска ОС
        int os = 1;
        int clientDeviceYear1 = 2015;
        if (os == 0) {
            if (clientDeviceYear1 >= 2015) {
                System.out.println("Установите нормальную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
            }
        } else if (os == 1) {
            if (clientDeviceYear1 >= 2015) {
                System.out.println("Установите нормальную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию для Android по ссылке");
            }
        }
        //Task 3.    .
        System.out.println("Задача 3. Високосный год");
        //Задание переменных
        int year = 1812;
        if (year > 1584 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " не является високосным");
        }
        //Task 4.v1
        System.out.println("Задача 4.В1. Доставка банковской карты");
        //Задание переменных
        int deliveryDystance = 55;
        //Условия
        if (deliveryDystance <= 20) {
            System.out.println("Потребуется дней доставки:" + 1);
        } else if (deliveryDystance > 20 && deliveryDystance <= 60) {
            System.out.println("Потребуется дней доставки:" + 2);
        } else if (deliveryDystance > 60 && deliveryDystance <= 100) {
            System.out.println("Потребуется дней доставки:" + 3);
        } else {
            System.out.println("Доставки нет");
        }
        //Task 4.v2
        System.out.println("Задача 4.В2. Доставка банковской карты");
        int deliveryDistance1 = 60;
        int daysDelivery;

        if (deliveryDistance1 <= 20) {
            daysDelivery = 1;
        } else if (deliveryDistance1 > 20 && deliveryDistance1 <= 60) {
            daysDelivery = 2;
        } else if (deliveryDistance1 > 60 && deliveryDistance1 <= 100) {
            daysDelivery = 3;
            System.out.println("Потребуется " + daysDelivery + " дней");
        } else {
            System.out.println("Доставки нет");
        }
        //Task 5.
        System.out.println("Задача 5. Месяцы-сезоны");
        int monthNumber = 2;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Введите номер месяца от 1 до 12");
        }

    }
}