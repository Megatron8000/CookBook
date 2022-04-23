package module13;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Mp {
    Map map = new Map() {
        @Override
        public int size() { //возвращает количество элементов коллекции
            return 0;
        }

        @Override
        public boolean isEmpty() { //проверка является ли коллекция пустой
            return false;
        }

        @Override
        public boolean containsKey(Object key) {  //проверка содержит ли коллекция указанный ключ
            return false;
        }

        @Override
        public boolean containsValue(Object value) { //проверка содержит ли коллекция указанное значение
            return false;
        }

        @Override
        public Object get(Object key) { //возвращает соответствующий key объект
            return null;
        }

        @Override
        public Object put(Object key, Object value) {  //добавляет новое значение и ключ, если такой ключ уже есть то заменяет значение
            return null;
        }

        @Override
        public Object remove(Object key) {  //удалит значение соответствующее ключу
            return null;
        }

        @Override
        public void putAll(Map m) { // добавит в коллекцию все ключи и значения из словаря m

        }

        @Override
        public void clear() {  //очистит коллекцию

        }

        @Override
        public Set keySet() { //преобразует ключи коллекции во множество
            return null;
        }

        @Override
        public Collection values() { //преобразует значения в коллекцию
            return null;
        }

        @Override
        public Set<Entry> entrySet() {  //преобразует коллекцию во множество
            return null;
        }
    };
}
