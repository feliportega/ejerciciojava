public class multiplod {
    public static void main(String[] args) {
        int num = 2;

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println(" el numero es multiplo de 3 y 5");
        }
            else if (num % 3 == 0){
                System.out.println("el numero es multiplo de 3");
            }else if (num % 5 == 0){
                System.out.println("el numero es multiplo de 5");
            }else {
                System.out.println(" el numero no es multiplo de 5 ni de 3");
            }
    }
    
}
