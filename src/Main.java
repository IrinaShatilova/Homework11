import java.time.LocalDate;

public class Main {
    private final static int CURRENTYEAR = LocalDate.now().getYear();
    public static void main(String[] args) {
        System.out.println("Homework 11");
        System.out.println(" ");
        System.out.println("Задание 1");
        // вычислить является год високосным или нет
        printLeapYearOrNot(2023);
        System.out.println(" ");
        System.out.println("Задание 2");
        // программа должна выводить в консоль в зависимости от исходных данных,
        // какую версию приложения (обычную или lite) и для какой ОС
        //(Android или iOS) нужно установить пользователю.
        printVersionOs(2022, 0);
        System.out.println(" ");
        System.out.println("Задание 3");
        // программа должна выводить в консоль количество дней доставки
        // в зависимости от расстояния до адресата
        printCalculateTimeDelivery(10);
    }
    public static boolean isLeapYear (int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
    public static void printLeapYearOrNot(int year) {
        if (isLeapYear(year)) {
            System.out.println(year + " год является високосным");
            return;
        }
            System.out.println(year + " год не является високосным");
    }
    public static boolean isNowYear (int year) {
        return year == CURRENTYEAR;
    }
    public static String getVersionOs (int versionOs) {
        if (versionOs == 0) {
            return "IOS";
        } else if (versionOs == 1) {
            return "Android";
        }
        return "Данная версия операционной системы не распознана";

    }
    public static void printVersionOs (int year, int versionOs) {
        if (isNowYear(year)) {
            System.out.println("Установите полную версию для вашего " + getVersionOs(versionOs) + " по ссылке");
        } else         {
            System.out.println("Установите lite-версию для вашего " + getVersionOs(versionOs) + " по ссылке");
        }
    }
    public static void printCalculateTimeDelivery(int distance) {
        System.out.println("Время доставки банковской карты = "+ ((distance + 19)/40 +1));
    }
}
