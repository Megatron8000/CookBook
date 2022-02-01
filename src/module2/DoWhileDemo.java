package module2;

public class DoWhileDemo {
    public void  foo() {
        char ch = 'Я';
        do {
            ch--;
            System.out.println(ch); //сначала выполняется тело цикла
        } while (ch >= 'А'); //после проверяется условие, таким образом цикл выполнится минимум 1 раз
    }
}
