package module2;

public class BreakDemo {
    public void foo(){
        int m = 25;
        for (int i = 0; i <= m; i++){
            if (i * i >= m) break; // при выполнении цикла проверяется данное условие, если варыжение true цикл прерывается
            System.out.println("i равно " + i + ", i в квадрате равно " + i * i);
        }//for
    }//method foo
}//class BreakDemo
