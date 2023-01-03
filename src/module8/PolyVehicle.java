package module8;

import module4.Vehicle;

public class PolyVehicle {
   Auto auto = new Auto(150, "rose", 6, false); // экземпляр подкласса
    Vehicle vehicle = new Vehicle(); // экземпляр класса


    public void foo(){
         Vehicle[] p = {vehicle, auto}; //помещаем объекты в массив, p[0] = auto, p[1] = vehicle;
        System.out.println(p[0].toString());  // вызовет toString из vehicle
        System.out.println(p[1].toString());  // вызовет toString из auto
        } // выбор версии переопределенного метода toString
    }

