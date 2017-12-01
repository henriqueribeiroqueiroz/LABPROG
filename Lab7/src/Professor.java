//Aluno 1: José Henrique Ribeiro

public class Professor {
	final double SALARIO_MINIMO = 910.80;
	double tributo;
	double desconto;
	double totalTributo = tributo - desconto;
	double materialDidatico;

	public void calculoTributo(double salario) {
		if (salario <= SALARIO_MINIMO) {
			this.tributo = (SALARIO_MINIMO * 5) / 100;
		} else if (salario > SALARIO_MINIMO && salario <= 5 * SALARIO_MINIMO) {
			this.tributo = (SALARIO_MINIMO * 10) / 100;
		} else if (salario > 5 * SALARIO_MINIMO) {
			this.tributo = (SALARIO_MINIMO * 20) / 100;
		}
	}

	public void calculoDesconto(int i) {
		this.desconto = materialDidatico/2;
		

	}

}
