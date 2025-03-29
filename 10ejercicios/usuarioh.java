public class usuarioh {
    public static void main(String[] args) { 

        String password = "c123";
        boolean activa = true;

        if(password == "c123" && activa == true){
            System.out.println("acceso permitodo");
        }else if(password != "c123" && activa == true){
            System.out.println("contrasña incorrecta");
        }else if(password == "c123" && activa == false){
            System.out.println("su cuenta no esta activa");
        }

    }
    
}
