package module6;

public class ArrayDemo {
    public void foo(){
        int count[] = new int[10]; //одноменрый массив
        int table[][] = new int[5][4]; //многомерный массив
        int guests[][] = new int[7][]; //произвольный массив
        guests[0] = new int[89];
        guests[1] = new int[32];
        guests[2] = new int[39];
        guests[3] = new int[87];
        guests[4] = new int[99];
        guests[5] = new int[14];
        guests[6] = new int[16];
        System.out.println(guests[5]);
    }
}
