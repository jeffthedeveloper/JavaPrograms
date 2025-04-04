package Factory;

public class Cliente {

	public static void main(String[] args) {
		
		//Dando new nas Fabs de Sanduiches
		FabSanduiche1 sanduba1 = new FabSanduiche1();
		FabSanduiche2 sanduba2 = new FabSanduiche2();
		FabSanduiche3 sanduba3 = new FabSanduiche3();
		
		//Montando os Sanduiches
		sanduba1.criaSanduiche();
		sanduba2.criaSanduiche();
		sanduba3.criaSanduiche();
	


	}

}
