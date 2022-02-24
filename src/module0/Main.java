package module0;

import module1.IfStatement;
import module2.*;
import module3.*;
import module4.ReturnDemo;
import module4.Vehicle;
import module5.Number;
import module5.ParamsValue;
import module5.Ten;
import module6.ArrayDemo;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
       /*JOptionPane.showMessageDialog(null, "Значок, что ты дурачок");*/

        Vehicle cabriolet = new Vehicle(250, "black", 4);
        Vehicle bike = new Vehicle(320, "red", 2);
        Vehicle bus = new Vehicle(80, "blue", 6);
        Vehicle rig = new Vehicle(160, "green", 18);

        int countWheels = rig.setWheels(24);

       System.out.println(countWheels);  //проверка условия по ограничению допустимого значения


        double distance = cabriolet.distance(1.54);
        double distance1 = bike.distance(0.924);
        double distance2 = bus.distance(2.6);

       System.out.println(distance);
       System.out.println(distance1);
       System.out.println(distance2);


      ArrayDemo ad = new ArrayDemo();
       ad.foo();

       int a = 55;
       int b = 35;
       //передача параметров по значению
       ParamsValue pm = new ParamsValue();
       pm.call(b, a);



   } //method main
}  //class Main

