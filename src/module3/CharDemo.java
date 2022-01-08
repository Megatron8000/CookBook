package module3;

public class CharDemo {
   public void foo(){
       char c;
       c = 'L';

       System.out.println("Значение с - " + c);

       c++; //т.к. char относится к числовым ТД эта операция допустима
       System.out.println("Значение с изменено на - " + c);
   }//method foo
} //class CharDemo
