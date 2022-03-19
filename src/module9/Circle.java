package module9;

public class Circle extends Shape {
    int rad;

    Circle(int rad){
        this.rad = rad;
    } //Constructor of Circle

    public String toString() {
        return "Круг";
    }

    double area() {
        return ((rad * rad) * Math.PI);
    } // реализация area() для класса Circle
}
