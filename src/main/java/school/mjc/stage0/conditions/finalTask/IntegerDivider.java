package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (dividend == 0 || divider == 0){
            System.out.println("division by zero");
        } else if (getRemainder(dividend, divider) == 0) {
            System.out.println("can be divided completely");
        } else if (getRemainder(dividend, divider) != 0) {
            System.out.println("cannot be divided completely");
        }
    }

    static int getRemainder(int num, int divisor)
    {
        return (num - divisor * (num / divisor));
    }

    public static void main(String[] args) {
        IntegerDivider divider = new IntegerDivider();
        divider.printCompletelyDivided(25, 0);
    }
}
