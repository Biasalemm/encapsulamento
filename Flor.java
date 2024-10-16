package atividades0910;

public class Flor {
	String Passo1, Passo2, Passo3;
	int numpetalas;

	Flor(String Passo1, String Passo2, String Passo3, int numpetalas) {
		this.Passo1 = Passo1;
		this.Passo2 = Passo2;
		this.Passo3 = Passo3;
		this.numpetalas = numpetalas;
	}

	public String getPasso1() {
		return Passo1;
	}

	public void setPasso1(String passo1) {
		Passo1 = passo1;
	}

	public String getPasso2() {
		return Passo2;
	}

	public void setPasso2(String passo2) {
		Passo2 = passo2;
	}

	public String getPasso3() {
		return Passo3;
	}

	public void setPasso3(String passo3) {
		Passo3 = passo3;
	}

	public int getNumpetalas() {
		return numpetalas;
	}

	public void setNumpetalas(int numpetalas) {
		this.numpetalas = numpetalas;
	}

}
