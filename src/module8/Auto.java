package module8;

import module4.Vehicle;

public class Auto extends Vehicle {
    private boolean sunroof;

       public Auto(boolean sunroof){
            super(330, "green", 4); // вызов конструктора класса Vehicle
        }

    public boolean isSunroof() {
        return sunroof;
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }
}
