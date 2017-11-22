import java.util.Scanner;

//Aluno 1: José Henrique Ribeiro

/**
* 
* Esta classe refere-se a testes aplicando metodos DA CLASSE Cd.java
*
* @author José Henrique Ribeiro
* @version 1.0 18 de novembro de 2017
*/

public class TestesCD {

	private static Scanner ler, ler2, ler3,ler32;
	
	public static void main(String[] args) throws Exception {
		boolean x;
		ler = new Scanner(System.in);
		System.out.println("::: BEM VINDO A CDteca VIRTUAL ::: ");
		System.out.println("Você irá cadastrar um CD na nossa CDteca");
		System.out.println("\nDigite o nome do artista: ");
		String artista = ler.nextLine();
		System.out.println("Digite o nome do Album: ");
		String album = ler.nextLine();
		System.out.println("Digite a quantidade de faixas do seu CD: ");
		int n_faixas = ler.nextInt();

		Cd album1 = new Cd(artista, album, n_faixas);

		for (int i = 0; i < n_faixas; i++) {
			ler2 = new Scanner(System.in);
			int faixa = i + 1;
			System.out.println("Digite o nome da " + faixa
					+ "ª faixa do album: ");
			String a = ler2.nextLine();
			album1.cadastrar_musica(a);
		}

		do {
			ler3 = new Scanner(System.in);
			System.out.println("Digite o nome da trilha do álbum: ");
			String trilha = ler3.nextLine();
			x = album1.setMusicap(trilha);
		} while (x == false);

		System.out.println("\n\nALBUM CADASTRADO COM SUCESSO!!! \n");
		System.out.println("==========================================\n");
		album1.toString();
		//album1.listar_musicas();

		ler32 = new Scanner(System.in);
		System.out.println("Digite o número da música do álbum: ");
		int num = ler32.nextInt();
		album1.mostra_uma_musica(num);

	}
}
