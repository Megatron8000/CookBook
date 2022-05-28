package module14;

public class Factorial {

    //метод вычисляющий факториал при помощи цикла
    long computeI(int n){
        long result = 1;

        for (int i = 1; i <= n; i++)
            result *= i;
        return result;
    }

    //метод вычисления факториала при помощи рекурсии
    long computeJ(int n){
        if (n == 1) return n;
        return computeJ(n - 1) * n;
    }

}
