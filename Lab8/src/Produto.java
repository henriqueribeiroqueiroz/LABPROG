import java.util.ArrayList;
import java.util.List;

public class Produto implements NaMosca {

	private String descricao;
	private double preco;
	List<Opiniao> comentarios;

	public Produto(String descricao, double preco) throws Exception {
		comentarios = new ArrayList<>();
		setDescricao(descricao);
		setPreco(preco);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) throws Exception {
		if (descricao != null && !descricao.trim().isEmpty())
			this.descricao = descricao;
		else
			throw new Exception("Insira opiniao");
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) throws Exception {
		if (preco > 0)
			this.preco = preco;
		else
			throw new Exception(
					"Coloque valor no produto.");
	}

	public void EstrategiaSimples() {
		if (!comentarios.isEmpty()) {
			double mediaNotas = 0;
			Opiniao maiorNota = comentarios.get(0);
			Opiniao menorNota = comentarios.get(0);

			for (int i = 0; i < comentarios.size(); i++) {
				if (comentarios.get(i).getNota() > maiorNota.getNota()) {
					maiorNota = comentarios.get(i);
				} else if (comentarios.get(i).getNota() == maiorNota.getNota()) {
					if (maiorNota.getData().compareTo(
							comentarios.get(i).getData()) == 1)
						maiorNota = comentarios.get(i);
				} else if (comentarios.get(i).getNota() < menorNota.getNota()) {
					menorNota = comentarios.get(i);
				} else if (comentarios.get(i).getNota() == menorNota.getNota()) {
					if (menorNota.getData().compareTo(
							comentarios.get(i).getData()) == 1)
						menorNota = comentarios.get(i);
				}
				mediaNotas += comentarios.get(i).getNota();
			}
			System.out.println("SOBRE O PRODUTO: ");
			if (menorNota.getNota() != maiorNota.getNota()) {
				System.out.println("MENOR NOTA:\n" + menorNota);
				System.out.println("\nMAIOR NOTA:\n" + maiorNota);
			} else if (menorNota.getData().compareTo(maiorNota.getData()) == -1) {
				System.out.println(menorNota);
			} else {
				System.out.println(maiorNota);
			}
			System.out.printf("NOTA NaMosca: %,.1f\n",
					mediaNotas / comentarios.size());
		} else {
			System.out.println("NOTA NaMosca: 0\nSem comentários.");
		}
	}

	public void EstrategiaSazional() {
		if (!comentarios.isEmpty()) {
			double mediaNotas = 0;
			int cont = 0;
			for (int i = comentarios.size() - 1; (i >= 0 && i > comentarios
					.size() - 4); i--, cont++) {
				mediaNotas += comentarios.get(i).getNota();
				if (cont < 2)
					System.out.println(comentarios.get(i) + "\n");
			}
			System.out.printf("Nota NaMosca: %,.1f", mediaNotas /= cont);
		} else {
			System.out.println("Nota NaMosca: 0\nSem comentários.");
		}
	}

	public void inserirOpiniao(String consumidor, String comentario, int nota)
			throws Exception {
		comentarios.add(new Opiniao(consumidor, comentario, nota));
	}

	public String toString() {
		return String.format("Descrição: %s\nPreço: R$ %,.2f", getDescricao(),
				getPreco());
	}
}