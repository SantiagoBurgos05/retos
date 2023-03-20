//piedra, papel o tijera con while
import java.util.Scanner;
public class Reto7 {
    public static void main(String args[]){
		try(Scanner lectura = new Scanner(System.in)){
		int random = (int)(Math.random() * 3) + 1;
        int opcion,aps,i=3,puntos=300,j=1;
        System.out.println("Bienvenido al juego de piedra, papel o tijera");
        System.out.println("Usted inicia con "+puntos+" puntos y tiene "+i+" vidas");
        while (j==1) {
		while (i>0) {
        System.out.println("En base a sus puntos, cuantos desea apostar?: ");
        aps=lectura.nextInt();
        if (aps>puntos) {
            System.out.println("Usted no puede realizar esta apuesta");
        }else{
        puntos-=aps;
		System.out.println("Si elige Piedra digite 1");
        System.out.println("Si elige Papel digite 2");
        System.out.println("Si elige Tijera digite 3");
		opcion = lectura.nextInt();
        System.out.println("La computadora ya elijio");
		switch ( random ){
			case 1:
				System.out.println("Piedra");
				switch ( opcion ){
					case 1: System.out.println("Empate"); 
					break;
					case 2:
                    puntos+=aps+100;
                    System.out.println("Ganaste tus puntos son "+puntos);
					break;
					case 3: 
                    i--;
                    puntos+=aps-100;
                    System.out.println("Usted pierde, le quedan "+i+" vidas y sus puntos son "+puntos);
					break;
				}
                break;
			case 2:
				System.out.println("Papel");
				switch ( opcion ){
					case 1:
                    i--;
                    puntos+=aps-100;
                    System.out.println("Usted pierde, le quedan "+i+" vidas y sus puntos son "+puntos); 
					break;
					case 2: System.out.println("Empate"); 
					break;
					case 3: 
                    puntos+=aps+100;
                    System.out.println("Ganaste tus puntos son "+puntos);
					 break;
				}
                break;
			case 3:
				System.out.println("Tijera");
				switch ( opcion ){
					case 1: 
                    puntos+=aps+100;
                    System.out.println("Ganaste tus puntos son "+puntos);
					break;
					case 2: 
                    i--;
                    puntos+=aps-100;
                    System.out.println("Usted pierde, le quedan "+i+" vidas y sus puntos son "+puntos); 
					break;
					case 3: System.out.println("Empate"); 
					break;
				}
			}
				}                
            }
			System.out.println("Digite 1 para volver a jugar y 2 para terminar el juego: ");
			j=lectura.nextInt();
			i++;
            }
		}
	}
}
