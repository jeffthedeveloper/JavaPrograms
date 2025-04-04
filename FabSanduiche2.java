package Factory;

import Ingredientes.Mussarela;
import Ingredientes.PaoFrances;
import Ingredientes.PresuntoFrango;
import Interfaces.FatiaPao;
import Interfaces.FatiaPresunto;
import Interfaces.FatiaQueijo;

public class FabSanduiche2 extends FabSanduiche1 {
	
	public FabSanduiche2(){
		
	}
	
	@Override
	public FatiaPao criaPao(){
		return new PaoFrances();
	}
	
	@Override
	public FatiaQueijo criaQueijo(){
		return new Mussarela();
	}
	
	@Override
	public FatiaPresunto criaPresunto(){
		return new PresuntoFrango();
	}
	

}
