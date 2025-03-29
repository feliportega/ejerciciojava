
public class par50 {
    public static void main(String[] args) {
        int num = 44;
        if(num % 2 == 0 && num > 50 ){
            System.out.println("el numero es par y es mayor que 50");
        }else if(num % 2 == 0 && num < 50 ){
            System.out.println("el numero es par, pero no es mayor que 50");
        }else {
            System.out.println("el numero no es par");
        }
    }
    
}
