package module14;

public class QuickSortDemo {
    public void foo(){
        char s[] = {'g', 'a', 'b', 'f', 'z', 'x', 'e', 'd', 'k'};

        System.out.println("Исходный порядок массива:");
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }

        System.out.println();
        QuickSort.sort(s);


    }
}
