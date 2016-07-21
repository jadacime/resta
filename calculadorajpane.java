package calculadorajpane;
import javax.swing.*;
public class calculadorajpane
{
public static void main(String []args)
{
	int a, b, c, resultado=0;
	 a=Integer.parseInt(JOptionPane.showInputDialog(null,"seleccione la operacion a realizar"
			+ "\n1.suma\n"
			+ "2.resta\n"
			+ "3.multiplicacion\n"
			+ "4.division\n "
			+ "5.salir\n"));
	 
	 while (a!=5)
	 {
	
	  b=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el primer numero "));
	  c=Integer.parseInt(JOptionPane.showInputDialog(null,"Inserte el segundo numero "));
	 if (a==1)
	{
	 resultado= b+c;
	}
	if (a==2)
	{
		resultado =b-c;
		}
	if (a==3)
	{
		resultado = b*c;
		}
 if (a==4)
 {
	 resultado=b/c;
 }
JOptionPane.showMessageDialog(null,"El resultado de la operacion de " + b + " entre " + c + " es " + resultado);

	 a=Integer.parseInt(JOptionPane.showInputDialog(null,"seleccione la operacion a realizar"
				+ "\n1.suma\n"
				+ "2.resta\n"
				+ "3.multiplicacion\n"
				+ "4.division\n "
				+ "5.salir\n"));
}}
}
