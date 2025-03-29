public class descuentocomp {
    public static void main(String[] args) {
        int monto = 400;
        

        if(monto >= 1000){
            System.out.println("recibes un 20% de descuento");
        }else if( monto <= 999 && monto >= 500){
            System.out.println("tienes un descuento del 10%");
        }else {
            System.out.println("no recibe descuento");
        }
    }
    
}
