package module13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Spisok {
    public void foo(){
        List spisok = new LinkedList(); //создание связанного списка
        spisok = new ArrayList(); //создание списка массива

        spisok.add("ss"); //добавление элемента в список
        spisok.add(0, "dd"); //добавление элемента в конкретное место в списке

        Object element = spisok.get(spisok.size() - 1); //получение последнего элемента в списке
        System.out.println(element);
        element = spisok.get(0); //получение элемента по указанному индексу
        System.out.println(element);
    }
}
