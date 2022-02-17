package module4;

public class Vehicle {
    public int maxspeed;
    public String color;


    public Vehicle(int maxspeed, String color){
        maxspeed = this.maxspeed; //ключевое слово this используется когда  имя локальной переменной совпадает с иманем переменной члена класса
        color = this.color;
    }

    public double distance(double time){
        double value = this.maxspeed * time;
        return value;
    }
}




