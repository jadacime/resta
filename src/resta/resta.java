package resta;
import java.util.Scanner;

public class resta 
{
public static void main (String []args)

{
	Scanner input = new Scanner (System.in);
	int a,b;
	int resta;
	
	System.out.print("Ingrese el primer numero: ");
		a = input.nextInt();
	
		System.out.print("Ingrese el segundo numero: ");
		b = input.nextInt();
		
		resta = a-b;
		System.out.printf("el resultado de la resta es %d", resta);
}
}



