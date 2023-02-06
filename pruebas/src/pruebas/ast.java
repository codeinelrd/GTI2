package pruebas;
import java.util.Scanner;
public class ast {
public static void main (String[] Args) {
	Scanner sc = new Scanner (System.in);
System.out.println("Introduce el numero");
	 int num = sc.nextInt();
	 String aux = "" ;
	 
	 for(int i = 1;num>=i;i++) {
		 aux = "*"+aux;
	 }
	 
	 System.out.println(aux);
}
}
