package module13;

import java.util.Collection;
import java.util.Iterator;

public class Collect {
    Collection c = new Collection() {
        @Override
        public int size() { //возвращает количество элементов коллекции
            return 0;
        }

        @Override
        public boolean isEmpty() { //проверка является ли текущая коллекция пустой
            return false;
        }

        @Override
        public boolean contains(Object o) { // проверка на содержание в коллекции указанного элемента
            return false;
        }

        @Override
        public Iterator iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public Object[] toArray(Object[] a) {
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection c) {
            return false;
        }

        @Override
        public boolean addAll(Collection c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };
}
