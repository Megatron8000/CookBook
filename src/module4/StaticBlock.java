package module4;

public class StaticBlock {
    public static double rootOf9; //корень из 9
    public static double rootOf27; //корень из 27
    int num;

    static {
        System.out.println("Инициализация статических членов класса...");
        rootOf9 = Math.sqrt(9.0);
        rootOf27 = Math.sqrt(27.0);
    }

    StaticBlock(int num) {
        System.out.println("Инициализация переменных объекта класса StaticBlock...");
        this.num = num;
    }
}
