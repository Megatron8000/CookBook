package module10;

public class ExceptionDemo {
    private static double divide(double dividend, double divisor)
        throws DivisionByZeroException{
        if(divisor == 0)
            throw new DivisionByZeroException(); //если делитель равен 0, выполнится создание объекта класса DivisionByZeroException
        return dividend/divisor;
    }
}
