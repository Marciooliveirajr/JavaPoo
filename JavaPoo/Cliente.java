package poo;

public class Cliente {
	
	
		private String Nome;
		private String Email;
		private String Nascimento;
		private int CPF;
		private int Cel;
		
		
		public Cliente(String nome, String email, String nascimento, int cPF, int cel) {
			super();
			Nome = nome;
			Email = email;
			Nascimento = nascimento;
			CPF = cPF;
			Cel = cel;
		}


		

		public String getNome() {
			return Nome;
		}




		public void setNome(String nome) {
			Nome = nome;
		}




		public String getEmail() {
			return Email;
		}




		public void setEmail(String email) {
			Email = email;
		}




		public String getNascimento() {
			return Nascimento;
		}




		public void setNascimento(String nascimento) {
			Nascimento = nascimento;
		}




		public int getCPF() {
			return CPF;
		}




		public void setCPF(int cPF) {
			CPF = cPF;
		}




		public int getCel() {
			return Cel;
		}




		public void setCel(int cel) {
			Cel = cel;
		}




		public void visualizar() {
			System.out.println("*******************************************");
			System.out.println("Nome do cliente: "+ Nome);
			System.out.println("Email do cliente: "+ Email);
			System.out.println("data de nascimento : "+ Nascimento);
			System.out.println("CPF do cliente: "+ CPF);
			System.out.println("Celular do cliente: "+ Cel);
			
		}
		
	}
