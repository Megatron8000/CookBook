package module0;

import module1.IfStatement;
import module2.*;
import module3.*;
import module4.Vehicle;

import javax.swing.*;

public class Main {
   public static void main(String[] args) {
       /*JOptionPane.showMessageDialog(null, "Значок, что ты дурачок");*/

       Vehicle vehicle = new Vehicle();
       vehicle.name = "CAR";
       vehicle.setMaxspeed(220);
       System.out.println(vehicle.name);
       System.out.println(vehicle.getMaxspeed());

   } //method main
}  //class Main

