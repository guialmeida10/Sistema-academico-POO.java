import java.util.ArrayList;

public class Turma {
    private ArrayList<Modalidade> modalidades;
    private ArrayList<Aluno> alunos;

    public Turma(){
        modalidades = new ArrayList<>();
        alunos = new ArrayList<>();
    }

    public void insereModalidades(Modalidade modalidade){
        modalidades.add(modalidade);
    }

    public void insereAluno(Aluno aluno){
        alunos.add(aluno);
    }

    public void excluirAluno(int posicao){
        alunos.remove(posicao);
    }

    public void imprimeTurma(){
       for(Aluno aluno : alunos){
            System.out.println(aluno.retornaAluno());

        }
        for(Modalidade modalidade : modalidades){
            System.out.println(modalidade.retornaModalidade());
        }
    }

    public ArrayList<Modalidade> getModalidades() {
        return modalidades;
    }

    public void setModalidades(ArrayList<Modalidade> modalidades) {
        this.modalidades = modalidades;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

}
