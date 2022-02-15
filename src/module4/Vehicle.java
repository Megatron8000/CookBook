package module4;

public class Vehicle {
    private int maxspeed;
    private String color;


    public Vehicle(int ms, String c){
        maxspeed = ms;
        color = c;
    }

    double distance(double time){
        double value = maxspeed * time;
        return value;
    }
}




