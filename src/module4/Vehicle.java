package module4;

public class Vehicle {
    private int maxspeed;
    private String color;
    private  int wheels;


    public Vehicle(int maxspeed, String color){
        this.maxspeed = maxspeed; //ключевое слово this используется когда  имя локальной переменной совпадает с иманем переменной члена класса
        this.color = color;
        this.wheels = wheels;
    }

    public double distance(double time){
        double value = this.maxspeed * time;
        return value;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        if ((wheels < 2 ) || (wheels > 18)) {
            System.out.println("Invalid wheels value");
        }
        this.wheels = wheels;
    }
}




