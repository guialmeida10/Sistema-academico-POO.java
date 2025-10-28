public class Modalidade {
    private String descricao;
    private Professor professor;
    private int quantVagas;
    private int horarioInicio;
    private int horarioFim;

    public Modalidade(){
        descricao = "";
        professor = new Professor();
        quantVagas = 0;
        horarioInicio = 0;
        horarioFim = 0;
    }

    public Modalidade(String descricao, int horarioInicio, int horarioFim){
        this.descricao = descricao;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        professor = new Professor();
        quantVagas = 0;
    }
    
    public String retornaModalidade(){
        return "Descricao: "+descricao+"\nHorario Inicio: "+horarioInicio+"\nHorario Fim: "+horarioFim + "\n"+professor.retornaProfessor();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getQuantVagas() {
        return quantVagas;
    }

    public void setQuantVagas(int quantVagas) {
        this.quantVagas = quantVagas;
    }

    public int getHorarioInicio() {
        return horarioInicio;
    }

    public void setHorarioInicio(int horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public int getHorarioFim() {
        return horarioFim;
    }

    public void setHorarioFim(int horarioFim) {
        this.horarioFim = horarioFim;
    }
}
