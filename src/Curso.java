import java.util.ArrayList;

public class Curso {
    private String endereco;
    private ArrayList<Turma> turmas;

    public Curso(String endereco){
        this.endereco = endereco;
        turmas = new ArrayList<>();
    }
    
    public void insereTurma(Turma turma){
        turmas.add(turma);
    }

    public void excluiTurma(int posicao){
        turmas.remove(posicao);
    }

    public void imprimeCurso(){
        System.out.println("Endereco " + endereco);
        for (int i = 0; i < turmas.size(); i++) {
            System.out.println("Turma " + i + ":");
            turmas.get(i).imprimeTurma();
        }
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }
}
