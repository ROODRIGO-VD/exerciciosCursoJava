package curso_programacao;
import java.util.Scanner;
public class EntradaDeDadosStrFull {

	public static void main(String[] args) {
	//Variable
		Scanner sc = new Scanner(System.in);
		
		String x, y ,z;
		x = sc.nextLine();
		y = sc.nextLine();
		z = sc.nextLine();
		
	//Code
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	
	sc.close();
		
	}

}
