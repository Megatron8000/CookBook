package module4;

public class ReturnDemo {
    public void foo(){
        for (int i = 0; i < 5; i++){
            if (i == 3) return;
            System.out.println(i);
        }
    }
}
