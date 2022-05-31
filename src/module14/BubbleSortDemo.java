package module14;

public class BubbleSortDemo {


    public void foo() {
        int nums[] = {-99, 10, 64, 65432, -684, 88, -66, 47, -32};

        System.out.print("Исходный порядок массива:");
        for (int i = 0; i < nums.length; i++){
        System.out.print(nums[i] + " ");}

        System.out.println();

        BubbleSort.sort(nums);

        System.out.print("Новый порядок массива:");
        for (int i = 0; i < nums.length; i++){
        System.out.print(nums[i] + " ");}
    }
}
