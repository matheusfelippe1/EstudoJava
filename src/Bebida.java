
public class Bebida extends Produtos{
	private String ingredientes;
	private String modoDePreparo;
	
	public Bebida(String nome, Double valor, String ingredientes, String modoDePreparo) {
		super(nome, valor);
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoDePreparo;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}
	
	public String preparar() {
		return getNome() + " " + getValor() + " " + this.ingredientes + this.modoDePreparo;
	}
	
	
}
