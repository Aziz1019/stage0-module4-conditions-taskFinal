package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        int days = 0;
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                days = 31;
                System.out.println(days);
            }
            case 4, 6, 9, 11 -> {
                days = 30;
                System.out.println(days);
            }
            case 2 -> {
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    days = 29;
                    System.out.println(days);
                } else {
                    days = 28;
                    System.out.println(days);
                }
            }
            default -> System.out.println("invalid date");
        }
    }
}
