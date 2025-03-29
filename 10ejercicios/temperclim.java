public class temperclim {
    public static void main(String[] args) {
        
        int temperatura = 15;

        if(temperatura < 10){
            System.out.println("dia muy frio");
        }else if(temperatura >= 10 && temperatura <=20){
            System.err.println("dia fresco");
        }else if(temperatura >=21 && temperatura <= 30){
            System.out.println("dia calido");
        }else {
            System.out.println("dia caluroso");
        }
    }
    
}
