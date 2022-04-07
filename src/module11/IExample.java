package module11;

public class IExample implements B {
    @Override
    public void methodB() {
        System.out.println("Метод А");
    }

    @Override
    public void methodA() {
        System.out.println("Метод Б");
    }
}
