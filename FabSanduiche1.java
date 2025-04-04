package Factory;

import Ingredientes.Capoeira;
import Ingredientes.Cheddar;
import Ingredientes.PaoIntegral;
import Ingredientes.PresuntoPeru;
import Ingredientes.Tomate;
import Interfaces.FatiaPao;
import Interfaces.FatiaPresunto;
import Interfaces.FatiaQueijo;
import Interfaces.Ovo;

public class FabSanduiche1 implements  FabricaDeSanduiche {

	
	public FatiaPao criaPao(){
		return new PaoIntegral();
	}
	
	public FatiaQueijo criaQueijo(){
		return new Cheddar();
	}
	
	public Tomate criatomate(){
		return new Tomate();
		
	}
	
	public FatiaPresunto criaPresunto(){
		return new PresuntoPeru();
	}
	
	public Ovo criaOvo(){
		return new Capoeira();
	}
	
	
	@Override
	public Sanduiche criaSanduiche() {
		FatiaPao pao1 = criaPao();
		FatiaPao pao2 = criaPao();
		FatiaQueijo queijo = criaQueijo();
		Tomate tomate = criatomate();
		FatiaPresunto presunto = criaPresunto();
		Ovo ovo = criaOvo();
		
		Sanduiche sanduiche = new Sanduiche(pao1, pao2, queijo, presunto, ovo, tomate);
		return sanduiche;
	}

}
