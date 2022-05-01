package module13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public void foo() {
        //создание списка из строк
        String[] srtArr = new String[] {"x", "F", "a"};
        List lst = Arrays.asList(srtArr);

        //простая сортировка
        Collections.sort(lst);
        System.out.println(lst);

        //сортрировка в обратном порядке
        Collections.sort(lst, Collections.reverseOrder());
        System.out.println(lst);


    }
}
