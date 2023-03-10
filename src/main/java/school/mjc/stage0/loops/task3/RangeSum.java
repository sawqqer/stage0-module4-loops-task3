package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBorder, int secondBorder) {
        int sum = 0;
        for (int i = firstBorder; i <= secondBorder; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
