package module0;

import module10.DivisionByZeroException;
import module10.ExceptionDemo;
import module11.IExample;
import module11.Movable;
import module8.Auto;
import module9.*;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
       /*JOptionPane.showMessageDialog(null, "Значок, что ты дурачок");

        Vehicle cabriolet = new Vehicle(250, "black", 4);
        Vehicle bike = new Vehicle(320, "red", 2);
        Vehicle bus = new Vehicle(80, "blue", 6);
        Vehicle rig = new Vehicle(160, "green", 18);
        Vehicle priora = new Vehicle();

        System.out.println(priora.getColor());

        int countWheels = rig.setWheels(9);

       System.out.println(countWheels);  //проверка условия по ограничению допустимого значения


        double distance = cabriolet.distance(1.54);
        double distance1 = bike.distance(0.924);
        double distance2 = bus.distance(2.6);
        double distance3 = priora.distance(5.6);


       System.out.println(distance);
       System.out.println(distance1);
       System.out.println(distance2);
       System.out.println(distance3);


      ArrayDemo ad = new ArrayDemo();
       ad.foo();

       int a = 55;
       int b = 35;
       //передача параметров по значению
       ParamsValue pm = new ParamsValue();
       pm.call(b, a);

       ParamsRef q = new ParamsRef(2, 6);
       ParamsRef d = new ParamsRef(2, 6);

       System.out.println("q.x = " + q.x);  //создаюется объекты классов
       System.out.println("q.y = " + q.y);


       d.callRef(q);  //в параметры метода callRef()  объекта d в качестве параметра передан объект q
       System.out.println("q.y = " + q.y);
       System.out.println("q.x = " + q.x);

       Basket cash = new Basket();
       Basket card = new Basket();
       Basket check = new Basket();

       cash.pay(95.99);
       card.pay("1122 3344 5566 7788");
       check.pay("1212121212", "some bank");



       Factorial factorial = new Factorial();
       System.out.println("Вычисление факториала рекурсией:");
       for (int r = 1; r <= 6; r++){
           System.out.println(r + "! = " + Factorial.computeR(r));
       }

       StaticBlock sb = new StaticBlock(4);
       System.out.println(sb.num);
       System.out.println(StaticBlock.rootOf9);

     //демонстрация переопределения методов
      Vehicle v = new Vehicle(260, "yellow", 4);
      Auto au = new Auto(330, "orange", 4, true);
       System.out.println(v.toString());
       System.out.println(au.toString());

       PolyVehicle pv = new PolyVehicle();
       pv.foo();

      Point p = new Point();
      Triangle t = new Triangle(12, 36);
      Circle c = new Circle(54);
      Shape[] s = {p, t, c};

      System.out.println("Расчет площади фигур");
      for (int i = 0; i < s.length; i++) {
          System.out.println(s[i].toString() + " :" + s[i].area() );
      }

      SomeClass cs = new SomeClass();
      cs.method();*/

      ExceptionDemo ed = new ExceptionDemo();
      try {
          ed.divide(8, 0);
      } catch (DivisionByZeroException dz){
          System.out.println(dz.message());
      }
      try {
          System.out.println(ed.divide(8, 2));
      } catch (DivisionByZeroException e) {
          e.printStackTrace();
      }


      Auto a = new Auto(true);
      a.move(2,5);

      Movable m;
      //Указатель на интерефейс

      Auto auto = new Auto(true);

      m = auto; //переменная указатель указывает на объект типа Auto
      m.move(61,66);

      IExample ie = new IExample();
      ie.methodA();
      ie.methodB();

  } //method main
}  //class Main

