package atividades0910;

public class ContaBancaria {
  //atributo privado
	private double saldo;
	
	//Construtor para inicializar o saldo
	public ContaBancaria(double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo= saldoInicial;
		}else {
			this.saldo = 0;
		}
	}
	
	//getter para o saldo
	public double getSaldo() {
		return saldo;
	}
	
	//metodo para depositar dinheiro (só aceita valores positivos)
	public void depositar(double valor) {
		if(valor> 0) {
			saldo += valor;
		} else {
			System.out.println("valor de deposito inválido");
		}
	}
	//metodo para sacar dinehiro(não pode sacar mais que o saldo)
	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo-=valor;
		} else {
			System.out.println("Saque inválido! Verifique o valor.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
