package module0;

import module1.IfStatement;
import module2.*;
import module3.*;
import module4.Vehicle;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
       /*JOptionPane.showMessageDialog(null, "Значок, что ты дурачок");*/

       Vehicle cabriolet = new Vehicle();
       cabriolet.setMaxspeed(220);

       Vehicle bus = new Vehicle();
       bus.setMaxspeed(80);

       double time = 0.76;

       cabriolet.distance(time);

   } //method main
}  //class Main

