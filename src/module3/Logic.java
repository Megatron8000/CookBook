package module3;

public class Logic {
    public void foo(){
        boolean a = true;
        boolean b = false;

        boolean and = a & b;
        System.out.println("Результат операции false & (AND) true будет " + and);

        boolean or = a | b;
        System.out.println("Результат операции false | (OR) true будет " + or);

        boolean xor = a ^ b;
        System.out.println("Результат операции false ^ (XOR) true будет " + xor);
    }
}
