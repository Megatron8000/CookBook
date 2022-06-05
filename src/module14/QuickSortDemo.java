package module14;

public class QuickSortDemo {
    public void foo(){
        char s[] = {'h', 'e', 'd', 'a', 'c', 'i'};

        System.out.println("Исходный порядок массива:");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println();
        QuickSort.sort(s);

        System.out.println("Отстортированный массив:");
        for (int i = 0; i < s.length; i++){
            System.out.println(s[i]);
        }
    }
}
