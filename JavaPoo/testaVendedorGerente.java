package javaPoo;

public class testaVendedorGerente {

	public static void main(String[] args) {

		Gerente ger1 = new Gerente ( "Marcio Oliveira", "Rua primavera", "Vendas", 1194578259,30, 1242);
		Gerente ger2 = new Gerente ( "Marina Silva", "Rodovia bandeirantes", "Financeiro", 1184836753,42, 2234);
	
		Vendedor vend1 = new Vendedor ( "Rogerio Santos", "rua 12", "Vendedor", 1195582270,35, 12476.44f);
		Vendedor vend2 = new Vendedor ( "Raimundo Silva", "Av ibirapuera", "Vendedor", 1195765298,37, 18867.84f);
		
		
		System.out.println("                                                  ");
		ger1.Visualizar();
		System.out.println("                                                  ");
		ger2.Visualizar();
		System.out.println("                                                  ");
		vend1.Visualizar();
		System.out.println("                                                  ");
		vend2.Visualizar();
	
	}
}