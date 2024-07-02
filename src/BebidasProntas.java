
public class BebidasProntas extends Produtos{
	private String tipo;

	public BebidasProntas(String nome, Double valor, String tipo) {
		super(nome, valor);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public String preparar() {
		return getNome() + " " + getValor() + " " + this.tipo;
	}
	
}
