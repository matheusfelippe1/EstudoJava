
public class Main {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza("Margherita", 30.0, "Molho de tomate, queijo, manjericão", "Forno a 180 graus", 20.0);

		System.out.println("Nome: " + pizza1.getNome()
		+ "\n" + "Valor: R$" + pizza1.getValor() 
		+ "\n" + "Ingredientes: " + pizza1.getIngredientes() 
		+ "\n" + "Tempo de Preparo: " + pizza1.getTempoDePreparo() + " minutos"
		+ "\n" + "Preparação da Pizza 1: " + pizza1.preparar() + "\n");
        
		Bebida bebida1 = new Bebida("Suco Natural", 8.0, "Frutas frescas, água", "Agitar antes de beber");
		System.out.println("Nome: " + bebida1.getNome()
        + "\n" + "Valor: R$" + bebida1.getValor()
        + "\n" + "Ingredientes: " + bebida1.getIngredientes()
        + "\n" + "Modo de Preparo: " + bebida1.getModoDePreparo()
		+ "\n" + "Preparação da Bebida 1: " + bebida1.preparar() + "\n");
		
		BebidasProntas bebidaPronta1 = new BebidasProntas("Café Expresso", 4.0, "Quente");
		System.out.println("Nome: " + bebidaPronta1.getNome()
        + "\n" + "Valor: R$" + bebidaPronta1.getValor()
        + "\n" + "Tipo: " + bebidaPronta1.getTipo()
		+ "\n" + "Preparação da Bebida Pronta 1: " + bebidaPronta1.preparar() + "\n");
              
	}

}
