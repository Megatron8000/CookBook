package module4;

public class Vehicle {
    private int maxspeed;
    public String color;


    public Vehicle(int maxspeed, String color){
        this.maxspeed = maxspeed; //ключевое слово this используется когда  имя локальной переменной совпадает с иманем переменной члена класса
        this.color = color;
    }

    public double distance(double time){
        double value = this.maxspeed * time;
        return value;
    }
}




