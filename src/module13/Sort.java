package module13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort {
    public void foo() {
        //создание списка из строк
        String[] srtArr = new String[] {"x", "F", "f"};
        List lst = Arrays.asList(srtArr);

        //простая сортировка
        Collections.sort(lst);

    }
}
