package discentes;

public class EstudanteSuperior extends Estudante{

	public double getMedia() {
		return (getTeste() + getProva())/2;
	}
}
