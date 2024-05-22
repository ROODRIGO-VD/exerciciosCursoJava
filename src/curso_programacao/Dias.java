package curso_programacao;
import java.util.Scanner;
public class Dias {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número [1 à 7]:");
		int x = sc.nextInt();
		
		String dia;
		
		
		switch(x) {
		case 1:{
			dia = "Domingo";
			break;
		}
		case 2:{
			dia = "Segunda";
			break;
		}
		case 3:{
			dia = "Terça";
			break;
		}
		case 4:{
			dia = "Quarta";
			break;
		}
		case 5:{
			dia = "Quintou bb";
			break;
		}
		case 6:{
			dia = "Sextou, rsrs";
			break;
		}
		case 7:{
			dia = "Sábado";
			break;
		}
		default:{
			dia = "Valor inválido";
			break;
		}
		
		}
		
		System.out.printf("Dia da semana: %s", dia);
		sc.close();
	}

}
