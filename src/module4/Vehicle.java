package module4;

public class Vehicle {
    private String color;
    private int maxspeed;
    private  int wheels;

//конструктор с параметрами, инициализирующий переменные объекта значениями из вызывающей программы
    public Vehicle(int maxspeed, String color, int wheels){
        this.maxspeed = maxspeed; //ключевое слово this используется когда  имя локальной переменной совпадает с иманем переменной члена класса
        this.color = color;
        this.wheels = wheels;
    }

//конструктор без переметров, инициализирующий переменные объекта с дефолтными значениями
    public Vehicle(){
     this(220,"Blue",4);
    }

    public double distance(double time){

        return ((double) time);
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

    public int setWheels(int wheels) {
        if ((wheels > 2 ) || (wheels < 18)) {
            System.out.println("Invalid wheels value");
        }
        this.wheels = wheels;
        return wheels;
    }
}




