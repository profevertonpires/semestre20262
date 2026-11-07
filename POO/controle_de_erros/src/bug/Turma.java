package bug;
public class Turma {
	private Aluno alunos[];
	public void adicionarAluno(Aluno aluno, Integer posicao) {
		try {
			alunos[posicao] = aluno;	
		}catch(NullPointerException e) {
			System.out.println("Erro ao inserir aluno. "
					+ " Posicao ou aluno invalidos" );
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("A posicao do array é invalida" );
		}
	}
}
