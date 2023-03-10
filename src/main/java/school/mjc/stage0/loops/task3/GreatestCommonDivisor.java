package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        while (first != 0 && second != 0) {
            if (first > second) {
                first %= second;
            } else {
                second %= first;
            }
        }
        int gcd = first + second;
        System.out.println(gcd);
    }
}
