package javaPoo;

public class Gerente extends Funcionario{
	
	private int acesso;
		
	
	public Gerente(String nome, String endereco, String setor, int telefone, int idade, int acesso) {
		super(nome, endereco, setor, telefone, idade);
		this.acesso = acesso;
	}

	public int getAcesso() {
		return acesso;
	}


	public void setAcesso(int acesso) {
		this.acesso = acesso;
		
	}
	
	public void Visualizar() {
		System.out.println("Nome do gerente: "+ getNome());
		System.out.println("endereço do colaborador: "+ getEndereco() );
		System.out.println("Setor Responsável: "+ getSetor());
		System.out.println("Telefone do colaborador: "+ getTelefone());
		System.out.println("Idade do colaborador: "+ getIdade());
		System.out.println("Código de acesso do responsável: "+ getAcesso());
		
	}

	
}