package poo;

public class TestaFuncionario {

	public static void main(String[] args) {
		
		Funcionario n1 = new Funcionario ( "Marcio Oliveira", "Av nove de julho", "Desenvolvedor", 1174536754,29);
		
		Funcionario n2 = new Funcionario ("Manuela Silva ","Av 23 de maio","Analista de sistema", 1194598799, 18);
		
		n1.visualizar();
		n2.visualizar();
	}	
}