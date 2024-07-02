
public class Pizza extends Produtos{
	private String ingredientes;
	private Double tempoDePreparo;
	
	public Pizza(String nome, Double valor, String ingredientes, Double tempoDePreparo) {
		super(nome, valor);
		this.ingredientes = ingredientes;
		this.tempoDePreparo = tempoDePreparo;
		
	}
	
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}
	public Double getTempoDePreparo() {
		return tempoDePreparo;
	}
	public void setTempoDePreparo(Double tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	@Override
	public String preparar() {
		return this.ingredientes + this.tempoDePreparo;
	}
	
}
