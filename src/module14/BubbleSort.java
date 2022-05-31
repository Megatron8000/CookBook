package module14;

public class BubbleSort {
        static void sort(int nums[]){
            int t; //вспомогательная переменная
            for (int a = 1; a < nums.length; a++){
                //повтор каждого элемента массива
                for (int b = nums.length - 1; b >= a; b--){
                    //повтор для проверки порядка соседних элементов
                    if (nums[b - 1] > nums[b]){
                        //перестановка элементов
                        t = nums[b-1];
                        nums[b -1] = nums[b];
                        nums[b] = t;
                    }
                }
            }
        }
}
