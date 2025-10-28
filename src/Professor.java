public class Professor {
    private String nome;
    private String titulacaoMaxima;
    private String graduacao;

    public Professor(){
        nome = "";
        titulacaoMaxima = "";
        graduacao = "";
    }

    public Professor(String nome, String titulacaoMaxima, String graduacao){
        this.nome = nome;
        this.titulacaoMaxima = titulacaoMaxima;
        this.graduacao = graduacao;
    }

    public String retornaProfessor(){
        return "Professor: "+nome+"\nTitulacao: "+titulacaoMaxima+"\nGraduacao: "+graduacao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTitulacaoMaxima() {
        return titulacaoMaxima;
    }

    public void setTitulacaoMaxima(String titulacaoMaxima) {
        this.titulacaoMaxima = titulacaoMaxima;
    }

    public String getGraduacao() {
        return graduacao;
    }

    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
 
    
}
