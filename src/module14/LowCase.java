package module14;

public class LowCase {
    public void foo(){
        char chh;
        for (int i = 0; i < 10; i++){
            chh = (char) ('A' + i);
            System.out.println(chh);

            //команда включающая шестой бит при помощи числа 32
            chh = (char) ((int) chh | 0x20);
            System.out.println(chh + " ");
    }
}}
