package module14;

public class EndlessWhile {
    public void foo(){
        boolean f = 2 < 5; //в ходе выполения программы значение f может измениться, поэтому цикл while  не будет бесконечным
        while (f){
            System.out.println("AXAXAXAXA");
    }
  }
}
