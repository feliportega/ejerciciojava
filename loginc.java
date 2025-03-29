public class loginc {
    public static void main(String[] args) {
        String usuario = "admin";
        int password = 123;
        if(usuario == "admin") {
            if(password == 123){
                System.out.println("acceso concedido");
            }
            if(password != 123) {
                System.out.println("password incorecto");
            }
        }
        if(usuario != "admin"){
            System.out.println("ussuario incorrecto");
        }
    }
    
}
