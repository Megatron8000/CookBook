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
        public Object put(Object key, Object value) {
            return null;
        }

        @Override
        public Object remove(Object key) {
            return null;
        }

        @Override
        public void putAll(Map m) {

        }

        @Override
        public void clear() {

        }

        @Override
        public Set keySet() {
            return null;
        }

        @Override
        public Collection values() {
            return null;
        }

        @Override
        public Set<Entry> entrySet() {
            return null;
        }
    };
}
