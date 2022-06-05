package module14;

public class QuickSort {
    static void sort(char items[]) {
        quicksort(items, 0, items.length - 1);
    }

    private static void quicksort(char[] items, int left, int right) {
        int top, bottom;
        char comparand, value;

        top = left; // первая позиция в последовательности
        bottom = right; // последняя позиция в последовательности

        //выбор компарадна - символа из середины массива
        comparand = items[((left + right)) / 2];

        //разделение последовательности на две части
        do {
            while ((items[top] < comparand) && (top < right)) top++;
            while ((comparand < items[bottom]) && (bottom > left)) bottom--;

            if (top <= bottom) {
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
                top++;
                bottom--;
            }
        } while (top <= bottom);

        if (((right+1) - left) == items.length){
            for (int i = 0; i < items.length; i++)
                System.out.print(items[i]);
                System.out.println();
        }
    }
}

