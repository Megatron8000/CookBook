package module0;

import module1.IfStatement;
import module2.*;
import module3.*;
import module4.Factorial;
import module4.ReturnDemo;
import module4.StaticBlock;
import module4.Vehicle;
import module5.Number;
import module5.ParamsRef;
import module5.ParamsValue;
import module5.Ten;
import module6.ArrayDemo;
import module8.Auto;
import module8.PolyVehicle;
import package7.Basket;

import javax.swing.*;
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
       pv.foo();*/


      Scanner sc = new Scanner(System.in);
      String t  = sc.nextLine();
      System.out.println("Температура воздуха сегодня: " + t + " градусов.");





   } //method main
}  //class Main

