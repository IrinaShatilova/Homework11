public class Main {
    public static void main(String[] args) {
        System.out.println("Homework 11");
        System.out.println(" ");
        System.out.println("Задание 1"); // вычислить является год високосным или нет
        printLeapYearOrNot(2023);
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
}
