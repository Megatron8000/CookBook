package module2;

public class ContinueDemo {
    public void foo(){
        for (int n = 0; n < 10; n++){
            if ((n % 2) == 0) continue;
            System.out.println(n);
        }
    }
}
