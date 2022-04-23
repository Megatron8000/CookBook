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
        public Iterator iterator() { //создает итератор коллекции
            return null;
        }

        @Override
        public Object[] toArray() { //преобразует все элементы коллекции в массив
            return new Object[0];
        }

        @Override
        public Object[] toArray(Object[] a) { //преобразует все элементы коллекции в массив указанного типа
            return new Object[0];
        }

        @Override
        public boolean add(Object o) {//добавляет новый элемент в коллекцию (если он там отсутствовал)
            return false;
        }

        @Override
        public boolean remove(Object o) { //удаляет элемент из коллекции
            return false;
        }

        @Override
        public boolean containsAll(Collection c) { //возвращает true если коллекция включает в себя все элементы коллекции c
            return false;
        }

        @Override
        public boolean addAll(Collection c) { //добавит в коллекцию все элементы коллекции с
            return false;
        }

        @Override
        public boolean removeAll(Collection c) { //удалит из коллекции все элементы коллекции с
            return false;
        }

        @Override
        public boolean retainAll(Collection c) {  //удалит из коллекции все элементы кроме тех, что содержатся в коллекции с
            return false;
        }

        @Override
        public void clear() { //очистит коллекцию

        }
    };
}
