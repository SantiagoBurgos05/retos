//Piedra, papel o tijera modificado//
import java.util.Scanner;

public class Reto4 {
    public static void main(String args[]){
		try(Scanner lectura = new Scanner(System.in)){
		int ppt = (int)(Math.random() * 3) + 1;
        int opcion,aps=0;
        System.out.println("Igrese la cantidad que desea apostar(si pierde se restaran 50 y si gana se sumaran 50): ");
        aps=lectura.nextInt();
		System.out.println("Si elige Piedra digite 1");
        System.out.println("Si elige Papel digite 2");
        System.out.println("Si elige Tijera digite 3");
		opcion = lectura.nextInt();
        
        System.out.println("La computadora ya elijio");
		switch ( ppt ){
			case 1:
				System.out.println("Piedra");
				switch ( opcion ){
					case 1: System.out.println("Empate"); 
					break;
					case 2: System.out.println("Ganaste "+(aps+50)); 
					break;
					case 3: System.out.println("Usted pierde "+(aps-50)); 
					break;
				}
                break;
			case 2:
				System.out.println("Papel");
				switch ( opcion ){
					case 1: System.out.println("Usted Pierde "+(aps-50)); 
					break;
					case 2: System.out.println("Empate"); 
					break;
					case 3: System.out.println("Ganaste "+(aps+50));
					 break;
				}
                break;
			case 3:
				System.out.println("Tijera");
				switch ( opcion ){
					case 1: System.out.println("Ganaste "+(aps+50)); 
					break;
					case 2: System.out.println("Usted Pierde "+(aps-50)); 
					break;
					case 3: System.out.println("Empate"); 
					break;
				}
                
            }
		}
	}
}


