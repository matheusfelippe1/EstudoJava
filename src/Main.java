import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Alunos alunos = new Alunos();
		System.out.println(alunos.boletim());
		
		Professor professor = new Professor();
		System.out.println(professor.lancarNota());
		
		ArrayList<Pessoas> pessoas = new ArrayList<>();
		pessoas.add(professor);
		
		for(Pessoas p : pessoas) {
			System.out.println(p.lancarNota());
		}

	}

}