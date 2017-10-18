package lab4;

import java.util.Scanner;

//	Aluno 1: Jos� Henrique Ribeiro

/**
 * 
 * Esta classe refere-se a executar uma PA pelo usu�rio ou usar a s�rie de
 * Fibonacci
 *
 * @author Jos� Henrique Ribeiro
 * @version 1.0 12 de Outubro de 2017
 */

public class ExplorandoOMundoDasSeries {
	int primeiro, razao;
	boolean novaPA = false, novaFibo = false;
	Scanner scanner = new Scanner(System.in);

	/**
	 * 
	 * Segue abaixo o menu para usu�rio, objeto e m�todos
	 *
	 */

	public void menu() {
		int escolha = 0;

		do {
			System.out.println("\n==:BEM VINDO AO MUNDO DAS S�RIES:==");
			System.out.println("\nSelecione o n�mero referente ao que deseja");
			System.out.println("1. Para criar uma progress�o aritm�tica");
			System.out.println("2. Para criar uma s�rie de Fibonacci");
			System.out.println("3. Para ver o termo 'n' da sua PA");
			System.out.println("4. Para ver o termo 'n' da serie de Fibonacci");
			System.out
					.println("5. Para mostrar os 'n' primeiros termos da sua PA e da serie de Fibonacci");
			System.out.println("6. Para sair");
			System.out.print("Aguadando escolha: ");
			escolha = scanner.nextInt();

			switch (escolha) {

			case 1:
				System.out.print("\nDigite o primeiro elemento da sua PA: ");
				primeiro = scanner.nextInt();
				System.out.print("Digite a razao da sua PA: ");
				razao = scanner.nextInt();
				progressaoaritmetica(primeiro, razao);
				System.out.println("Sua Progressao Aritmetica foi gerada!");
				break;

			case 2:
				fibonacci();
				System.out
						.println("A Serie de Fibonacci foi gerada a partir da sua entrada!");
				break;

			case 3:
				int elementoPA = getElementoPA();
				if (elementoPA == -1) {
					System.out
							.println("Para ver os elementos da sua PA, � preciso cri�-la.");
				} else {
					System.out.println(elementoPA);
				}
				break;

			case 4:
				int elementoFibo = getElementoFibo();
				if (elementoFibo == -1) {
					System.out
							.println("Para ver os elementos sa sua Serie Fibonacci, � preciso cri�-la.");
				} else {
					System.out.println(elementoFibo);
				}
				break;

			case 5:
				getSeries();
				break;

			case 6:
				System.out.println("O programa est� sendo encerrado...");
				System.out.println("Obrigado!");
			}
		} while (escolha != 6);
	}

	/**
	 * 
	 * O metodo abaixo gera uma Progress�o Aritmetica.
	 * 
	 * @param primeiro
	 *            o primeiro elemento inserido pelo usu�rio para a PA.
	 * @param razao
	 *            a raz�o da PA fornecido pelo usuario.
	 * @return resultado da PA com base nas informacoes de entrada.
	 * 
	 * */

	public Object progressaoaritmetica(int primeiro, int razao) {
		ProgressaoAritmetica pa = new ProgressaoAritmetica(primeiro, razao);

		novaPA = true;

		return pa;
	}

	/**
	 * 
	 * O metodo abaixo gera uma serie de Fibonacci.
	 * 
	 * @return resultado da serie de Fibonacci.
	 * 
	 */
	public Object fibonacci() {
		Fibonacci fibonacci = new Fibonacci();

		novaFibo = true;

		return fibonacci;
	}

	/**
	 * 
	 * o metodo abaixo printa os elementos da PA.
	 * 
	 * @return os elementos da PA solicitado pelo usu�rio.
	 * 
	 * */
	public int getElementoPA() {
		if (novaPA == true) {
			int elemento;
			Object pa;
			pa = progressaoaritmetica(primeiro, razao);
			System.out.print("Digite o elemento 'n' da sua PA: ");
			elemento = scanner.nextInt();
			System.out.printf("O elemento " + elemento + " da sua PA �: ");
			return ((ProgressaoAritmetica) pa).termo(elemento);
		} else {
			return -1;
		}
	}

	/**
	 * 
	 * o metodo abaixo printa os elementos da serie de Fibonacci.
	 * 
	 * @return os elementos da serie de Fibonacci solicitado pelo usu�rio.
	 * 
	 * */
	public int getElementoFibo() {
		if (novaFibo == true) {
			int elemento;
			Object fibo;
			fibo = fibonacci();
			System.out
					.print("Digite o elemento 'n' da sua serie de Fibonacci: ");
			elemento = scanner.nextInt();
			System.out.printf("O elemento " + elemento
					+ " da sua serie Fibonacci �: ");

			return ((Fibonacci) fibo).fibo(elemento);
		} else {
			return -1;
		}

	}

	/**
	 * 
	 * o metodo abaixo mostra os elementos da PA e da s�rie de Fibonacci.
	 * 
	 * */
	public void getSeries() {
		if (novaPA == true && novaFibo == true) {
			Object fibo, pa;
			int q;
			pa = progressaoaritmetica(primeiro, razao);
			fibo = fibonacci();
			System.out
					.print("Digite a quantidade de elementos para ser mostrados: ");
			q = scanner.nextInt();
			System.out.println("::Progressao Aritm�tica::");
			((ProgressaoAritmetica) pa).geraTermos(q);
			System.out.println("\n::S�rie de Fibonacci::");
			((Fibonacci) fibo).getFibo(q);
		} else {
			System.out
					.println("Para ver os 'n' elementos das suas s�ries, � preciso cri�-la.");
		}
	}

	// abaixo est� o main do programa para execu��o
	public static void main(String[] args) {
		ExplorandoOMundoDasSeries executar = new ExplorandoOMundoDasSeries();
		executar.menu();
	}
}