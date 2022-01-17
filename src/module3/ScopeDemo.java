package module3;
// области видимости переменных
public class ScopeDemo {
    public void foo(){
        int i = 1; //эта переменная будет доступна в любом месте метода foo, после инициализации
        System.out.println("До вложенного блока I = " + i);
        {
            int j = 3; //эта переменная доступна только внутри фигурных скобок
        }
    } //method
} //class
