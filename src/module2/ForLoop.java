package module2;

public class ForLoop {
    public void foo() {
       for (int x = 100; x > 0; x -= 5){ // обьычный цикл for
            System.out.println("Текущее значение x " + x);
        }// first for loop
        for (int i = 10, j = 1; i > 0; i--, j++){  //цикл for с двумя переменными
            System.out.println("Текущее значение i " + i);
            System.out.println("Текущее значение j " + j);
        }// second for loop
        for(int f = 0; f < 10;){
            f++; //все атрибуты из круглых скобок могут быть вынесены внутрь блока
            System.out.println("Текущее значение f " + f);
        }
    }
}
