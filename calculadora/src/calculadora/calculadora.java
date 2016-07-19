package calculadora;

import java.util.Scanner;

public class calculadora 
{
public static void main (String []args)
{
	Scanner input = new Scanner (System.in);
	
	int entero1, entero2, resultado=0, seleccion;
System.out.print("seleccione que operacion desea realizar: ");	
System.out.print("\n1.sumar\n"
		+ "2.restar\n"
		+ "3.multiplicar\n"
		+ "4.dividir\n"
		+"5.salir\n");

seleccion=input.nextInt();

while (seleccion!=5)
{
	
System.out.print("ingrese el primer entero: ");
entero1=input.nextInt();
System.out.print("ingrese el segundo entero: ");
entero2=input.nextInt();

if (seleccion==1)
{
	resultado=entero1+entero2;
	}
if (seleccion==2)
{
	resultado=entero1-entero2;
}
if (seleccion==3)
{
	 resultado=entero1*entero2;
}
if (seleccion==4)
{
	resultado=entero1/entero2;
}
System.out.printf("el resultado de la operacion es %d\n",resultado);
System.out.print("seleccione que operacion desea realizar: ");	
System.out.print("\n1.sumar\n"
	+ "2.restar\n"
	+ "3.multiplicar\n"
	+ "4.dividir\n"
	+"5.salir\n");
seleccion=input.nextInt();}
}
}

