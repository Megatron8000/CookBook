package module3;

public class ByteOperation {
    public void foo(){
        int x = 0;
        int y = 1;

        int a = x & y;
        System.out.println("Результат операции 0 & (AND) 1 будет " + a);

        int b = x | y;
        System.out.println("Результат операции 0 | (OR) 1 будет " + b);

        int c = x ^ y;
        System.out.println("Результат операции 0 ^ (XOR) 1 будет " + c);

        int d = ~y;
        System.out.println("Результат операции ~(NOT) y будет " + c);
    }
}
