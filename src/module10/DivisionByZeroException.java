package module10;

public class DivisionByZeroException extends Exception {  //наследуется от класса Exception
    public String message(){
        return "Деление на нуль запрещено";
    }
}
