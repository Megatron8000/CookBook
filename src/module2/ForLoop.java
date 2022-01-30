package module2;

public class ForLoop {
    public void foo() {
      /*  for (int x = 100; x > 0; x -= 5){
            System.out.println(x);
        }// first for loop*/
        for (int i = 10, j = 1; i > 0; i--, j++){
            System.out.println("Текущее значение i " + i);
            System.out.println("Текущее значение j " + j);
        }// second for loop
    }
}
