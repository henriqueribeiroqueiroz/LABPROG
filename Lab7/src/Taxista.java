//Aluno 1: José Henrique Ribeiro

public class Taxista extends Contribuinte {
	int numPassageiros;
	int kmRodados;
	final double TRIBUTO_POR_PASSAGEIRO = 0.5;
	double tributo = 0;
	double desconto;
	double totalTributo = tributo-desconto; 

	public void calculoTributo(double i) {
		this.tributo = i * TRIBUTO_POR_PASSAGEIRO;
		System.out.println("R$ " + tributo + "0");

	}
	
	public void calculoDesconto(double i){
		this.desconto = kmRodados*0.01;
	}
	
}
