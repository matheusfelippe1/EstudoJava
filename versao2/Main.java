import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Produtos> produtos = new ArrayList<>();
		
		Pizza pizza1 = new Pizza("Margarita", 30.0, "Molho de tomate, queijo, manjericão", "Forno a 180 graus", 20.0);
		produtos.add(pizza1);
		
		
		Bebida bebida1 = new Bebida("Suco Natural", 8.0, "Frutas frescas, água", "Agitar antes de beber");
		produtos.add(bebida1);
		
		
		BebidasProntas bebidaPronta1 = new BebidasProntas("Café Expresso", 4.0, "Quente");
		produtos.add(bebidaPronta1);
		
		for(Produtos p : produtos) {
			System.out.println(p.preparar());
		}
              
	}

}