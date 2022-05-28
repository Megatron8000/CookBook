package module14;

public class FactorialDemo {

    public void foo(){
        Factorial f = new Factorial();

        System.out.println("Факториал рассчитанный в цикле:");
        for (int i = 6; i > 0; i--){
            System.out.println(i + "! " + f.compoteI(i));
        }
        System.out.println("Факториал рассчитаный при помощий рекурсии:");
        for (int j = 1; j <= 6; j++){
            System.out.println(j + "! " + f.computeR(j));
        }
    }
}
