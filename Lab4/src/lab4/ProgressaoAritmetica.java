package lab4;

//Aluno 1: José Henrique Ribeiro

/**
* 
* Esta classe refere-se a metodos usados para gerar uma PA
*
* @author José Henrique Ribeiro
* @version 1.0 12 de Outubro de 2017
*/

public class ProgressaoAritmetica extends java.lang.Object {
	int razao, primeiro, n, proximo, termo, atual;

	// primeiro termo da PA dado por "primeiro" e a razão da PA dada por "razao"
	public ProgressaoAritmetica(int primeiro, int razao) {
		this.primeiro = primeiro;
		this.razao = razao;
	}

	// Recupera a razao da progressao aritmetica.
	public int getRazao() {
		return razao;
	}

	// Calcula o proximo termo da PA.
	public int proximo() {
		proximo = atual + getRazao();
		atual = proximo;
		return proximo;
	}

	// Reinicia a PA para o seu primeiro termo.
	public int primeiro() {
		atual = primeiro;
		return atual;
	}

	// Calcula o n-esimo termo da PA.
	public int termo(int n) {
		if (n <= 0) {
			return primeiro;
		}
		termo = primeiro + (n - 1) * razao;
		atual = termo;
		return atual;
	}

	// converte os "n" primeiros termos (1 ... n) da PA em String.
	public java.lang.String geraTermos(int n) {
		String converte;
		if (n <= 0) {
			converte = Integer.toString(primeiro);
			return converte;
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("Termo[" + (i + 1) + "]: " + termo(i + 1) + "\n");
		}
		atual = termo(n);
		return "";
	}

}
