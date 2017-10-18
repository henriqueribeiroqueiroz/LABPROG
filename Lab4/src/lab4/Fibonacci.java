package lab4;

//Aluno 1: José Henrique Ribeiro

/**
 * 
 * EEsta classe refere-se a metodos usados para gerar uma serie de fibonacci
 *
 * @author José Henrique Ribeiro
 * @version 1.0 12 de Outubro de 2017
 */

public class Fibonacci {
	private int atual = 0, anterior = 0;

	public int fibo(int elementos) {

		for (int i = 0; i < elementos; i++) {
			if (i == 1) {
				atual = 1;
				anterior = 0;
			} else {
				atual = atual + anterior;
				anterior = atual - anterior;
			}
		}
		return atual;
	}

	public void getFibo(int n){
		if (n <= 0){
			System.out.println("Digite um valor maior que zero.");
		}else{
			for (int i = 0; i < n; i++) {
				System.out.printf("Elemento[%d]: %d\n", i + 1, fibo(i+1));
			}
		}
	}

}