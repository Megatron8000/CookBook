package module14;

public class SecureDivision {
    public void foo(){
        for (int divisor = -15; divisor <= 15; divisor++){
            //использование тернарного оператора для защиты от деления на ноль
            int result = divisor != 0 ? 100 / divisor : 0;
            if (result != 0){
                System.out.println("100 / " + divisor + " = " + result);
            }
        }
    }
}
