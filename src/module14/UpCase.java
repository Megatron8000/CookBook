package module14;

public class UpCase {
    public void foo(){
        //перевод строчных букв к верхнему регистру
        char chh;

        for (int i = 0; i < 10; i++){
            chh = (char) ('a' + i);
            System.out.println(chh + ";");

            //команда отключающая шестой бит
            chh = (char) ((int) chh & 0xffdf);
            System.out.println(chh + " ");
        }
    }
}
