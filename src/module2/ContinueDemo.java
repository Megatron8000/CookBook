package module2;

public class ContinueDemo {
    public void foo(){
        for (int n = 0; n < 10; n++){
            if ((n % 2) == 0) continue; //по этому условию итерации цикла, в которых остаток от деления n на 2 == 0 будет пропущены
            System.out.println(n);
        }
    }
}
