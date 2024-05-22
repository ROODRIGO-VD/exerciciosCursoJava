package curso_programacao;
import java.util.Scanner;
import java.util.Locale;
public class atletas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int fem = 0;
		double fem_maxAlt = 0.0;
		int hom = 0;
		double soma_peso = 0.0;
		String alto = "";
		double altura_cont = 0.0;
		
		System.out.print("Qual a quantidade de atletas: ");
		int qtd_atle = sc.nextInt();
		
		for(int i = 1; i <= qtd_atle; i++) {
			///QNTD DE ATLETAS E NOME
			System.out.printf("Digite os dados do atleta número %d: \n", i);
			System.out.print("Nome:");
			sc.nextLine();
			String nome = sc.next();
			
			///SEXO
			System.out.print("Sexo(M/F): ");
			sc.nextLine();
			char sexo = sc.next().toUpperCase().charAt(0);	
			while(sexo != 'M' && sexo != 'F') {  /// Usar aspas simples quando se tem CHAR
				System.out.print("Valor inválido! Favor digitar apenas M ou F: ");
				sexo = sc.next().toUpperCase().charAt(0);
			
			
			}////ALTURA
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			while(altura < 0 ) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				altura = sc.nextDouble();
			}
			///Atleta mais alto
			if(altura > altura_cont) {
				altura_cont = altura;
				alto = nome;
			}
			
	
			if(sexo == 'M') {
				hom++;		
			}
			else {
				fem++;
				fem_maxAlt += altura;
				
			}
			
			
			System.out.print("Peso: ");
			double peso = sc.nextDouble();
			
			while(peso < 0) {
				System.out.print("Valor inválido! Favor digitar um valor positivo: ");
				peso = sc.nextDouble();
			}
			///Para peso médio
			soma_peso+=peso;
						
		}
		double homem_porcen = (((double)hom * 100) / qtd_atle);
		double p_medio = soma_peso / (double)qtd_atle;
		double alt_media_fem = fem_maxAlt / fem; 
		System.out.println("RELATÓRIO:");
		System.out.printf("Peso médio dos atlétas: %.1f KG\n", p_medio);
		System.out.printf("Atleta mais alto: %s \n",alto );
		System.out.printf("Porcentagem de homens cadastrados: %.1f %%%n", homem_porcen);
		if(fem == 0) {
			System.out.println("Não há mulheres cadastradas.");
		}
		else {
			System.out.printf("Altura média das mulheres: %.1f", alt_media_fem);
		}
		
		
		sc.close();
	}

}
