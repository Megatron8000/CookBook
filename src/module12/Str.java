package module12;

public class Str {
        public String foo(){
            StringBuffer sb = new StringBuffer(55); //класс позволяющий оптимизировать работу с памятью
            sb.append("Первая строка символов ");
            sb.append("Еще одна строка");
            String s3 = sb.toString();
            return s3;
        }
}
