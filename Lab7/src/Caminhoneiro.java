//Aluno 1: José Henrique Ribeiro

public class Caminhoneiro extends Contribuinte {
	double numToneladas;
	int kmRodados;
	double tributo = 0;
	final double DESCONTO_POR_KM = 0.01;
	double desconto;
	double totalTributo = tributo-desconto;
	

	public void calculoTributo(double i) {
		if (i <= 10) {
			this.tributo = 500;
			System.out.println(tributo);
		} else if (i > 10) {
			this.tributo = 500 + ((i - 10) * 100);
			System.out.println(tributo);
		}
	}
	
	public void calculoDesconto(double i){
		this.desconto = kmRodados*0.01;
	}
	
	

}
