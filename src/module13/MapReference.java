package module13;

import java.util.HashMap;
import java.util.Map;
//добавление простого типа в коллекцию
public class MapReference {
    public void foo(){
        //создание словаря
        Map map = new HashMap();

        //создание класса оболочки для типа double
        Double refD = new Double(1.23);

        //добавление объекта в коллекцию
        map.put("key", refD);

        //получение класса-оболочки из коллекции
        refD = (Double)map.get("key");

        //получение значения double из объекта оболочки коллекции
        double dd = refD.doubleValue();

        System.out.println(dd);
    }
}
