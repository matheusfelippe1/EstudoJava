import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ImpressoraHp impressoraHp = new ImpressoraHp();
		System.out.println(impressoraHp.imprimir());
		
		ImpressoraBematec impressoraBematec = new ImpressoraBematec();
		//System.out.println(impressoraBematec.imprimirNotaFiscal());
		
		ImpressoraItauTec impressoraItauTec = new ImpressoraItauTec();
		//System.out.println(impressoraItauTec.imprimirNotaFiscal());
		
		ArrayList<Impressoras> impressoras = new ArrayList<>();
		impressoras.add(impressoraBematec);
		impressoras.add(impressoraItauTec);
		
		for(Impressoras p : impressoras) {
		System.out.println(p.imprimirNotaFiscal());
		}
	}

}
