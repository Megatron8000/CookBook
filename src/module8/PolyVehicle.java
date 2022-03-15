package module8;

import module4.Vehicle;

public class PolyVehicle {
    Auto auto = new Auto(true); // экземпляр подкласса
    Vehicle vehicle = new Vehicle(); // экземпляр класса

    public void foo(){
         Vehicle[] p = {auto, vehicle}; //помещаем объекты в массив, p[0] = auto, p[1] = vehicle;
        for (int i = 0; i < p.length; i++){
            System.out.println(p[i].toString());
        } //динамический выбор версии переопределенного метода toString
    }
}
