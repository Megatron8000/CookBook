package module14;

public class QuickSort {
    static void sort(char items[]){
     quicksort(items, 0, items.length - 1);
    }

    private static void quicksort(char[] items, int left, int right) {
        int top, bottom;
        char comparand, value;

        top = left; // первая позиция в последовательности
        bottom = right; // последняя позиция в последовательности

        //выбор компарадна - символа из середины массива
        comparand = items[((left+right))/2];


    }
}
