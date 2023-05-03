package javaPoo;

public class Vendedor extends Funcionario {
	
	private float Vlvendas;

	
	
	public Vendedor(String nome, String endereco, String setor, int telefone, int idade, float vlvendas) {
		super(nome, endereco, setor, telefone, idade);
		Vlvendas = vlvendas;
	}
	






	public float getVlvendas() {
		return Vlvendas;
	}







	public void setVlvendas(float vlvendas) {
		Vlvendas = vlvendas;
	}







	public void Visualizar() {
		System.out.println("Nome do colaborador: " + getNome());
		System.out.println("endereço do colaborador: "+ getEndereco());
		System.out.println("Setor do colaborador: "+ getSetor());
		System.out.println("Telefone do colaborador: "+ getTelefone());
		System.out.println("Idade do colaborador: " + getIdade());
		System.out.println("Valor total de vendas: " + getVlvendas());
		
	}
}

