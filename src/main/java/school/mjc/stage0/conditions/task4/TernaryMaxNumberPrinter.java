package school.mjc.stage0.conditions.task4;

public class TernaryMaxNumberPrinter {
    public void printGreatest(int first, int second, int third) {
        int max, temp;
        temp = first > second ? first : second;
        max = temp > third ? temp : third;

        System.out.println(max);
    }
}
