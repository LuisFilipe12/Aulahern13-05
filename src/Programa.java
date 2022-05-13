import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pessoa pessoa = new Pessoa();
		Aluno aluno = new Aluno();

		String informacoes;
		List<String> informacao = new ArrayList<>();

		for (int i = 0; i < 6; i++) {

			System.out.println("Entre com as informações: ");
			informacoes = sc.nextLine();
			informacao.add(informacoes);
		}
				for(String info : informacao)
		System.out.println(info);
		
		
		
		
		
		sc.close();
	}

}
