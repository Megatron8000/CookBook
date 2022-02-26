package module5;

public class ParamsRef {
    public int x;
    public int y;

    public ParamsRef(int x, int y){
        this.x = x;
        this.y = y;
    } //конструктор

    //передача объекта по ссылке
    public void callRef(ParamsRef cr){
        cr.x = cr.x + this.x; //чтение переменной x
        cr.y = cr.y + this.y; //чтение переменной y
    } //method callRef (ParamsRef)
}
