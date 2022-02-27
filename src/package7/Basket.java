package package7;

public class Basket {
    //перегрузка - использование методов с одинаковым именес но разной сигнатурой
    public void pay(double money){ //оплата наличными
        System.out.println("Оплачено наличными " + money);
    }
    public void pay(String cardName){ //оплачено картой
        System.out.println("Оплачено картой с номером: " + cardName);
         }
    public void pay(String account, String bankName){ //оплата по реквизитам
        System.out.println("Переведено на счет " + account + " в банке " + bankName);
    }
}
