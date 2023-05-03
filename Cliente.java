package poo;

public class Cliente {
	
	
		private String Nome;
		private String Email;
		private String Nascimento;
		private int CPF;
		private int Cel;
		
		
		public Cliente(String Nome, String email, String Nascimento, int cPF, int Cel) {
			super();
			this.Nome = Nome;
			Email = email;
			this.Nascimento = Nascimento;
			CPF = cPF;
			this.Cel = Cel;
		}


		public String getNomeCliente() {
			return Nome;
		}


		public void setNomeCliente(String nomeCliente) {
			this.Nome = Nome;
		}


		public String getEmail() {
			return Email;
		}


		public void setEmail(String email) {
			Email = email;
		}


		public String getDatanasc() {
			return Nascimento;
		}


		public void setDatanasc(String datanasc) {
			this.Nascimento = Nascimento;
		}


		public int getCPF() {
			return CPF;
		}


		public void setCPF(int cPF) {
			CPF = cPF;
		}


		public int getCelular() {
			return Cel;
		}


		public void setCelular(int Cel) {
			this.Cel = Cel;
		}


		public void visualizar() {
			System.out.println("\nO cliente, "+Nome+" Portador do Cpf: "+CPF+"\nPossui o email: "
		+Email+"nascido em: "+Nascimento+" com o numero de celular:  "+Cel);
			
		}
		
	}
