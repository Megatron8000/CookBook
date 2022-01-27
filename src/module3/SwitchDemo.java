package module3;

public class SwitchDemo {
    public void foo(){
        for (int x = 0; x <= 13; x++){
            switch (x){
                case 1: case 2: case 12:
                    System.out.println(x + " зима");
                    break;
                case 3: case 4: case 5:
                    System.out.println(x + " весна");
                    break;
                case 6: case 7: case 8:
                    System.out.println(x + " лето");
                    break;
                case 9: case 10: case 11:
                    System.out.println(x + " осень");
                    break;
                default:
                case 13:
                    System.out.println(x + " нет такого месяца");

            }
        }
    }
}
