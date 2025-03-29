public class premiumusua {
    public static void main(String[] args) {

        String usuario = "basico";

        if (usuario == "premium"){
            System.out.println("tienes acceso a todas las funciones");
        }else if (usuario == "basico"){
            System.out.println("tienes acceso a funciones limitadas");
        }else if(usuario == "gratis"){
            System.out.println("tines acceso a contenido gratuito");
        }else {
            System.out.println("tipo de suscripcion no valido");
        }
    }
    
}
