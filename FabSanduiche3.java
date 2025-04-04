package Factory;

import Ingredientes.Granja;
import Ingredientes.PaoBola;
import Interfaces.FatiaPao;
import Interfaces.Ovo;

public class FabSanduiche3 extends FabSanduiche1 {
	
	public FabSanduiche3(){
		
	}
	
	@Override
	public FatiaPao criaPao(){
		return new PaoBola();
	}
	
	@Override
	public Ovo criaOvo(){
		return new Granja();
	}

}
