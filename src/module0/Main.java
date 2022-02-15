package module0;

import module1.IfStatement;
import module2.*;
import module3.*;
import module4.ReturnDemo;
import module4.Vehicle;
import module5.Number;
import module5.Ten;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
       /*JOptionPane.showMessageDialog(null, "Значок, что ты дурачок");*/

       ReturnDemo rd = new ReturnDemo();
       rd.foo();

       Vehicle cabriolet = new Vehicle();
       cabriolet.setMaxspeed(220);

       Vehicle bus = new Vehicle();
       bus.setMaxspeed(80);

       double time = 0.76;

       double routeCabrio =  cabriolet.distance(time);
       double routeBus = bus.distance(time);

       System.out.println(routeCabrio);
       System.out.println(routeBus);

       Ten sample1 = new Ten();
       Ten sample2 = new Ten();

       if (sample1.x == sample2.x)
           System.out.println(sample1.x + " = " + sample2.x);

       Number s1 = new Number(65);
       Number s2 = new Number(9);

       if (s1.x != s2.x)
           System.out.println(s1.x + " != " + s2.x);
       else
           System.out.println(s1.x + " == " + s2.x);




   } //method main
}  //class Main

