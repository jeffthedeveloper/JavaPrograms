
public class MarioPequeno implements MarioState {

	@Override
	public MarioState pegarCogumelo() {
		System.out.println("Mario Grande");
		return new MarioGrande();
	}

	@Override
	public MarioState pegarFlor() {
		System.out.println("Mario Grande com fogo!");
		return new MarioFogo();
	}

	@Override
	public MarioState pegarPena() {
		System.out.println("Mario Grande com capa");
		return new MarioCapa();
	}

	@Override
	public MarioState levarDano() {
		System.out.println("Mario morreu Game Over!");
		return new MarioMorto();
	}

}
