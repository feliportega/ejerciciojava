package switch_case;
public class switch1 {
    public static void main(String[] args){
        int num1 = 8;
        int num2 = 2;
        int resul = 0;
        String operacion = "*";

        switch (operacion) {
            case "+":
            resul = num1 + num2;
            System.out.println("resultado"+ resul);
            break;

            case "-":
            resul = num1 - num2;
            System.out.println("resultado"+ resul);
            break;

            case "*":
            resul = num1 * num2;
            System.out.println("resultado"+ resul);
            break;


            case "/":
            resul = num1 / num2;
            System.out.println("resultado"+ resul);
            break;
    }
    }
    
}
