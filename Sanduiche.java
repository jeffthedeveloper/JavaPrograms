package Factory;

import Ingredientes.Tomate;
import Interfaces.FatiaPao;
import Interfaces.FatiaPresunto;
import Interfaces.FatiaQueijo;
import Interfaces.Ovo;

public class Sanduiche {

	public Sanduiche(FatiaPao fatpao1, FatiaPao fatpao2, FatiaQueijo fatqueijo,
			FatiaPresunto fatpresunto, Ovo ovo, Tomate tomate) {
		System.out.println("Sanduiche: " + fatpao1.tipoPao() + ", "
				+ fatqueijo.tipoQueijo() + ", " + fatpresunto.tipoPresunto()
				+ ", " + ovo.tipoOvo()+ ", " + tomate.tomate());
	}
}
