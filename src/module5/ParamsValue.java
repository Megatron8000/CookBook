package module5;

public class ParamsValue {
    public void call(int x, int y){ //передача параметров по значению
        x = x + 55;
        y = y + 1;

        System.out.println(x);
        System.out.println(y);
    }
}
