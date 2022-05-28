package module14;

public class FactorialDemo {

    public void foo(){
        Factorial f = new Factorial();

        System.out.println("Факториал рассчитанный в цикле:");
        for (int i = 6; i > 0; i--){
            System.out.println(i + "! " + f.compoteI(i));
        }

    }
}
