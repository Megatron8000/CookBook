package module12;

public class IntString {
    public void foo(){
        //преобразование целого числа в строку
            int valueInt = 1001;
            String valueString = Integer.toString(valueInt);

        //преобразование дробного числа в строку
            double valueDouble = 231.32323221;
            String valueString1 = Double.toString(valueDouble);

        System.out.println(valueString);
        System.out.println(valueString1);


    }
}
