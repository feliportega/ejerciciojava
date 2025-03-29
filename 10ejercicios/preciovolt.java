public class preciovolt {
    public static void main(String[] args) {
        int edad = 70;
        
        if(edad <= 5){
            System.out.println("entrada gratuita");
        }else if (edad > 5 && edad <= 17){
            System.err.println("el boleto cuesta 5");
        }else if (edad > 17 && edad <= 60){
            System.out.println("el boleto cuesta 10");
        }else {
            System.out.println("el boleto cuesta 7 (descuento adultos mayores)");
        }
    }
    
}
