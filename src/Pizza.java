
public class Pizza extends Produtos{
	private String ingredientes;
	private String modoDePreparo;
	private Double tempoDePreparo;
	
	public Pizza(String nome, Double valor, String ingredientes, String modoDePreparo, Double tempoDePreparo) {
		super(nome, valor);
		this.ingredientes = ingredientes;
		this.modoDePreparo = modoDePreparo;
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

	public String getModoDePreparo() {
		return modoDePreparo;
	}

	public void setModoDePreparo(String modoDePreparo) {
		this.modoDePreparo = modoDePreparo;
	}

	@Override
	public String preparar() {
		return this.ingredientes + " " + this.modoDePreparo + " " + this.tempoDePreparo + " minutos";
	}
	
}
