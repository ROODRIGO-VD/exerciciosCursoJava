package curso_programacao;
import java.util.Scanner;
public class senha_fixa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int senha;
		
		System.out.print("Digite sua senha:");
		senha = sc.nextInt();
		
		
		while(senha != 2002) {
			System.out.println("Senha inválida, tente novamente!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso permitido!");
		
		
		sc.close();
	}

}
