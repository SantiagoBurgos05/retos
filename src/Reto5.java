//reto de caja registradora
import java.util.Scanner;
public class Reto5 {
    public static void main(String[] args) {
        try(Scanner lectura=new Scanner(System.in)){
            int inicio,contraseña,cantidad,i=0,precio=0,total;
            String empleado,usuario;
            System.out.println("Si desea registrar un nuevo usuario digite 1, si desea ingresar con un usuario ya registrado digite 2: ");
            inicio=lectura.nextInt();
            if (inicio==1) {
                System.out.println("Ingrese el nombre del nuevo usuario: ");
                empleado=lectura.next();
                System.out.println("Digite una contraseña numerica");
                contraseña=lectura.nextInt();
                System.out.println("El usuario "+empleado+" ha sido registrado");
            }else if(inicio==2){
                System.out.println("Ingrese el nombre del usuario: ");
                usuario=lectura.next();
                System.out.println("Ingrese su contraseña: ");
                contraseña=lectura.nextInt();
                System.out.println("Bienvenido "+usuario);
            }
            System.out.println("Cuantos productos desea comprar el cliente?: ");
            cantidad=lectura.nextInt();
            while (i<cantidad) {
                System.out.println("Que precio tiene el producto "+(i+1)+": ");
                precio=lectura.nextInt();
                i++;
            }
            total=precio*cantidad;
            System.out.println("El total de la compra es: "+total); 
            System.out.println("Gracias por usar el programa!");
        }
    }
}
