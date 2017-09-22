import java.util.InputMismatchException;
import java.util.Scanner;
/* 
 * Aluno 01: <Jos� Henrique Ribeiro de Queiroz>
 * 
 * N�o consegui interpretar a f�rmula :(
 * formula = Math.abs((menu + entrada1 - entrada2) % menu);  (???)
 */
public class PedraPapelTesoura {

	public static void main(String[] args) {
		try {
			jogo();
		} catch (InputMismatchException e) {
			System.out.println("\nVoc� digitou algo errado! Tente novamente!");
			jogo();
		}
	}

	public static void jogo() {
		int entrada1 = 0, entrada2 = 0, menu = 3;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.print("JOGADOR 1: Pedra (1), Papel (2), Tesoura (3)? ");
			entrada1 = scan.nextInt();
			System.out.print("JOGADOR 2: Pedra (1), Papel (2), Tesoura (3)? ");
			entrada2 = scan.nextInt();

			if (entrada1 == -1 || entrada2 == -1) {
				System.out.println("Fim de Jogo!");
				break;
			} else if (entrada1>0 && entrada1<4){
				if (entrada1 == 1 && entrada2 == 2) {
					System.out.println("PEDRA - PAPEL\nJogador 2 Ganhou!");
				} else if (entrada1 == 1 && entrada2 == 3) {
					System.out.println("PEDRA - TESOURA\nJogador 1 Ganhou!\n");
				} else if (entrada1 == 2 && entrada2 == 1) {
					System.out.println("PAPEL - PEDRA\nJogador 1 Ganhou!\n");
				} else if (entrada1 == 2 && entrada2 == 3) {
					System.out.println("PAPEL - TESOURA\nJogador 2 Ganhou!\n");
				} else if (entrada1 == 3 && entrada2 == 1) {
					System.out.println("TESOURA - PEDRA\nJogador 2 Ganhou!\n");
				} else if (entrada1 == 3 && entrada2 == 2) {
					System.out.println("TESOURA - PAPEL\nJogador 1 Ganhou!\n");
				} else if ((entrada1 == 2 && entrada2 == 2)
						|| (entrada1 == 1 && entrada2 == 1)
						|| (entrada1 == 3 && entrada2 == 3)) {
					System.out.println("Houve empate!\n");
				}
			}
			System.out.println("\nDigite um dos n�meros do menu.");
			
			
		} while ((entrada1 != -1 || entrada2 != -1));

	}

}
