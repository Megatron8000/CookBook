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
       vehicle.setMaxspeed(220);
       vehicle.setSpeedLimit(60);
       double averageSpeed = vehicle.getMaxspeed() * 0.5;
       System.out.println();

   } //method main
}  //class Main

