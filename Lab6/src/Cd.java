import java.util.ArrayList;
import java.util.List;

//Aluno 1: Jos� Henrique Ribeiro

/**
 * 
 * Esta classe refere-se ao cadastro completo de um CD, em uma CDteca virtual.
 *
 * @author Jos� Henrique Ribeiro
 * @version 1.0 18 de novembro de 2017
 */

public class Cd {
	String artista, album, musicap;
	int n_musicas;
	List<String> l_musicas = new ArrayList<String>();

	/**
	 * Este � um dos construtores da classe Cd que recebe como par�metros o
	 * artista,nome do �lbum e uma lista de musicas. os par�metros s�o
	 * armazenados nas suas respectivas vari�veis.
	 * 
	 * @throws Exception
	 *             Mensagem de erro/exce��o.
	 */
	public Cd(String artista, String titulo, int m) throws Exception {
		if (artista != null || titulo != null) {
			this.artista = artista;
			this.album = titulo;
			this.n_musicas = m;
		} else {
			throw new Exception("Artista ou nome do album nulo.");
		}
	}

	/**
	 * Este � um dos construtores da classe Cd que recebe como par�metros o
	 * artista,nome do �lbum. ele nao solicita numero de faixas, assim �
	 * considerado tamanho 10. os par�metros s�o armazenados nas suas
	 * respectivas vari�veis.
	 * 
	 * @throws Exception
	 *             Mensagem de erro/exce��o.
	 */
	public Cd(String artista, String titulo) throws Exception {
		if (artista != null || titulo != null) {
			this.artista = artista;
			this.album = titulo;
			this.n_musicas = 10;
		} else {
			throw new Exception("Artista ou nome do album nulo.");
		}
	}

	/**
	 * Retorna uma String com o nome do artista.
	 *
	 * @return nome do artista.
	 */
	public String getArtista() {
		return this.artista;
	}

	/**
	 * Retorna uma String com o nome do album.
	 *
	 * @return nome do album.
	 */
	public String getTitulo() {
		return this.album;
	}

	/**
	 * Retorna um int com o numero de faixas.
	 *
	 * @return numero de musicas no CD.
	 */
	public int getN_musicas() {
		return this.n_musicas;
	}

	/**
	 * Retorna uma String com a trilha sonora do CD.
	 *
	 * @return nome da trilha sonora.
	 */
	public String getMusicap() {
		return this.musicap;
	}

	/**
	 * Ele define por uma String o nome da trilha sonora do CD. verificando se a
	 * trilha sonora aser definida esta entre as fauxas do album.
	 *
	 * @return true se obtiver sucesso, ou retorna falso se musica inv�lida.
	 */
	public boolean setMusicap(String musicap) {
		for (int i = 0; i < l_musicas.size(); i++) {
			if ((l_musicas.get(i)).equals(musicap)) {
				this.musicap = musicap;
				return true;
			}
		}
		System.out.println("\nEssa m�sica n�o consta nas faixas do �lbum.");
		return false;
	}

	/**
	 * cadastra no array do tipo string com o nome de uma musica.
	 *
	 * @param nome
	 *            a faixa do CD.
	 */
	public void cadastrar_musica(String nome) {
		l_musicas.add(nome);

	}

	/**
	 * Retorna uma String com o nome da faixa solicitada pelo usuario.
	 *
	 * @param i
	 *            se valido obter� sucesso, caso contr�rio mensagem de erro.
	 */
	public void mostra_uma_musica(int i) {
		int num = i - 1;
		if (num < l_musicas.size()) {
			System.out.println(l_musicas.get(num));
		} else {
			System.out.println("\nEssa faixa n�o existe no album");
		}
	}

	/**
	 * Printa o Array com a lista de musicas cadastradas.
	 *
	 *
	 */
	public void listar_musicas() {
		for (int i = 0; i < l_musicas.size(); i++) {
			int faixa = i + 1;
			System.out.println(faixa + " - " + l_musicas.get(i));
		}

	}
	/**
     * Retorna String com as informa��es sobre o CD cadastrado.
     *
     * @return o album completo.
     */
	@Override
	public String toString() {
		System.out.println("ARTISTA: " + getArtista() + "\n�LBUM: "
				+ getTitulo() + "\nN� DE FAIXAS: " + getN_musicas()
				+ "\nTRILHA PRINCIPAL DO CD: " + getMusicap()
				+ "\nFAIXAS DO ALBUM:");
		for (int i = 0; i < l_musicas.size(); i++) {
			int faixa = i + 1;
			System.out.println(faixa + " - " + l_musicas.get(i));
		}
		return super.toString();
	}

}