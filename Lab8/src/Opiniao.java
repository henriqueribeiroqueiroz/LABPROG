import java.util.Calendar;

public class Opiniao {
	private String usuario;
	private String comentario;
	private int nota;
	private Calendar data;
	private final int NOTA_MIN = -2;
	private final int NOTA_MAX = 2;
	private final int CARACTERES_DO_COMENTARIO = 140;

	public Opiniao(String usuario, String comentario, int nota)
			throws Exception {
		setUsuario(usuario);
		setComentario(comentario);
		setNota(nota);
		setData(data);
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) throws Exception {
		if (comentario == null || comentario.length() == 0
				|| comentario.trim().isEmpty()) {
			throw new Exception("Insira seu comentário sobre o produto.");
		} else if (comentario.length() > CARACTERES_DO_COMENTARIO) {
			throw new Exception(
					"Seu comentário nçao pode exceder 140 caracteres.");
		} else {
			this.comentario = comentario;
		}
	}

	public Calendar getData() {
		return data;
	}

	private void setData(Calendar data) {
		this.data = Calendar.getInstance();
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) throws Exception {
		if (nota >= NOTA_MIN && nota <= NOTA_MAX)
			this.nota = nota;
		else
			throw new Exception("Sua nota não esta no itnervalo de -2 a 2.");
	}

	public String toString() {
		String string = String.format("Usuario: " + getUsuario() + "\nNota: "
				+ getNota() + "\nFeedback: " + getComentario());
		string = string.concat(String.format("\nData: "
				+ data.get(Calendar.DAY_OF_MONTH) + "/"
				+ data.get(Calendar.MONTH) + "/" + data.get(Calendar.YEAR)));
		return string;
	}
}