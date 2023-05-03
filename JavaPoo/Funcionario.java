package poo;

public class Funcionario {

	private String Nome;
	private String endereco;
	private String setor;
	private int telefone;
	private int idade;
	
	

	public Funcionario(String nome, String endereco, String setor, int telefone, int idade) {
		super();
		Nome = nome;
		this.endereco = endereco;
		this.setor = setor;
		this.telefone = telefone;
		this.idade = idade;
	}



	public String getNome() {
		return Nome;
	}



	public void setNome(String nome) {
		Nome = nome;
	}



	public String getEndereco() {
		return endereco;
	}



	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}



	public String getSetor() {
		return setor;
	}



	public void setSetor(String setor) {
		this.setor = setor;
	}



	public int getTelefone() {
		return telefone;
	}



	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
		
	}
	
	public void visualizar() {
		System.out.println("**************************************");
		System.out.println("Nome do colaborador: "+ Nome);
		System.out.println("Endereço do colaborador: "+ endereco);
		System.out.println("Setor do colaborador: "+ setor);
		System.out.println("Telefone do colaborador: "+ telefone);
		System.out.println("Idade do colaborador: "+ idade);
		
	}	
}