package module8;

import module11.Movable;
import module4.Vehicle;

public class Auto extends Vehicle implements Movable {
    private boolean sunroof;

       public Auto(boolean sunroof){
            super(330, "green", 4); // вызов конструктора класса Vehicle
        }

      public Auto (int maxspeed, String color, int wheels, boolean sunroof){  //конструктор Auto с параметрами
           super(maxspeed, color, wheels);
           this.sunroof = sunroof;
       }


        public String toString() {
            return "Auto (maxspeed = " + super.getMaxspeed() + "; " +
                    "color = " + super.getColor() + "; " +
                    "wheels = " + super.getWheels() + "; " +
                    "sunroof = " + sunroof + ") ";
    }

    public void setSunroof(boolean sunroof) {
        this.sunroof = sunroof;
    }

    @Override
    public void move(int left, int right) {
        System.out.println("Wroom wroom");
    }
}

