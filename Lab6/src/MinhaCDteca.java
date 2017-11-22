import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Aluno 1: José Henrique Ribeiro

/**
 * 
 * Esta classe refere-se ao cadastro completo de um CD, em uma CDteca virtual.
 *
 * @author José Henrique Ribeiro
 * @version 1.0 18 de novembro de 2017
 */
public class MinhaCDteca {
	List<Cd> cds = new ArrayList<Cd>();

	/**
	 * Metodo para adicionar CD.
	 *
	 * @param nome
	 *            nome do cd.
	 */
	public void adicionaCD(Cd nome) {
		cds.add(nome);
	}

	/**
	 * Metodo para adicionar CDs em um array.
	 *
	 * @param nome
	 *            nome do cd.
	 */
	public void adicionaCDs(Cd[] nome) {
		cds.addAll(Arrays.asList(nome));
	}

	/**
	 * Metodo para remover CD comparando pelo titulo.
	 *
	 * @return nome se conseguir remover, caso contrario retorne nulo..
	 */
	public Cd removeCD(Cd nome) {
		for (int i = 0; i < cds.size(); i++) {
			if (nome.equals(cds.get(i).getTitulo())) {
				cds.remove(nome);
				continue;
			}
			return nome;

		}
		return null;
	}

	/**
	 * Metodo para remover CDs comparando pelo titulo.
	 *
	 * @return true se conseguir remover ao menos um, caso contrario retorne
	 *         false..
	 */
	public boolean removeCDs(Cd[] nome) {
		int cont = 0;
		for (int i = 0; i < cds.size(); i++) {
			if (nome.equals(cds.get(i).getTitulo())) {
				cds.remove(nome);
				cont++;
			}
		}
		if (cont >= 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Metodo para pesquisar CD.
	 *
	 * @param nome
	 *            nome do disco. se encontrar, @return nome, nome do disco, caso
	 *            contrário retorne nulo.
	 */
	public Cd pesquisaCD(Cd nome) {
		for (int i = 0; i < cds.size(); i++) {
			if (nome.equals(cds.get(i).getTitulo())) {
				// return nome;
			} else {
				return null;
			}
		}
		return nome;
	}

	/**
	 * 
	 * Metodo para mostrar a quantidade de cds cadastrados
	 * 
	 */
	public void numeroDeCDs() {
		System.out.println(cds.size());
	}

	
	/**
     * Retorna String com as informações do array.
     *
     * 
     */
	@Override
	public String toString() {
		for (int i = 0; i < cds.size(); i++) {
			System.out.println(cds.get(i));
		}
		return super.toString();
	}

}
