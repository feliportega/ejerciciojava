
public class cajero {
    public static void main(String[] args) {
        int money = 2000;
        if(money >5000){
            System.out.println("fondos insuficientes");
        }else if (money > 1000){
            System.out.println("limite de retiro por transaccion: 1000");
        }else {
            System.out.println("retiro exitoso");
        }
    }
    
}
