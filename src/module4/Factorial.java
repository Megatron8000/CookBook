package module4;

public class Factorial {

    //вычисление факториала рекурсивным способом
        static long computeR(int o){
            if (o == 1) return  o;
            return computeR(o - 1) * o;
           }
       }



