//cara y sello con while
import java.util.Scanner;
public class Reto6 {
    public static void main(String args[]){
        try(Scanner lectura = new Scanner(System.in)){
            int puntos=300,apuesta,i=3,opcion,j=1;
            int random = (int)(Math.random() * 2) + 1;
            System.out.println("Bienvenido al juego de cara o sello");
            System.out.println("Usted inicia con "+puntos+" puntos y tiene "+i+" vidas");
            while (j==1) {
                while (i>0) {
                System.out.println("En base a sus puntos, cuantos desea apostar?: ");
                apuesta=lectura.nextInt();
                if (apuesta>puntos) {
                    System.out.println("Usted no puede realizar esta apuesta");
                }else{
                puntos-=apuesta; 
                System.out.println("Si elije Cara digite 1 ");
                System.out.println("Si elije Sello digite 2 ");
                opcion= lectura.nextInt();    
                System.out.println("La computadora ya elijio ");
            switch ( random ){
            case 1:
                System.out.println("Cara");
                switch ( opcion ){
                    case 1: 
                    i--;
                    puntos+=apuesta-100;
                    System.out.println("Usted pierde, le quedan "+i+" vidas y "+puntos+" puntos"); 
                    break;
                    case 2: 
                    puntos+=apuesta+100;
                    System.out.println("Usted gana, sus puntos son "+puntos); 
                    break;
                }
                break;
            case 2:
                System.out.println("Sello");
                switch ( opcion ){
                    case 1:                     
                    i--;
                    puntos+=puntos-100;
                    System.out.println("Usted pierde, le quedan "+i+" vidas y "+puntos+" puntos");
                    break;
                    case 2: 
                    puntos+=apuesta+100;
                    System.out.println("Usted gana, sus puntos son "+puntos);
                }
            }
                }
            }   
            System.out.println("Digite 1 si desea volver a jugar y 2 para terminar el juego: ");
            j=lectura.nextInt();
            i++; 
            }
        }
    }
}
