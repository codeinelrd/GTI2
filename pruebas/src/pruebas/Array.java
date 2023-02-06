package pruebas;
import java.util.Scanner;
import java.util.ArrayList;
public class Array {
	public static void main(String[] Args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> arrayy = new ArrayList();
ArrayList<Integer> array = new ArrayList();
array.add(1);
array.add(2);
array.add(3);
array.add(4);
array.add(5);
array.add(6);
array.add(7);
array.add(8);
array.add(9);
array.add(10);


		int num=1;
			while(num>0) {
				System.out.println("Introduce el numero");
					 num = sc.nextInt();
					if(num<0) {
					break;
					}
				arrayy.add(num);
			}
			
			int aux;
			int contador =0;
			
		for (int i =0; array.size()-1>i ;i++) {
			aux = array.get(i);
				for(int j=0 ;j<arrayy.size()-1; j++) {
					
					if(aux==arrayy.get(j)) {
						contador = aux + contador;
						//System.out.println("La j"+j);//
						System.out.println("aux"+aux);
					
					}
				}
		}
		
	}
}
