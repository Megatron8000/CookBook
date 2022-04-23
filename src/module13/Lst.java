package module13;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lst {
    List list = new List() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() { //проверяет является ли коллекция пустой
            return false;
        }

        @Override
        public boolean contains(Object o) { //проверяет, содержит ли коллекция указанный элемент
            return false;
        }

        @Override
        public Iterator iterator() { //устанавливает итеретор коллекции
            return null;
        }

        @Override
        public Object[] toArray() { //преобразовать коллекцию в массив
            return new Object[0];
        }

        @Override
        public Object[] toArray(Object[] a) { //преобразовать коллекцию в массив указанного типа
            return new Object[0];
        }

        @Override
        public boolean add(Object o) { //добавить элемент в коллекцию (если он там отсутствовал)
            return false;
        }

        @Override
        public boolean remove(Object o) {  //удалить элемент из коллекции, если он в ней есть
            return false;
        }

        @Override
        public boolean containsAll(Collection c) { //вернет true если коллекция содержит все элементы коллекции с
            return false;
        }

        @Override
        public boolean addAll(Collection c) { //добавить все элементы коллекции с в текущую
            return false;
        }

        @Override
        public boolean addAll(int index, Collection c) { //добавит элеменет на позицию index, сдвигая остальные элементы коллекции, их индекс увеличится на 1
            return false;
        }

        @Override
        public boolean removeAll(Collection c) { //удалить из текущей коллекции все элементы коллекции с
            return false;
        }

        @Override
        public boolean retainAll(Collection c) { //удалить из  текущей коллекции все элементы кроме тех, что содержит коллекция с
            return false;
        }

        @Override
        public void clear() { //очистить коллекцию

        }

        @Override
        public Object get(int index) { //вернет элемент соответствующий указанному индексу
            return null;
        }

        @Override
        public Object set(int index, Object element) { //установит указанный элемент коллекции по указанному индексу
            return null;
        }

        @Override
        public void add(int index, Object element) { //добавит указанный элемент коллекции по указанному индексу

        }

        @Override
        public Object remove(int index) { //удалить элемент соответствующий индексу
            return null;
        }

        @Override
        public int indexOf(Object o) { //вернет индекс первого вхождения объекта в коллекцию
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) { //вернет индекс первого вхождения объекта в коллекцию
            return 0;
        }

        @Override
        public ListIterator listIterator() { //вернет итератор коллекции
            return null;
        }

        @Override
        public ListIterator listIterator(int index) {//вернет итератор конца коллекции от позиции
            return null;
        }

        @Override
        public List subList(int fromIndex, int toIndex) { //изменит индекс элемента
            return null;
        }
    };
}
