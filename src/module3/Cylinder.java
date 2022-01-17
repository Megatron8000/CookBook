package module3;
//демонстрация динамической инициализации переменной. в качестве значения используется произведение других переменных
public class Cylinder {
    public void foo(){
        double radius = 5;
        double height = 21.66;

        double volume = Math.PI * radius * radius * height;
        System.out.println(volume);
    } //method
} //class
