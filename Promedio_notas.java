/**
 * Created by javier on 22/04/16.
 */
import java.util.Scanner;
import java.lang.String;

public class Promedio_notas
{
    public static void main (String []args)
    {
        Scanner entrada = new Scanner (System.in);

        float primera_nota;
        float segunda_nota;
        float tercera_nota;
        float promedio;
        String estudiante;

        System.out.println("Ingrese el nombre del estudiante:");
        estudiante = entrada.nextLine();

        System.out.print("Ingrese la primera nota: ");
        primera_nota = entrada.nextFloat();

        System.out.print("Ingrese la segunda nota: ");
        segunda_nota = entrada.nextFloat();

        System.out.print("Ingrese la tercera nota: ");
        tercera_nota = entrada.nextFloat();

        promedio = (primera_nota+segunda_nota+tercera_nota)/3;

        System.out.printf("El promedio de calificaciones de %s es %.2f\n", estudiante, promedio);
    }

}
