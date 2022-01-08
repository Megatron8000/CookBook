package module1;

public class IfStatement {
    public void foo(){
        int a, b, c, d;
        a = 5;
        b = 7;

        if (a < b){
            System.out.println("True");
        } else System.out.println("False");

        c = a - b;
        if (c <= 0){
            System.out.println("С отрицательное или равно нулю");
        } else System.out.println("С положительное или равно нулю");

        d = b - a;
        if (d > 0){
            System.out.println("D больше нуля");
        } else System.out.println("D меньше нуля");
    } //method foo
} //class IfStatement
