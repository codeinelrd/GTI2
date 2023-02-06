package pruebas;
import java.util.Scanner;
public class string{
	public static void main (String[] Args){
	 Scanner sc = new Scanner (System.in);
	 System.out.println("introduce un string");
	 
		String car = sc.nextLine();
		
			String coreccion = car.replaceAll(" ","");

		 System.out.println("Hay :"+coreccion.length()+" caracteres");
	
}
}