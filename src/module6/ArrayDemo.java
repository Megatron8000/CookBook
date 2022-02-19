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


        //вариант инициалиизации массива
        int array[][] = new int[4][3];
        int i;
        for (int c = 0; c < 4; c++){  //цикл для первой рамерности массмва
            i = 0;
                while (i < 3){
                    i++;

                } //цикл для второй
            System.out.println("array [" + c +"] [" + i + "]");
        }
    }
}
