package module9;

public class Triangle extends Shape {
    int cat1; // первый катет
    int cat2; // второй катет

    public Triangle (int cat1, int cat2){
        this.cat1 = cat1;
        this.cat2 = cat2;
    } //конструктор Triangle

    public String toString(){
        return "Треугольник";
    }

    public double area(){
        return ((cat1 * cat2) / 2.0);
    } // реализация метода area() для класса Triangle
}
