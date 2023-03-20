//Reto subsidio de aprendiz sena
import java.util.Scanner;
public class Reto8 {
    public static void main(String[] args) {
        try(Scanner lectura=new Scanner(System.in)){
            int aplica;
            String aprendiz,auxilio;
            System.out.println("Usted ya tiene algun auxilio de aprendiz? (digite 1 para si y 2 para no)");
            aplica=lectura.nextInt();
            if (aplica==1) {
                System.out.println("Usted no puede aplicar para otro auxilio");
            }else if(aplica==2){
                System.out.println("Ingrese el nombre del aprendiz que aplicará para el auxilio");
                aprendiz=lectura.next();
                System.out.println("Para que auxilio desea aplicar? (transporte,alimentacion,sostenimiento,digital)");
                auxilio=lectura.next();
                System.out.println("El aprendiz "+aprendiz+" quedó registrado para el auxilio de "+auxilio);
            }
            System.out.println("Feliz dia");
        }
    }
}
