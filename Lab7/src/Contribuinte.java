import java.util.ArrayList;
import java.util.Scanner;

//Aluno 1: José Henrique Ribeiro

public class Contribuinte {
	String nome;
	int numContribuinte;
	boolean casa;
	boolean carro;
	double valorCasa;
	double valorCarro;
	double sinaisExteriores;
	ArrayList<Contribuinte> contribuinte = new ArrayList<>();
	Scanner ler = new Scanner(System.in);
	Scanner ler2 = new Scanner(System.in);
	Scanner ler3 = new Scanner(System.in);

	public void cadastraContribuinte() {
		System.out.println("Digite o nome do contribuinte: ");
		String nome = ler.nextLine();
		this.nome = nome;
		System.out.println("Digite o numero do contribuinte: ");
		int num = ler.nextInt();
		this.numContribuinte = num;
		System.out.println("Possui casa? [Sim=1 /Não=0]");
		int casa2 = ler2.nextInt();
		if (casa2 == 1) {
			this.casa = true;
			System.out.println("Qual valor da casa? ");
			double vcasa = ler2.nextDouble();
			this.valorCasa = vcasa;
		} else {
			this.casa = false;
		}
		System.out.println("Possui carro? [Sim=1 /Não=0]");
		int carro2 = ler3.nextInt();
		if (carro2 == 1) {
			this.carro = true;
			System.out.println("Qual valor do carro? ");
			double vcarro = ler3.nextDouble();
			this.valorCarro = vcarro;
		} else {
			this.carro = false;
		}
		this.sinaisExteriores=valorCarro+valorCasa;
		System.out.println("Seus Sinais exteriores são no total de: "+sinaisExteriores);

	}
	
	public Contribuinte() {
		System.out.println("Digite o nome do contribuinte: ");
		String nome = ler.nextLine();
		this.nome = nome;
		System.out.println("Digite o numero do contribuinte: ");
		int num = ler.nextInt();
		this.numContribuinte = num;
		System.out.println("Possui casa? [Sim=1 /Não=0]");
		int casa2 = ler2.nextInt();
		if (casa2 == 1) {
			this.casa = true;
			System.out.println("Qual valor da casa? ");
			double vcasa = ler2.nextDouble();
			this.valorCasa = vcasa;
		} else {
			this.casa = false;
		}
		System.out.println("Possui carro? [Sim=1 /Não=0]");
		int carro2 = ler3.nextInt();
		if (carro2 == 1) {
			this.carro = true;
			System.out.println("Qual valor do carro? ");
			double vcarro = ler3.nextDouble();
			this.valorCarro = vcarro;
		} else {
			this.carro = false;
		}
		this.sinaisExteriores=valorCarro+valorCasa;
		System.out.println("Seus Sinais exteriores são no total de: "+sinaisExteriores);

		
	}

	public int getNumContribuinte() {
		return numContribuinte;
	}

	public void setNumContribuinte(int numContribuinte) {
		this.numContribuinte = numContribuinte;
	}

	public boolean isCasa() {
		return casa;
	}

	public void setCasa(boolean casa) {
		this.casa = casa;
	}

	public boolean isCarro() {
		return carro;
	}

	public void setCarro(boolean carro) {
		this.carro = carro;
	}

	public double getValorCasa() {
		return valorCasa;
	}

	public void setValorCasa(double valorCasa) {
		this.valorCasa = valorCasa;
	}

	public double getValorCarro() {
		return valorCarro;
	}

	public void setValorCarro(double valorCarro) {
		this.valorCarro = valorCarro;
	}

	public double getSinaisExteriores() {
		return sinaisExteriores;
	}

	public void setSinaisExteriores(double sinaisExteriores) {
		this.sinaisExteriores = sinaisExteriores;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNum_contribuinte() {
		return numContribuinte;
	}

	public void setNum_contribuinte(int num_cont) {
		this.numContribuinte = num_cont;
	}

	public void cadastrarContribuinte() {
		contribuinte.add(new Contribuinte());
	}

	public void listarContribuintes() {
		for (int i = 0; i < contribuinte.size(); i++) {
			int con = i + 1;
			System.out.println(con + " - " + contribuinte.get(i));
		}

	}

	public String toString() {
		for (int i = 0; i < contribuinte.size(); i++) {
			int con = i + 1;
			System.out.println(con + " - " + contribuinte.get(i));
		}
		return super.toString();
	}
}
