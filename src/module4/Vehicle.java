package module4;

public class Vehicle {
    public String name;
    public String color;
    private int seats;
    private int maxspeed;
    private int speedLimit;
    private int burnup;

       public void distance(double time){
            double value = maxspeed * time;
            System.out.println("за " + time + " часов, пройденное рассторяние составит " + value + " км");
        }



    public int getSeats() {return seats;}

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getSpeedLimit() {return speedLimit;}

    public void setSpeedLimit(int speedLimit) {this.speedLimit = speedLimit;}

    public int getBurnup() {return burnup;}

    public void setBurnup(int burnup) {this.burnup = burnup;}
}
