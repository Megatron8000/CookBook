package module3;

public class Ternar {
    public void foo(){
        for (int n = -5; n <= 5; n++){
            int a = n < 0 ? -n : n;
            System.out.println(a);
        }
    }//method
}//class
