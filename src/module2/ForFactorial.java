package module2;

public class ForFactorial {
    //вычисление факториала в цикле
    public static long computeI(int n) {
        long result = 1;
        for (int i = 0; i <= n; i++)
            result *= i;
        return result;
    }
}
