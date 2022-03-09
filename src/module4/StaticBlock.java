package module4;

public class StaticBlock {
    public static double rootOf9; //корень из 9
    public int num;

   static {
        System.out.println("Инициализация статических членов класса...");
        rootOf9 = Math.sqrt(9.0);
    }

   public StaticBlock(int num) {
        System.out.println("Инициализация переменных объекта класса StaticBlock...");
        this.num = num;
    }
}
