package atividades0910;

public class Principal {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente (01,"Bia","15996982173","4316754432", "2348997469");
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		System.out.println(cliente.getTelefone());
		System.out.println(cliente.getRg());
		System.out.println(cliente.getCpf());
		
		
		Tema tema = new Tema (01,"Barbie",150,"Rosa");
		
		System.out.println(tema.getId());
		System.out.println(tema.getNome());
		System.out.println(tema.getValorAluguel());
		System.out.println(tema.getCortoalha());
		
		ItemTem item = new ItemTem (01,"toalha barbie","Rosa e com rosto da barbie");
		
		System.out.println(item.getId());
		System.out.println(item.getNome());
		System.out.println(item.getDescricao());
		
		Endereco endereco = new Endereco (01,"Vila da paz",23,"casa","jardim nova era","são paulo","10230360","sp");
		
		System.out.println(endereco.getId());		
		System.out.println(endereco.getLogadouro());
		System.out.println(endereco.getNumero());
		System.out.println(endereco.getComplemento());
		System.out.println(endereco.getBairro());
		System.out.println(endereco.getCidade());
		System.out.println(endereco.getCep());
		System.out.println(endereco.getUf());
	}

}
