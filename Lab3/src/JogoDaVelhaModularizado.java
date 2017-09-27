import java.util.Scanner;

public class JogoDaVelhaModularizado {
	public static void main(String args[]) {
		char tabuleiro[][] = new char[3][3];
		String resp = "S";
		int jogada = 0, j = 0, i = 0;

		iniciar(i, j, tabuleiro, jogada);

		
	}

	public static void alimentarTabuleiro(int i, int j, char tabuleiro[][]) {
		for (i = 0; i < 3; i++)
			for (j = 0; j < 3; j++)
				tabuleiro[i][j] = ' ';

	}

	public static void mostrarTabuleiro(int i, char tabuleiro[][]) {
		for (i = 0; i < 3; i++) {
			System.out.print(tabuleiro[i][0] + "|" + tabuleiro[i][1] + "|"
					+ tabuleiro[i][2]);
			if (i < 3 - 1) {
				System.out.print("\n------\n");
			}
		}
	}

	public static void marcarJogada(int i, int j, char tabuleiro[][], int jogada) {
		if (tabuleiro[i - 1][j - 1] == ' ') {
			if ((jogada % 2) == 1)
				tabuleiro[i - 1][j - 1] = 'X';
			else
				tabuleiro[i - 1][j - 1] = 'O';
		}

	}

	public static void entrada(int i, int j, int jogada) {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nINSIRA AS COORDENADAS");
		if ((jogada % 2) == 1)
			System.out.print("===PLAYER 2===\nLINHA: ");
		else
			System.out.print("===PLAYER 1===\nLINHA: ");

		i = sc.nextInt();
		System.out.print("COLUNA: ");
		j = sc.nextInt();
	}

	public static void jogarNovamente() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nDeseja iniciar uma nova partida? [S/N]");
		String resp = sc.nextLine();
		if (resp.equals("S")){
			iniciar(0, 0, new char[3][3], 0); 
		}
		
	}

	public static void iniciar(int i, int j, char tabuleiro [][], int jogada) {
		Scanner sc = new Scanner(System.in);
		final char O = 'O';
		final char X = 'X';
		
		alimentarTabuleiro(i, j, tabuleiro);
		
		while (jogada <= 9) {
			
			System.out.print("JOGO DA VELHA\n");
			mostrarTabuleiro(i, tabuleiro);

			System.out.println("\nINSIRA AS COORDENADAS");
			if ((jogada % 2) == 1)
				System.out.print("===PLAYER 2===\nLINHA: ");
			else
				System.out.print("===PLAYER 1===\nLINHA: ");

			i = sc.nextInt();
			System.out.print("COLUNA: ");
			j = sc.nextInt();

			marcarJogada(i, j, tabuleiro, jogada);

			jogada++;

			if ((tabuleiro[0][0] == O && tabuleiro[0][1] == O && tabuleiro[0][2] == O)
					|| (tabuleiro[1][0] == O && tabuleiro[1][1] == O && tabuleiro[1][2] == O)
					|| (tabuleiro[2][0] == O && tabuleiro[2][1] == O && tabuleiro[2][2] == O)
					|| (tabuleiro[0][0] == O && tabuleiro[1][0] == O && tabuleiro[2][0] == O)
					|| (tabuleiro[0][1] == O && tabuleiro[1][1] == O && tabuleiro[2][1] == O)
					|| (tabuleiro[0][2] == O && tabuleiro[1][2] == O && tabuleiro[2][2] == O)
					|| (tabuleiro[0][0] == O && tabuleiro[1][1] == O && tabuleiro[2][2] == O)
					|| (tabuleiro[0][2] == O && tabuleiro[1][1] == O && tabuleiro[2][0] == O)) {

				mostrarTabuleiro(i, tabuleiro);
				System.out.print("\nJogador 1, VOCE VENCEU!!!");
				break;
			}
			if ((tabuleiro[0][0] == X && tabuleiro[0][1] == X && tabuleiro[0][2] == X)
					|| (tabuleiro[1][0] == X && tabuleiro[1][1] == X && tabuleiro[1][2] == X)
					|| (tabuleiro[2][0] == X && tabuleiro[2][1] == X && tabuleiro[2][2] == X)
					|| (tabuleiro[0][0] == X && tabuleiro[1][0] == X && tabuleiro[2][0] == X)
					|| (tabuleiro[0][1] == X && tabuleiro[1][1] == X && tabuleiro[2][1] == X)
					|| (tabuleiro[0][2] == X && tabuleiro[1][2] == X && tabuleiro[2][2] == X)
					|| (tabuleiro[0][0] == X && tabuleiro[1][1] == X && tabuleiro[2][2] == X)
					|| (tabuleiro[0][2] == X && tabuleiro[1][1] == X && tabuleiro[2][0] == X)) {

				mostrarTabuleiro(i, tabuleiro);
				System.out.print("\nJogador 2, VOCE VENCEU!!!");
				break;
			}

			if (jogada == 9) {
				mostrarTabuleiro(i, tabuleiro);
				System.out.print("\nPARTIDA EMPATADA");
				break;
			}

		}
		jogarNovamente();	
		
	}
}