package module3;

public class Ariphmetic {
    public void foo(){
        int iresult, iremain;
        double dresult, dremain;

        iresult = 10 / 3; //деление целых чисел
        iremain = 10 % 3; //остаток от деления
        System.out.println(iresult);
        System.out.println(iremain);

        //аналогично для вещественных чисед
        dresult = 10.0 / 3.0;
        dremain = 10.0 % 3.0;
        System.out.println(dresult);
        System.out.println(dremain);
    }
}
