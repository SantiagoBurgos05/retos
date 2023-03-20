//Reto cara y sello modificado//
import java.util.Scanner;

public class Reto3{
    public static void main(String args[]){
        try(Scanner lectura = new Scanner(System.in)){
        int select = (int)(Math.random() * 2) + 1;
        int opcion,din=500;
        System.out.println("Su apuesta comienza con 500, si gana empieza a sumar de a 100 y si pierde disminuye de a 100");
        System.out.println("Si elije Cara digite 1 ");
        System.out.println("Si elije Sello digite 2 ");
        opcion= lectura.nextInt();

        System.out.println("La computadora ya elijio ");
        switch ( select ){
        case 1:
            System.out.println("Cara");
            switch ( opcion ){
                case 1: System.out.println("Usted pierde "+(din-100)); 
                break;
                case 2: System.out.println("Usted gana "+(din+100)); 
                break;
            }
            break;
        case 2:
            System.out.println("Sello");
            switch ( opcion ){
                case 1: System.out.println("Usted Pierde "+(din-100)); 
                break;
                case 2: System.out.println("Usted gana "+(din+100)); 
            }

    }
}
}
}