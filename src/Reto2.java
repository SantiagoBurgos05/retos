/*Reto dosis bebé, datos medico, mamá y edad del bebé */
import java.util.Scanner;
public class Reto2 {
    public static void main(String[] args) {
        int pesobbe;
        int dosis;
        String medico; 
        String mama; 
        String bebe; 
        int fechaActual;
        int fechaNacimiento;
        int mesesBbe;
        try (Scanner lectura = new Scanner(System.in)){
            System.out.println("Ingrese el nombre del medico: ");
            medico = lectura.nextLine();
            System.out.println("Ingrese el nombre de la mamá: ");
            mama = lectura.nextLine();
            System.out.println("Ingrese el nombre del bebé: ");
            bebe = lectura.nextLine();
            System.out.println("Ingrese el mes actual en números: ");
            fechaActual = lectura.nextInt();
            System.out.println("Ingrese el mes de nacimiento del bebé en números: ");
            fechaNacimiento = lectura.nextInt();
            mesesBbe = fechaActual - fechaNacimiento; 
            System.out.println("Ingrese el peso del bebé: ");
            pesobbe = lectura.nextInt();
            dosis = ((mesesBbe*10)/(pesobbe+15) * 8);
            System.out.println("El nombre del medico es: "+ medico);
            System.out.println("El nombre de la mamá es: "+ mama);
            System.out.println("El nombre del bebé es: "+ bebe);
            System.out.println("El bebé tiene : "+ mesesBbe + " meses");
            System.out.println("La dosis adecuada para el bebé es: " + dosis);

        }
    }
}