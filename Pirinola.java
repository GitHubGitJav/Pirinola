package pirinola;

import java.util.Random;
import java.util.Scanner;

public class Pirinola {
	public static void main(String args []){
		Random random  = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingresa cuantos tiros quieres realizar: ");
		int tiros = Integer.parseInt(scanner.nextLine());

		for(int i=1;i<=tiros;i++ ){
			int cara = random.nextInt(6)+1;
			if(cara == 1){
				System.out.println("Tiro " +  i + ") Pon 1");
			}else if(cara == 2){
				System.out.println("Tiro " +  i + ") Pon 2");
			}else if(cara == 3){
				System.out.println("Tiro " +  i + ") Pon 3");
			}else if(cara == 4){
				System.out.println("Tiro " +  i + ") Toma 1");
			}else if(cara == 5){
				System.out.println("Tiro " +  i + ") Pon 2");
			}else{
				System.out.println("Tiro " +  i + ") Todos ponen");
			}
		}
	}
}
